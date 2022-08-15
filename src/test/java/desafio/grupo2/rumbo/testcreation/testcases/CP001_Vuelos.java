package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboVuelosSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import gherkin.lexer.Ru;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CP001_Vuelos extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsVuelosPage rumboEsVuelosPage;

    RumboEsVuelosBusquedaPage rumboEsVuelosBusquedaPage;

    RumboVuelosSecurePage rumboVuelosSecurePage;

    @Test
    @Description("Test de prueba")
    void irARumbos() throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAVuelos();

        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo", rumboEsHomePage.getUrlTitle());

        rumboEsVuelosPage = new RumboEsVuelosPage(DriverFactory.getDriver());
        rumboEsVuelosPage.ingresarOrigen("Madrid");
        rumboEsVuelosPage.ingresarDestino("Lisboa");
        rumboEsVuelosPage.desplegarPasajeros();
        rumboEsVuelosPage.desplegarClases();
        rumboEsVuelosPage.establecerFechaViaje();
        rumboEsVuelosPage.buscarViaje();

        rumboEsVuelosBusquedaPage = new RumboEsVuelosBusquedaPage(DriverFactory.getDriver());
        rumboEsVuelosBusquedaPage.seleccionarViaje();

        rumboVuelosSecurePage = new RumboVuelosSecurePage(DriverFactory.getDriver());

        rumboVuelosSecurePage.elegirClassic();
        rumboVuelosSecurePage.rellenarDatosPersonales();
        rumboVuelosSecurePage.rellenarQuienViaja();
        rumboVuelosSecurePage.opcionesViaje();
        rumboVuelosSecurePage.servicios();
        rumboVuelosSecurePage.rellanarPago();


    }
}
