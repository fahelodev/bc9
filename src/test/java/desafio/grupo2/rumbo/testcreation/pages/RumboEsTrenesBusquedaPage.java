package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class RumboEsTrenesBusquedaPage extends SeleniumWrapper{


    public RumboEsTrenesBusquedaPage(WebDriver driver) {
        super(driver);
    }
    By filtroDeDuracion = By.xpath("(//div[@class=\"noUi-handle noUi-handle-lower btn btn-default\"])[2]");

    public void seleccionarViaje() throws InterruptedException {
        //Thread.sleep(5000);
        By seleccionViaje = By.xpath("(//div[@class=\"FullTripCard__PaymentContainer-sc-z8znd4-3 huUwCE\"])[1]");
        click(seleccionViaje);
    }

    public String obtenerRutaOri(){
        By origen = By.xpath("(//span[@class=\"DepartureArrivalLocations__LocationCodeStyled-sc-jx2i6c-1 jruFvB Tooltip___StyledMuiTooltip-sc-ya8k7d-3 jAgUJM\"])[1]");
        return getText(origen);

    }
    public String obtenerRutaDes(){
        By destino = By.xpath("(//span[@class=\"DepartureArrivalLocations__LocationCodeStyled-sc-jx2i6c-1 jruFvB Tooltip___StyledMuiTooltip-sc-ya8k7d-3 jAgUJM\"])[2]");
        return getText(destino);

    }

    public void duracionmenor() throws InterruptedException {
        //click(filtroDeDuracion);
        Mover(filtroDeDuracion);
        Thread.sleep(5000);
        //By btndeslisar = By.xpath("//div[@aria-valuetext=\"180.00\"]");
        //click(btndeslisar);

    }
}
