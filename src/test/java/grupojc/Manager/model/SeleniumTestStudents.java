package grupojc.Manager.model;

import java.util.List;
import static org.junit.Assert.*;
import java.util.Map;
import org.junit.Test;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTestStudents {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='#!/registerCareer']")
    @CacheLookup
    private WebElement agregarCarrera;

    @FindBy(css = "a[href='#!/registerStudent']")
    @CacheLookup
    private WebElement agregarEstudiante;

    @FindBy(css = "a[href='#!/studentsList']")
    @CacheLookup
    private WebElement estudiantes;

    @FindBy(css = "a.navbar-brand.ng-binding")
    @CacheLookup
    private WebElement home;

    private final String pageLoadedText = "";

    private final String pageUrl = "/#!/studentsList";

    public SeleniumTestStudents() {
    }

    public SeleniumTestStudents(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SeleniumTestStudents(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SeleniumTestStudents(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Agregar Carrera Link.
     *
     * @return the SeleniumTestStudents class instance.
     */
    @Test
    public SeleniumTestStudents clickAgregarCarreraLink() {
        agregarCarrera.click();
        return this;
    }

    /**
     * Click on Agregar Estudiante Link.
     *
     * @return the SeleniumTestStudents class instance.
     */
    @Test
    public SeleniumTestStudents clickAgregarEstudianteLink() {
        agregarEstudiante.click();
        return this;
    }

    /**
     * Click on Estudiantes Link.
     *
     * @return the SeleniumTestStudents class instance.
     */
    @Test
    public SeleniumTestStudents clickEstudiantesLink() {
        estudiantes.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the SeleniumTestStudents class instance.
     */
    @Test
    public SeleniumTestStudents clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the SeleniumTestStudents class instance.
     */
    @Test
    public SeleniumTestStudents verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the SeleniumTestStudents class instance.
     */
    @Test
    public SeleniumTestStudents verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}


