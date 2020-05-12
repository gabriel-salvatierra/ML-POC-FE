package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class PageObjectManager {

    private WebDriver driver;

    private LandingPage landingPage;
    private CategoriasPage categoriasPage;
    private ClimatizacionPage climatizacionPage;
    private SmartphonesPage smartphonesPage;
    private PerfumesPage perfumesPage;
    private IndustriaTextilPage industriaTextilPage;
    private CuartoBBPage cuartoBBPage;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPage() {
        return (landingPage == null) ? landingPage = new LandingPage(driver) : landingPage;
    }

    public CategoriasPage getCategoriasPage() {
        return (categoriasPage == null) ? categoriasPage = new CategoriasPage(driver) : categoriasPage;
    }

    public ClimatizacionPage getClimatizacionPage() {
        return (climatizacionPage == null) ? climatizacionPage = new ClimatizacionPage(driver) : climatizacionPage;
    }

    public SmartphonesPage getSmartphonesPage() {
        return (smartphonesPage == null) ? smartphonesPage = new SmartphonesPage(driver) : smartphonesPage;
    }

    public PerfumesPage getPerfumesPage() {
        return (perfumesPage == null) ? perfumesPage = new PerfumesPage(driver) : perfumesPage;
    }

    public IndustriaTextilPage getPIndustriaTextilPage() {
        return (industriaTextilPage == null) ? industriaTextilPage = new IndustriaTextilPage(driver) : industriaTextilPage;
    }

    public CuartoBBPage getCuartoBBPage() {
        return (cuartoBBPage == null) ? cuartoBBPage = new CuartoBBPage(driver) : cuartoBBPage;
    }

}
