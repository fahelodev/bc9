package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Trenes extends SeleniumWrapper {

    public Trenes(WebDriver driver) {
        super(driver);
    }

    //---------LOCALIZADORES-----------

    By textAreaOrigen = By.xpath("//div[text()=\"Origen\"]");
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





    //----------METODOS-----------

    public void viajeEnTrenSinDestino(){
        click(textAreaOrigen);
        click(opcionOrigenACorunia);
        click(btnBuscar);
    }

    public String msjErrorDestino(){
        return getText(msjErrorSeleccionaDestino);
    }
}
