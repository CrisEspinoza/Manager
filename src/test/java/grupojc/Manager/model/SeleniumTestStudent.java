package grupojc.Manager.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTestStudent {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='#!/registerCareer']")
    @CacheLookup
    private WebElement agregarCarrera;

    @FindBy(css = "a[href='#!/registerStudent']")
    @CacheLookup
    private WebElement agregarEstudiante;

    @FindBy(css = "select.form-control.ng-pristine.ng-untouched.ng-valid.ng-not-empty")
    @CacheLookup
    private WebElement aoDeIngreso;

    @FindBy(css = "main div.ng-scope div.container.ng-scope div.row div.col-md-8.col-md-offset-2 form.ng-pristine.ng-valid div.panel.panel-default div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) input.form-control.ng-pristine.ng-untouched.ng-valid.ng-empty[type='text']")
    @CacheLookup
    private WebElement carrera1;

    @FindBy(css = "select.form-control.ng-pristine.ng-untouched.ng-valid.ng-empty")
    @CacheLookup
    private WebElement carrera2;

    @FindBy(name = "direccion")
    @CacheLookup
    private WebElement correoElectrnico;

    @FindBy(css = "a[href='#!/studentsList']")
    @CacheLookup
    private WebElement estudiantes;

    @FindBy(css = "a.navbar-brand.ng-binding")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "input.btn.btn-primary")
    @CacheLookup
    private WebElement ingresarInformacion;

    @FindBy(name = "name")
    @CacheLookup
    private WebElement nombre;

    private final String pageLoadedText = "";

    private final String pageUrl = "/#!/registerStudent";

    @FindBy(css = "main div.ng-scope div.container.ng-scope div.row div.col-md-8.col-md-offset-2 form.ng-pristine.ng-valid div.panel.panel-default div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) input.form-control.ng-pristine.ng-untouched.ng-valid.ng-empty[type='text']")
    @CacheLookup
    private WebElement rut;

    public SeleniumTestStudent() {
    }

    public SeleniumTestStudent(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SeleniumTestStudent(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SeleniumTestStudent(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Agregar Carrera Link.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent clickAgregarCarreraLink() {
        agregarCarrera.click();
        return this;
    }

    /**
     * Click on Agregar Estudiante Link.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent clickAgregarEstudianteLink() {
        agregarEstudiante.click();
        return this;
    }

    /**
     * Click on Estudiantes Link.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent clickEstudiantesLink() {
        estudiantes.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Ingresar Informacion Button.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent clickIngresarInformacionButton() {
        ingresarInformacion.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent fill() {
        setNombreTextField();
        setRutTextField();
        setCarrera1DropDownListField();
        setCorreoElectrnicoTextField();
        setAoDeIngresoDropDownListField();
        setCarrera2DropDownListField();
        return this;
    }

    /**
     * Set default value to Ao De Ingreso Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setAoDeIngresoDropDownListField() {
        return setAoDeIngresoDropDownListField(data.get("AO_DE_INGRESO"));
    }

    /**
     * Set value to Ao De Ingreso Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setAoDeIngresoDropDownListField(String aoDeIngresoValue) {
        new Select(aoDeIngreso).selectByVisibleText(aoDeIngresoValue);
        return this;
    }

    /**
     * Set default value to Carrera Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setCarrera1DropDownListField() {
        return setCarrera1DropDownListField(data.get("CARRERA_1"));
    }

    /**
     * Set value to Carrera Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setCarrera1DropDownListField(String carrera1Value) {
        carrera1.sendKeys(carrera1Value);
        return this;
    }

    /**
     * Set default value to Carrera Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setCarrera2DropDownListField() {
        return setCarrera2DropDownListField(data.get("CARRERA_2"));
    }

    /**
     * Set value to Carrera Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setCarrera2DropDownListField(String carrera2Value) {
        new Select(carrera2).selectByVisibleText(carrera2Value);
        return this;
    }

    /**
     * Set default value to Correo Electrnico Text field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setCorreoElectrnicoTextField() {
        return setCorreoElectrnicoTextField(data.get("CORREO_ELECTRNICO"));
    }

    /**
     * Set value to Correo Electrnico Text field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setCorreoElectrnicoTextField(String correoElectrnicoValue) {
        correoElectrnico.sendKeys(correoElectrnicoValue);
        return this;
    }

    /**
     * Set default value to Nombre Text field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setNombreTextField() {
        return setNombreTextField(data.get("NOMBRE"));
    }

    /**
     * Set value to Nombre Text field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setNombreTextField(String nombreValue) {
        nombre.sendKeys(nombreValue);
        return this;
    }

    /**
     * Set default value to Rut Text field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setRutTextField() {
        return setRutTextField(data.get("RUT"));
    }

    /**
     * Set value to Rut Text field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent setRutTextField(String rutValue) {
        rut.sendKeys(rutValue);
        return this;
    }

    /**
     * Unset default value from Ao De Ingreso Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent unsetAoDeIngresoDropDownListField() {
        return unsetAoDeIngresoDropDownListField(data.get("AO_DE_INGRESO"));
    }

    /**
     * Unset value from Ao De Ingreso Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent unsetAoDeIngresoDropDownListField(String aoDeIngresoValue) {
        new Select(aoDeIngreso).deselectByVisibleText(aoDeIngresoValue);
        return this;
    }

    /**
     * Unset default value from Carrera Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent unsetCarrera2DropDownListField() {
        return unsetCarrera2DropDownListField(data.get("CARRERA_2"));
    }

    /**
     * Unset value from Carrera Drop Down List field.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent unsetCarrera2DropDownListField(String carrera2Value) {
        new Select(carrera2).deselectByVisibleText(carrera2Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent verifyPageLoaded() {
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
     * @return the SeleniumTestStudent class instance.
     */
    @Test
    public SeleniumTestStudent verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}