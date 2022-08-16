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

    public void rellenarDatosPersonales(List<String> DatosPersonales){
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

        write(DatosPersonales.get(1),inputNombre);
        write(DatosPersonales.get(2),inputApellido);
        write(DatosPersonales.get(3),inputEmail);
        sendKeys(Keys.TAB,inputEmail);
        click(botonDesplegarPrefijos);
        click(codigoAreaArg);
        write(DatosPersonales.get(0),inputTelefono);
        sendKeys(Keys.TAB,inputTelefono);
        write(DatosPersonales.get(4),inputDireccionPostal);
        write(DatosPersonales.get(5),inputNumCalle);
        write(DatosPersonales.get(6),inputCodigoPostal);
        write(DatosPersonales.get(7),inputCiudad);
        click(botonDesplegarPais);
        By inputBuscarPais = By.xpath("//input[@class=\"search-box\"]");
        write(DatosPersonales.get(8),inputBuscarPais);
        sendKeys(Keys.ENTER,inputBuscarPais);
        //sendKeys(Keys.TAB,botonDesplegarPais);
        //click(paisArg);


    }


    public void rellenarQuienViaja(List<String> DatosPersonales){
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
        write(DatosPersonales.get(9),inputDiaNacimiento);
        click(botonDesplegarMeses);
        click(seleccionMesNacimiento);
        write(DatosPersonales.get(10),inputAnoNacimiento);

    }

    public void opcionesViaje(){
      By botonConEqupiaje = By.xpath("(//div[@data-testid=\"radio-wrapper\"])[1]");
      By botonSinEquipaje = By.xpath("(//div[@data-testid=\"radio-wrapper\"])[2]");
      By checkBoxProteger = By.xpath("//div[@class=\"checkbox\"]");
      By BotonSiguiente = By.xpath("//button[@class=\"btn btn-cta lead-generation-submit__btn \"]");

      click(botonConEqupiaje);
      click(checkBoxProteger);
      click(BotonSiguiente);
    }

    public void servicios(Boolean condicion){
        By radioButtonSinPlus = By.xpath("(//div[@class=\"radio radio--middle sc-fiKUUL cEpWax\"] )[2]");
        By radioButtonFullFlex = By.xpath("(//div[@class=\"radio radio--middle sc-fiKUUL cEpWax\"] )[1]");
        By botonSiguiente = By.xpath("//button[@class=\"btn btn-cta lead-generation-submit__btn \"]");


        if(condicion == true){
            click(radioButtonSinPlus);
            click(radioButtonFullFlex);
            click(botonSiguiente);
        }
        else{
            click(botonSiguiente);
        }

    }

    public void rellanarPago(List<String> DatosPersonales){
        By inputTitularTarjeta = By.xpath("//input[@data-test=\"input-creditCard.cardHolder\"]");
        By inputNumeroTarjeta = By.xpath("//input[@data-test=\"input-creditCard.cardNumber\"] ");
        By inputMesExpiracion = By.xpath("(//input[@data-test=\"input-creditCard.expirationDate\"])[1]");
        By inputAnoExpiracion = By.xpath("(//input[@data-test=\"input-creditCard.expirationDate\"])[2]");
        By inputCVV = By.xpath("//input[@data-test=\"input-creditCard.cvv\"]");

        write(DatosPersonales.get(11),inputTitularTarjeta);
        write(DatosPersonales.get(12),inputNumeroTarjeta);
        //write("11",inputMesExpiracion);
        //write("27",inputAnoExpiracion);
        //write("248",inputCVV);
    }

    public Boolean ActivacionDeReloj() {
        return findElements(By.xpath("//div[@class=\"panel-body expiry__panel-body\"]")).size() != 0;
    }

    public String datosInvalidos(){
        By telefonoInvalido = By.xpath("(//label[@class=\"form-elements-2__error-label  \"])[4]");
        return getText(telefonoInvalido);
    }

    public String numeroTarjetaInvalido() throws InterruptedException {
        By inputNumeroTarjeta = By.xpath("//input[@data-test=\"input-creditCard.cardNumber\"] ");
        sendKeys(Keys.TAB,inputNumeroTarjeta);
        By tarjetaInvalida = By.xpath("(//label[@class=\"form-elements-2__error-label  \"])[2]");
        //Thread.sleep(1000);
        return getText(tarjetaInvalida);
    }

    public String sinmienbroplus(){
        By noeleccion = By.xpath( "//div[@class=\"sc-jcRDWI cgxIDq\"]");
        return getText(noeleccion);
    }
}