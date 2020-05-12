package dataProvider;

import enums.DriverType;
import enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;
    private final String propertyFilePath = "config//Configuration.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getChromeDriverPath() {
        String driverPath = properties.getProperty("chromeDriverPath");
        if (driverPath != null) {
            return driverPath;
        } else {
            throw new RuntimeException("driverPath not specified in the Configuration.properties file");
        }
    }

    public String getGeckoDriverPath() {
        String driverPath = properties.getProperty("geckoDriverPath");
        if (driverPath != null) {
            return driverPath;
        } else {
            throw new RuntimeException("driverPath not specified in the Configuration.properties file");
        }
    }

    public String getSreenshotPath() {
        String screenshotPath = properties.getProperty("screenshotPath");
        if (screenshotPath != null) {
            return screenshotPath;
        } else {
            throw new RuntimeException("screenshotPath not specified in the Configuration.properties file");
        }
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) {
            try {
                return Long.parseLong(implicitlyWait);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
            }
        }
        return 30;
    }

    public long getPageLoadTimeout() {
        String pageLoadTimeout = properties.getProperty("pageLoadTimeout");
        if (pageLoadTimeout != null) {
            try {
                return Long.parseLong(pageLoadTimeout);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : " + pageLoadTimeout + " in to Long");
            }
        }
        return 30;
    }

    public String getApplicationURL() {
        String URL = properties.getProperty("URL");
        if (URL != null) {
            return URL;
        } else {
            throw new RuntimeException("Application URL not specified in the Configuration.properties file");
        }
    }

    public String getURLCategorias() {
        String URLLogin = properties.getProperty("URLCategorias");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("URLCategorias not specified in the Configuration.properties file");
        }
    }

    public String getURLCatClimatizacion() {
        String URLLogin = properties.getProperty("URLCatClimatizacion");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("URLCatClimatizacion not specified in the Configuration.properties file");
        }
    }

    public String getClimatizacionName() {
        String URLLogin = properties.getProperty("ClimatizacionName");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("ClimatizacionName not specified in the Configuration.properties file");
        }
    }

    public String getURLCatSmartphones() {
        String URLLogin = properties.getProperty("URLCatSmartphones");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("URLCatSmartphones not specified in the Configuration.properties file");
        }
    }

    public String getSmartphonesName() {
        String URLLogin = properties.getProperty("SmartphonesName");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("SmartphonesName not specified in the Configuration.properties file");
        }
    }

    public String getURLCatPerfumes() {
        String URLLogin = properties.getProperty("URLCatPerfumes");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("URLCatPerfumes not specified in the Configuration.properties file");
        }
    }

    public String getPerfumesName() {
        String URLLogin = properties.getProperty("PerfumesName");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("PerfumesName not specified in the Configuration.properties file");
        }
    }

    public String getURLCatIndTextil() {
        String URLLogin = properties.getProperty("URLCatIndTextil");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("URLCatIndTextil not specified in the Configuration.properties file");
        }
    }

    public String getIndTextilName() {
        String URLLogin = properties.getProperty("IndTextilName");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("IndTextilName not specified in the Configuration.properties file");
        }
    }

    public String getURLCatCuartoBB() {
        String URLLogin = properties.getProperty("URLCatCuartoBB");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("URLCatCuartoBB not specified in the Configuration.properties file");
        }
    }

    public String getCuartoBBName() {
        String URLLogin = properties.getProperty("CuartoBBName");
        if (URLLogin != null) {
            return URLLogin;
        } else {
            throw new RuntimeException("CuartoBBName not specified in the Configuration.properties file");
        }
    }


    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if (browserName == null || browserName.equalsIgnoreCase("chrome")) {
            return DriverType.CHROME;
        } else if (browserName.equalsIgnoreCase("firefox")) {
            return DriverType.FIREFOX;
        } else if (browserName.equalsIgnoreCase("iexplorer")) {
            return DriverType.INTERNETEXPLORER;
        } else if (browserName.equalsIgnoreCase("headless")) {
            return DriverType.HEADLESS;
        } else {
            throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
        }
    }

    public EnvironmentType getEnvironment() {
        String environmentName = properties.getProperty("environment");
        if (environmentName == null || environmentName.equalsIgnoreCase("local")) {
            return EnvironmentType.LOCAL;
        } else if (environmentName.equalsIgnoreCase("remote")) {
            return EnvironmentType.REMOTE;
        } else {
            throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
        }
    }

    public Boolean getBrowserWindowsSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if (windowSize != null) {
            return Boolean.valueOf(windowSize);
        } else {
            return true;
        }
    }

    public String getTestDataResourcePath() {
        String testDataResourcePath = properties.getProperty("testDataResourcePath");
        if (testDataResourcePath != null) {
            return testDataResourcePath;
        } else {
            throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
        }
    }

    public String getReportConfigPath() {
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if (reportConfigPath != null) return reportConfigPath;
        else
            throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}
