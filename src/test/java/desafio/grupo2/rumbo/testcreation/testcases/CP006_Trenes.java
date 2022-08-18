package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsTrenesBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsTrenesPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsTrenesSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CP006_Trenes extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsTrenesPage rumboEsTrenesPage;
    RumboEsTrenesBusquedaPage rumboEsTrenesBusquedaPage;
    RumboEsTrenesSecurePage rumboEsTrenesSecurePage;

    @Test
    @Description("Realizar el test CP006 del RF02")
    void CP006_PrecioTarifa() throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irATrenes();
        Thread.sleep(3000);
        rumboEsTrenesPage = new RumboEsTrenesPage(DriverFactory.getDriver());
        rumboEsTrenesPage.seleccionarIda();
        rumboEsTrenesPage.ingresarOrigen("Madrid");
        rumboEsTrenesPage.ingresarDestino("Barcelona");
        rumboEsTrenesPage.seleccionarCalendario();
        rumboEsTrenesPage.establecerBusqueda();

        rumboEsTrenesBusquedaPage = new RumboEsTrenesBusquedaPage(DriverFactory.getDriver());
        String precioInicial = rumboEsTrenesBusquedaPage.precioTarifaInicial();
        String Inicial = rumboEsTrenesBusquedaPage.nroInicialString(precioInicial);
        rumboEsTrenesBusquedaPage.seleccionarViaje();
        Thread.sleep(5000);
        rumboEsTrenesSecurePage = new RumboEsTrenesSecurePage(DriverFactory.getDriver());
        double aumento = rumboEsTrenesSecurePage.cantidadAumento();
        String precioFinal = rumboEsTrenesSecurePage.tarifaDetalle();
        String precioFinalSinAumento = rumboEsTrenesSecurePage.restarAumento(precioFinal, aumento);

        Assertions.assertEquals(Inicial,precioFinalSinAumento);



    }

}
