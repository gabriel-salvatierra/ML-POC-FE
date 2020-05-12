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
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import utility.Log;

public class CategoriasSD {

    TestContext testContext;
    LandingPage landingPage;
    CategoriasPage categoriasPage;
    ClimatizacionPage climatizacionPage;
    SmartphonesPage smartphonesPage;
    PerfumesPage perfumesPage;
    IndustriaTextilPage industriaTextilPage;
    CuartoBBPage cuartoBBPage;

    ConfigFileReader configFileReader = FileReaderManager.getInstance().getConfigReader();
    WebDriver driver;
    PageObjectManager pageObjectManager;
    ScreenshotManager screenshotManager;

    String currentURL;
    String URLMasCategorias = configFileReader.getURLCategorias();
    String URLClimatizaciones = configFileReader.getURLCatClimatizacion();
    String URLSmartphones = configFileReader.getURLCatSmartphones();

    public CategoriasSD(TestContext testContext) {
        this.testContext = testContext;
        this.driver = testContext.getWebDriverManager().getDriver();
        this.pageObjectManager = testContext.getPageObjectManager();
        this.screenshotManager = testContext.getScreenshotManager();
        landingPage = pageObjectManager.getLandingPage();
    }

    @Given("las categorias estan desplegadas")
    public void las_categorias_estan_desplegadas() {
        Log.debug("GIVEN las categorias estan desplegadas - No actions");
    }

    @When("selecciono Ver más categorias")
    public void selecciono_Ver_más_categorias() {
        Log.debug("WHEN selecciono Ver más categorias");
        landingPage.clickVerMasCategorias();
    }

    @Then("se muestra la pantalla de Categorias")
    public void se_muestra_la_pantalla_de_Categorias() {
        Log.debug("THEN se muestra la pantalla de Categorias");
        categoriasPage = pageObjectManager.getCategoriasPage();
        currentURL = driver.getCurrentUrl();
        Boolean validateURL = currentURL.equalsIgnoreCase(URLMasCategorias);
        Log.debug(currentURL + " currentURL");
        Log.debug(URLMasCategorias + " URLMasCategorias");
        Log.info("ASSERT validacion URL categorias (esperado)true vs (actual)" + validateURL);
        screenshotManager.takeScreenshot("Categorias page");
        Assert.assertTrue(validateURL);
    }

    @When("selecciono dentro de Belleza y cuidado personal {string}")
    public void selecciono_dentro_de_Belleza_y_cuidado_personal(String subcategoria) {
        Log.debug("WHEN selecciono dentro de Belleza y cuidado personal " + subcategoria);
        categoriasPage.clickPerfumesLink();
    }

    @When("selecciono dentro de Hogar y Electrodomesticos {string}")
    public void selecciono_dentro_de_Hogar_y_Electrodomesticos(String subcategoria) {
        Log.debug("WHEN selecciono dentro de Hogar y Electrodomesticos " + subcategoria);
        landingPage.hoverHogarYElect();
        switch (subcategoria) {
            case "Climatización":
                landingPage.clickClimatizacionMenu();
                break;
        }
    }

    @When("selecciono dentro de Tecnologia {string}")
    public void selecciono_dentro_de_Tecnologia(String subcategoria) {
        Log.debug("WHEN selecciono dentro de Tecnologia " + subcategoria);
        landingPage.hoverTecnologiaMenu();
        switch (subcategoria) {
            case "Celulares y Smartphones":
                landingPage.clickCelularesYSmartphonesMenu();
                break;
        }
    }

    @When("selecciono dentro de Herramientas e Industrias {string}")
    public void selecciono_dentro_de_Herramientas_e_Industrias(String subcategoria) {
        Log.info("selecciono dentro de Herramientas e Industria " + subcategoria);
        landingPage.hoverHerrEIndustria();
        switch (subcategoria) {
            case "Industria Textil":
                landingPage.clickIndustriaTextilMenu();
                break;
        }
    }

    @When("selecciono dentro de Juguetes y Bebes {string}")
    public void selecciono_dentro_de_Juguetes_y_Bebes(String subcategoria) {
        Log.info("selecciono dentro de Juguetes y Bebes " + subcategoria);
        landingPage.hoverJuguetesyBebes();
        switch (subcategoria) {
            case "Cuarto del Bebé":
                landingPage.clickCuartoDelBBMenu();
                break;
        }
    }

    @Then("se muestran los resultados para la seleccion de {string}")
    public void se_muestran_los_resultados_para_la_seleccion_de(String subcategoria) {
        Log.debug("THEN se muestran los resultados para la seleccion de " + subcategoria);
        Boolean infoDisplayed = false;
        Boolean validateText = false;
        switch (subcategoria) {
            case "Climatización":
                climatizacionPage = pageObjectManager.getClimatizacionPage();
                infoDisplayed = climatizacionPage.validateQuantity() && climatizacionPage.validateTitle();
                validateText = climatizacionPage.validateTitleText(subcategoria);
                Log.info("ASSERT: validaciones resultados busqueda (expected)true vs (actual)" + infoDisplayed);
                Log.info("ASSERT: validacion texto resultados (expected)true vs (actual)" + validateText);
                break;
            case "Celulares y Smartphones":
                smartphonesPage = pageObjectManager.getSmartphonesPage();
                infoDisplayed = smartphonesPage.validateQuantity() && smartphonesPage.validateTitle();
                validateText = smartphonesPage.validateTitleText(subcategoria);
                Log.info("ASSERT: validaciones resultados busqueda (expected)true vs (actual)" + infoDisplayed);
                Log.info("ASSERT: validacion texto resultados (expected)true vs (actual)" + validateText);
                break;
            case "Perfumes":
                perfumesPage = pageObjectManager.getPerfumesPage();
                infoDisplayed = perfumesPage.validateQuantity() && perfumesPage.validateTitle();
                validateText = perfumesPage.validateTitleText(subcategoria);
                Log.info("ASSERT: validaciones resultados busqueda (expected)true vs (actual)" + infoDisplayed);
                Log.info("ASSERT: validacion texto resultados (expected)true vs (actual)" + validateText);
                break;
            case "Industria Textil":
                industriaTextilPage = pageObjectManager.getPIndustriaTextilPage();
                infoDisplayed = industriaTextilPage.validateQuantity() && industriaTextilPage.validateTitle();
                validateText = industriaTextilPage.validateTitleText(subcategoria);
                Log.info("ASSERT: validaciones resultados busqueda (expected)true vs (actual)" + infoDisplayed);
                Log.info("ASSERT: validacion texto resultados (expected)true vs (actual)" + validateText);
                break;
            case "Cuarto del Bebé":
                cuartoBBPage = pageObjectManager.getCuartoBBPage();
                infoDisplayed = cuartoBBPage.validateQuantity() && cuartoBBPage.validateTitle();
                validateText = cuartoBBPage.validateTitleText(subcategoria);
                Log.info("ASSERT: validaciones resultados busqueda (expected)true vs (actual)" + infoDisplayed);
                Log.info("ASSERT: validacion texto resultados (expected)true vs (actual)" + validateText);
                break;
        }
        screenshotManager.takeScreenshot("validaciones " + subcategoria);
        Assert.assertTrue(infoDisplayed && validateText);
    }

}
