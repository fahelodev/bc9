package desafio.grupo2.rumbo.testcreation.testcases.testTrenes;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;

import desafio.grupo2.rumbo.testcreation.pages.Trenes.RumboEsTrenesBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.Trenes.RumboEsTrenesPage;
import desafio.grupo2.rumbo.testcreation.pages.Trenes.RumboEsTrenesSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CP006_Trenes extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsTrenesPage rumboEsTrenesPage;
    RumboEsTrenesBusquedaPage rumboEsTrenesBusquedaPage;
    RumboEsTrenesSecurePage rumboEsTrenesSecurePage;

    @ParameterizedTest()
    @MethodSource
    @Description("Realizar el test CP006 del RF02")
    void CP006_PrecioTarifa(String Origen, String Destino) throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irATrenes();
        Thread.sleep(3000);
        rumboEsTrenesPage = new RumboEsTrenesPage(DriverFactory.getDriver());
        rumboEsTrenesPage.seleccionarIda();
        rumboEsTrenesPage.ingresarOrigen(Origen);
        rumboEsTrenesPage.ingresarDestino(Destino);
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
    static Stream<Arguments> CP006_PrecioTarifa(){
        return Stream.of(
                Arguments.arguments("Madrid","Barcelona")
        );
    }
}
