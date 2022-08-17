package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class Trenes extends SeleniumWrapper {

    public Trenes(WebDriver driver) {
        super(driver);
    }

    //---------LOCALIZADORES-----------
    By btnAceptarCokies = By.xpath("//button[@data-qa='oil-YesButton']");  /*btn cook hacer click*/
    By btnTrenes = By.xpath("(//li/div/a[@title=\"Trenes\"])[1]");
    By textAreaOrigen = By.xpath("//div[text()=\"Origen\"]");
    By origen= By.xpath("(//div[@class=\"lmn-sw-select-responsive light custom-select-responsive\"])[1]");
    By destino= By.xpath("(//div[@class=\"lmn-sw-custom-select left-icon\"])[2]");
    By opcionOrigenACorunia = By.xpath("//div[@data-value=\"YJC\"]");
    By btnBuscar = By.xpath("(//div[@tabindex='1'])[2]");
    By msjErrorSeleccionaDestino = By.xpath("//div[@class=\"validation-error__content\"])[2]");
    By btnTrenesMenu= By. xpath("(//a[@title=\"Trenes\"])[1]");
    By btnIdayVuelta= By.xpath("//div[@data-type=\"round_trip\"]");
    By btnIdaSolo= By.xpath("//div[@data-type=\"one_way\"]");
    By opcionOrigenAlicante= By.xpath("//div[@data-value=\"YJE\"]");
    By textAreaDestino= By.xpath("//div[text()=\"Destino\"]");
    By opcionDestinoMadrid= By.xpath("(//div[@data-value=\"MAD\"])[2]");
    By calendarioIzq= By.xpath("(//div[@class=\"timeBox\"])[1]");
    By calendarioDer= By.xpath("(//div[@class=\"timeBox\"])[2]");
    By fechaIda= By.xpath("(//div[text()='22'])[1]");
    By fechaVuelta= By.xpath("(//div[text()='24'])[1]");
    By listaPasajero= By.xpath("//div[@class=\"lmn-sw-passengersContainer\"]");
    By btnBuscarTren= By.xpath("//div[@class=\"lmn-sw-submitFlightContainer\"]");
    By ordenarMenorPrecio= By.xpath("(//ul[@role=\"tablist\"])[2]/descendant::li[@data-value=\"price.asc\"]");
    By leerMasOfertasAve= By.xpath("(//div[@class=\"more-label\"])[1]");
    By leerMasFuncionaRumbo = By.xpath("(//div[@class=\"more-label\"])[2]");
    By ofertasRenfe= By.xpath("(//div[@class=\"display-1aslju6-HubFeatureCard-styled e1apqt34\"])[1]");
    By textoErrorTren= By.xpath("//span[@id=\"noResultsText\"]");
    By primerViernes= By.xpath("(//div[text()='26'])[1]");





    //----------METODOS-----------

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }
    public void aceptarCookies(){
        click(btnAceptarCokies);
    }
    public void seccionTrenes(){
        click(btnTrenes);
    }

    public void viajeEnTrenSinDestino(){
        esperaEnSegundosYClick(3,btnTrenes);
       esperaEnSegundosYClick(5,textAreaOrigen);
        esperaEnSegundosYClick(5,opcionOrigenACorunia);
        click(btnBuscar);
    }

    public String msjErrorDestino(){
        return getText(msjErrorSeleccionaDestino);
    }


    public void viajeTrenFiltro() throws InterruptedException {
        esperaEnSegundosYClick(5,textAreaOrigen);
        click(textAreaOrigen);
        esperaEnSegundosYClick(5,opcionOrigenAlicante);
        esperaEnSegundosYClick(8,opcionDestinoMadrid);
        esperaEnSegundosYClick(3,calendarioIzq);
        esperaEnSegundosYClick(2,fechaIda);
        esperaEnSegundosYClick(2,fechaVuelta);
        click(btnBuscarTren);
        esperaEnSegundosYClick(10,ordenarMenorPrecio);




    }
}
