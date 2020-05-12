package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Log;

public class LandingPage {

    WebDriver driver;
    Actions action;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.action = new Actions(driver);
    }

    @FindBy(css = "a[href='https://www.mercadolibre.com.ar/categorias#nav-header']")
    private WebElement categoriasMenuButton;

    @FindBy(css = "section[class='nav-categs-departments']")
    private WebElement sectionCategorias;

    // Categorias
    private WebElement verMasCategorias;
    private WebElement hogarYElecMenu;
    private WebElement tecnologiaMenu;
    private WebElement bellezaYCuidadoMenu;
    private WebElement herrEIndMenu;
    private WebElement jugYBebesMenu;

    // Subcategorias
    private WebElement climatizacionMenu;
    private WebElement celularesYSmartphonesMenu;
    private WebElement industriaTextilMenu;
    private WebElement cuartoDelBBMenu;

    public void clickCategoriasMenu() {
        categoriasMenuButton.click();
    }

    public Boolean isCatSectionDisplayed() {
        return sectionCategorias.isDisplayed();
    }

    // Ver mas Categorias
    public void clickVerMasCategorias() {
        verMasCategorias = driver.findElement(By.cssSelector("a[href='https://www.mercadolibre.com.ar/categorias#menu=categories']"));
        verMasCategorias.click();
    }

    // Hogar y Electrodomesticos
    public void hoverHogarYElect() {
        hogarYElecMenu = driver.findElement(By.xpath("//a[text()='Hogar y Electrodomésticos']"));
        action.moveToElement(hogarYElecMenu).perform();
    }

    public void clickClimatizacionMenu() {
        climatizacionMenu = driver.findElement(By.cssSelector("a[href='https://listado.mercadolibre.com.ar/electrodomesticos/climatizacion/#menu=categories']"));
        climatizacionMenu.click();
    }

    // Tecnologia
    public void hoverTecnologiaMenu() {
        tecnologiaMenu = driver.findElement(By.xpath("//a[text()='Tecnología']"));
        action.moveToElement(tecnologiaMenu).perform();
    }

    public void clickCelularesYSmartphonesMenu() {
        celularesYSmartphonesMenu = driver.findElement(By.cssSelector("a[href='https://celulares.mercadolibre.com.ar/#menu=categories']"));
        celularesYSmartphonesMenu.click();
    }

    // Herramientas e Industria
    public void hoverHerrEIndustria() {
        herrEIndMenu = driver.findElement(By.xpath("//a[text()='Herramientas e Industrias']"));
        action.moveToElement(herrEIndMenu).perform();
    }

    public void clickIndustriaTextilMenu() {
        industriaTextilMenu = driver.findElement(By.cssSelector("a[href='https://listado.mercadolibre.com.ar/industrias-oficinas/industria-textil/#menu=categories']"));
        industriaTextilMenu.click();
    }

    // Juguetes y Bebes
    public void hoverJuguetesyBebes() {
        jugYBebesMenu = driver.findElement(By.xpath("//a[text()='Juguetes y Bebés']"));
        action.moveToElement(jugYBebesMenu).perform();
    }

    public void clickCuartoDelBBMenu() {
        cuartoDelBBMenu = driver.findElement(By.cssSelector("a[href='https://listado.mercadolibre.com.ar/bebes/cuarto/#menu=categories']"));
        cuartoDelBBMenu.click();
    }
}
