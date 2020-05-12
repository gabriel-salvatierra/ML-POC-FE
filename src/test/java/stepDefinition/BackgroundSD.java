package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.ScreenshotManager;
import org.junit.Assert;
import pageObjects.LandingPage;
import utility.Log;

public class BackgroundSD {

    TestContext testContext;
    LandingPage landingPage;

    ConfigFileReader configFileReader = FileReaderManager.getInstance().getConfigReader();
    PageObjectManager pageObjectManager;
    ScreenshotManager screenshotManager;


    String URLLandingPage = configFileReader.getApplicationURL();

    public BackgroundSD(TestContext testContext) {
        this.testContext = testContext;
        this.pageObjectManager = testContext.getPageObjectManager();
        this.screenshotManager = testContext.getScreenshotManager();

    }

    @Given("navego hasta la landing page")
    public void navego_hasta_la_landing_page() {
        Log.debug("GIVEN navego hasta la landing page - No actions");
        landingPage = pageObjectManager.getLandingPage();
    }

    @When("selecciono en el menu de categorias")
    public void selecciono_en_el_menu_de_categorias() {
        Log.debug("WHEN selecciono en el menu de categorias");
        landingPage.clickCategoriasMenu();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("se despliegan las categorias")
    public void se_despliegan_las_categorias() {
        Log.debug("THEN se despliegan las categorias");
        Boolean auxCatSectionDisplayed = landingPage.isCatSectionDisplayed();
        Log.info("ASSERT: categorias section displayed (expected)true vs (actual)" + auxCatSectionDisplayed);
        screenshotManager.takeScreenshot("desplega cat menu");
        Assert.assertTrue(auxCatSectionDisplayed);
    }

}
