package cucumber;

import cucumber.ScenarioContext;
import managers.PageObjectManager;
import managers.ScreenshotManager;
import managers.WebDriverManager;


public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private ScreenshotManager screenshotManager;
    public ScenarioContext scenarioContext;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        screenshotManager = new ScreenshotManager(webDriverManager.getDriver());
        scenarioContext = new ScenarioContext();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScreenshotManager getScreenshotManager() {
        return screenshotManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}
