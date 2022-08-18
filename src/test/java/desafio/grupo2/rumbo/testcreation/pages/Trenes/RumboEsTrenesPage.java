package desafio.grupo2.rumbo.testcreation.pages.Trenes;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsTrenesPage extends SeleniumWrapper {

    public RumboEsTrenesPage (WebDriver driver){
        super(driver);
    }

    By btnsoloIda = By.xpath( "//div[@data-type=\"one_way\"]");
    By btnorigenTren = By.xpath( "(//div[@class=\"lmn-sw-select-responsive light custom-select-responsive\"])[1]");



    By btnDestinoTren = By.xpath("(//div[@class=\"select-selected\"])[2]");

    By btnCalendario = By.xpath("//div[@class=\"calendarBox lmn-sw-select-responsive lmn-sw-tooltip-responsive lmn-sw-tooltip-responsive__active\"]");

    By BotonBuscar = By.xpath("//div[@class=\"btn btn-cta btn-block lmn-sw-submitFlight\"]");

    public void seleccionarIda(){
        click(btnsoloIda);
    }
    public void ingresarOrigen(String Origen) throws InterruptedException {
        Thread.sleep(1000);
        click(btnorigenTren);
        Thread.sleep(1000);
        By origenmadrid =By.xpath("(//div[text()='Madrid'])[1]");
        click(origenmadrid);


    }
    public void ingresarDestino(String destino) throws InterruptedException {
        //click(btnDestinoTren);
        Thread.sleep(2000);
        switch(destino){
            case "Barcelona":
                By destinoBarcelona =By.xpath("(//div[text()='Barcelona'])[2]");
                click(destinoBarcelona);
                break;
            case "Valencia":
                By destinoValencia = By.xpath("(//div[text()='Valencia'])[2]");
                click(destinoValencia);
                break;
            case  "Málaga":
                By destinoMalaga =By.xpath("(//div[text()='Málaga'])[2]");
                click(destinoMalaga);
                break;

        }
    }
    public void seleccionarCalendario() throws InterruptedException {
        //click(btnCalendario);
        Thread.sleep(2000);
        By turnoTren = By.xpath("(//div[@class=\"timeSelectionBoxTitle\"][text()='Tarde'])[2]");
        click(turnoTren);
        By fechaTren =By.xpath("(//div[text()=\"24\"])[1]");
        click(fechaTren);
    }

    public void establecerBusqueda(){
        click(BotonBuscar);

    }

}
