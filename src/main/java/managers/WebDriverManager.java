package managers;

import enums.DriverType;
import enums.EnvironmentType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utility.Log;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {

    private WebDriver driver;
    private static DriverType driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
    private static EnvironmentType environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String GECKO_DRIVER_PROPERTY = "webdriver.gecko.driver";

    public WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    private WebDriver createDriver() {
        switch (environmentType) {
            case LOCAL:
                driver = createLocalDriver();
                break;
            case REMOTE:
                driver = createRemoteDriver();
                break;
        }
        return driver;
    }

    private WebDriver createRemoteDriver() {
        throw new RuntimeException("RemoteWebDriver is not implemented yet");
    }

    private WebDriver createLocalDriver() {
        ChromeOptions options = new ChromeOptions();
        switch (driverType) {
            case FIREFOX:
                System.setProperty(GECKO_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getGeckoDriverPath());
                driver = new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getChromeDriverPath());
                options.addArguments("--disable-web-security", "--ignore-certificate-errors", "--allow-running-insecure-content", "--allow-insecure-localhost", "--no-sandbox");
                driver = new ChromeDriver(options);
                break;
            case INTERNETEXPLORER:
                driver = new InternetExplorerDriver();
                break;
            case HEADLESS:
                System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getChromeDriverPath());
                options.addArguments("window-size=1600,900");
                options.addArguments("--disable-web-security");
                options.addArguments("--disable-gpu");
                options.addArguments("--disable-extensions");
                options.setExperimentalOption("useAutomationExtension", false);
                options.addArguments("--ignore-certificate-errors");
                options.addArguments("--allow-running-insecure-content");
                options.addArguments("--allow-insecure-localhost");
                options.addArguments("--proxy-server='direct://'");
                options.addArguments("--proxy-bypass-list=*");
                options.addArguments("--start-maximized");
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
/*              DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setPlatform(Platform.getCurrent());
                capabilities.setJavascriptEnabled(true);
                capabilities.setBrowserName("htmlunit");
                capabilities.setVersion(BrowserType.CHROME);
                capabilities.setAcceptInsecureCerts(true);
                driver = new HtmlUnitDriver(capabilities);*/
                break;
        }
        if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowsSize()) {
            driver.manage().window().maximize();
            Log.info("Se maximiza el navegador");
        }
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(FileReaderManager.getInstance().getConfigReader().getPageLoadTimeout(), TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationURL());
        driver.navigate().refresh();
        Log.info("Se carga la URL " + FileReaderManager.getInstance().getConfigReader().getApplicationURL());
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
