package desafio.grupo2.rumbo.testcreation.pages;

import com.github.javafaker.Bool;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RumboVuelosSecurePage extends SeleniumWrapper {
    public RumboVuelosSecurePage(WebDriver driver) {
        super(driver);
    }

    By botonElegirClassic = By.xpath("//div[text()=\"Elegir Classic\"]");



    public void elegirClassic(){
        click(botonElegirClassic);
    }

    public void rellenarDatosPersonales(String numero){
        By inputNombre = By.xpath("//input[@data-test=\"input-name\"]");
        By inputApellido = By.xpath("//input[@data-test=\"input-surname\"]");
        By inputEmail= By.xpath("//input[@id=\"contact-email\"]");
        By botonDesplegarPrefijos = By.xpath("//div[@class=\"selected-flag\"]");
        By codigoAreaArg = By.xpath("//li[@data-country-code=\"ar\"]");
        By inputTelefono = By.xpath("//input[@data-test=\"input-phone\"]");
        By inputDireccionPostal = By.xpath("//input[@data-test=\"input-address\"]");
        By inputNumCalle= By.xpath("//input[@data-test=\"input-houseNumber\"]");
        By inputCodigoPostal = By.xpath("//input[@data-test=\"input-postCode\"]");
        By inputCiudad = By.xpath("//input[@data-test=\"input-city\"]");
        By botonDesplegarPais= By.xpath("//div[@class=\"form-control text-input flag-dropdown\"]");
        By paisArg = By.xpath("//li[@data-flag-key=\"flag_no_13\"]");

        write("Lucas",inputNombre);
        write("Gonzalez",inputApellido);
        write("lucasgonz98@g",inputEmail);
        sendKeys(Keys.TAB,inputEmail);
        click(botonDesplegarPrefijos);
        click(codigoAreaArg);
        write(numero,inputTelefono);
        sendKeys(Keys.TAB,inputTelefono);
        write("Felipe II",inputDireccionPostal);
        write("125",inputNumCalle);
        write("5300",inputCodigoPostal);
        write("La Rioja",inputCiudad);
        click(botonDesplegarPais);
        By inputBuscarPais = By.xpath("//input[@class=\"search-box\"]");
        write("Argentina",inputBuscarPais);
        sendKeys(Keys.ENTER,inputBuscarPais);
        //sendKeys(Keys.TAB,botonDesplegarPais);
        //click(paisArg);


    }


    public void rellenarQuienViaja(){
        By botonSr = By.xpath("(//div[@class=\"radio radio--middle \"])[1]");
        By inputNom = By.xpath("//input[@data-test=\"input-groups.1.travellers.1.name\"] ");
        By inputApe= By.xpath("//input[@data-test=\"input-groups.1.travellers.1.surname\"]");
        By inputDiaNacimiento = By.xpath("//input[@data-test=\"input-groups.1.travellers.1.dateOfBirth-day\"] ");
        By botonDesplegarMeses = By.xpath("//select[@class=\"form-control select-input date__field\"]");
        By seleccionMesNacimiento= By.xpath("//option[@value=\"11\"]");
        By inputAnoNacimiento = By.xpath("//input[@data-test=\"input-groups.1.travellers.1.dateOfBirth-year\"]");
        click(botonSr);
/*        write("Lucas",inputNom);
        write("Gonzalez",inputApe);*/
        write("09",inputDiaNacimiento);
        click(botonDesplegarMeses);
        click(seleccionMesNacimiento);
        write("1998",inputAnoNacimiento);

    }

    public void opcionesViaje(){
      By botonConEqupiaje = By.xpath("//div[@data-test=\"quick-selection-card\"]");
      By botonSinEquipaje = By.xpath("(//div[@class=\"radio radio--middle \"])[2]");
      By checkBoxProteger = By.xpath("//div[@class=\"checkbox\"]");
      By BotonSiguiente = By.xpath("//button[@class=\"btn btn-cta lead-generation-submit__btn \"]");

      click(botonConEqupiaje);
      click(checkBoxProteger);
      click(BotonSiguiente);
    }

    public void servicios(){
        By radioButtonSinPlus = By.xpath("(//div[@class=\"radio radio--middle sc-fiKUUL cEpWax\"] )[2]");
        By radioButtonFullFlex = By.xpath("(//div[@class=\"radio radio--middle sc-fiKUUL cEpWax\"] )[1]");
        By botonSiguiente = By.xpath("//button[@class=\"btn btn-cta lead-generation-submit__btn \"]");

        click(radioButtonSinPlus);
        click(radioButtonFullFlex);
        click(botonSiguiente);
    }

    public void rellanarPago(){
        By inputTitularTarjeta = By.xpath("//input[@data-test=\"input-creditCard.cardHolder\"]");
        By inputNumeroTarjeta = By.xpath("//input[@data-test=\"input-creditCard.cardNumber\"] ");
        By inputMesExpiracion = By.xpath("(//input[@data-test=\"input-creditCard.expirationDate\"])[1]");
        By inputAnoExpiracion = By.xpath("(//input[@data-test=\"input-creditCard.expirationDate\"])[2]");
        By inputCVV = By.xpath("//input[@data-test=\"input-creditCard.cvv\"]");

        write("Lucas",inputTitularTarjeta);
        write("125785",inputNumeroTarjeta);
        write("11",inputMesExpiracion);
        write("27",inputAnoExpiracion);
        write("248",inputCVV);
    }

    public Boolean ActivacionDeReloj() {
        return findElements(By.xpath("//div[@class=\"panel-body expiry__panel-body\"]")).size() != 0;
    }

    public String datosInvalidos(){
        By telefonoInvalido = By.xpath("(//label[@class=\"form-elements-2__error-label  \"])[4]");
        return getText(telefonoInvalido);
    }
}