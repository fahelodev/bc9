package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class RumboEsVuelosBusquedaPage extends SeleniumWrapper {
    public RumboEsVuelosBusquedaPage(WebDriver driver) {
        super(driver);
    }
    By filtroIberia = By.xpath("//span[text()=\"Iberia\"]");
    By verMasFiltrosEmpresas = By.xpath("//p[@class=\"providers-filter-view__toggle-others--open js-toggle-others\"]");




    public void seleccionarViaje() throws InterruptedException {
        click(filtroIberia);
        Thread.sleep(5000);
        click(verMasFiltrosEmpresas);
        click(filtroIberia);
        Thread.sleep(3000);
        By seleccionViaje = By.xpath("(//div[@class=\"FullTripCard__PaymentContainer-sc-z8znd4-3 bjAqvb\"])[1]");

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

}
