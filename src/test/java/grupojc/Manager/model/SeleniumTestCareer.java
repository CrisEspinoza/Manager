package grupojc.Manager.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTestCareer {

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='#!/registerCareer']")
    @CacheLookup
    private WebElement agregarCarrera;

    @FindBy(css = "a[href='#!/registerStudent']")
    @CacheLookup
    private WebElement agregarEstudiante;

    @FindBy(name = "name")
    @CacheLookup
    private WebElement carrera;

    @FindBy(css = "a[href='#!/studentsList']")
    @CacheLookup
    private WebElement estudiantes;

    @FindBy(css = "a.navbar-brand.ng-binding")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "input.btn.btn-primary")
    @CacheLookup
    private WebElement ingresarInformacion;

    private final String pageLoadedText = "";

    private final String pageUrl = "/#!/registerCareer";

    public SeleniumTestCareer() {
    }

    public SeleniumTestCareer(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SeleniumTestCareer(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SeleniumTestCareer(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Agregar Carrera Link.
     *
     * @return the SeleniumTestCareer class instance.
     */
    @Test
    public SeleniumTestCareer clickAgregarCarreraLink() {
        agregarCarrera.click();
        return this;
    }

}
