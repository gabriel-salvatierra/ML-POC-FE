package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndustriaTextilPage {

    WebDriver driver;

    public IndustriaTextilPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class='breadcrumb__title']")
    private WebElement categoryTitle;

    @FindBy(css = "div[class='quantity-results']")
    private WebElement categoryQuantity;

    public Boolean validateTitle() {
        return categoryTitle.isDisplayed();
    }

    public Boolean validateQuantity() {
        return categoryQuantity.isDisplayed();
    }

    public Boolean validateTitleText(String expected) {
        return categoryTitle.getText().equalsIgnoreCase(expected);
    }
}
