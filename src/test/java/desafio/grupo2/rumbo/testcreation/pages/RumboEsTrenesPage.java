package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsTrenesPage extends SeleniumWrapper {

    public RumboEsTrenesPage (WebDriver driver){
        super(driver);
    }

    By btnsoloIda = By.xpath( "//div[@class='trainSwitch trainOneWay active']");
    By btnorigenTren = By.xpath( "//div[@class=\"select-selected focus\"]");

    By btnDestinoTren = By.xpath("//div[@class=\"select-selected focus\"][1]");
    By btnCalendario = By.xpath("//div[@class=\"calendarBox lmn-sw-select-responsive lmn-sw-tooltip-responsive lmn-sw-tooltip-responsive__active\"]");


    By BotonBuscar = By.xpath("//div[@class=\"btn btn-cta btn-block lmn-sw-submitFlight\"]");

    public void seleccionarIda(){
        click(btnsoloIda);
    }
    public void ingresarOrigen(){
        click(btnorigenTren);
        By origenmadrid =By.xpath("//div[@data-value=\"MAD\"][@class=\"same-as-selected\"]");
        click(origenmadrid);
    }
    public void ingresarDestino(){
        click(btnorigenTren);
        By destinoBarcelona =By.xpath("//div[@data-value=\"YJB\"][@class=\"same-as-selected\"]");
        click(destinoBarcelona);
    }
    public void seleccionarCalendario(){
        click(btnCalendario);
        By turnoTren = By.xpath("//div[@class=\"timeSelectionBoxTitle\"][text()='Tarde']");
        click(turnoTren);
        By fechaTren =By.xpath("//div[@class=\"calendarBoxText lmn-sw-responsive-form-field lmn-sw-tooltip-responsive__text\"][text()=\"Mié, 24 Ago\"]");
        click(fechaTren);
    }
    public void establecerBusqueda(){
        click(BotonBuscar);

    }

}
