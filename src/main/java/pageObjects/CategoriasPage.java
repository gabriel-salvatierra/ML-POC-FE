package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriasPage {
    WebDriver driver;

    public CategoriasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='https://listado.mercadolibre.com.ar/belleza-y-cuidado-personal/perfumes/']")
    private WebElement perfumesLink;

    public void clickPerfumesLink() {
        perfumesLink.click();
    }

}
