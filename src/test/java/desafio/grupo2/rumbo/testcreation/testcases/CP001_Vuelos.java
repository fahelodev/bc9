package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboVuelosSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.codehaus.groovy.ast.expr.BooleanExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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
       // rumboVuelosSecurePage.rellenarDatosPersonales();
        //rumboVuelosSecurePage.rellenarQuienViaja();
        rumboVuelosSecurePage.opcionesViaje();
        //umboVuelosSecurePage.servicios();
       // rumboVuelosSecurePage.rellanarPago();


    }

    @ParameterizedTest
    @MethodSource
   // @ValueSource(strings = {"MAD - FCO","MAD - LIS"})
    @Description("Realizando la prubea CP001 del RF01")
    void CP001_MultiplesVuelos(String origen,String destino,String esperado){
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAVuelos();

        rumboEsVuelosPage = new RumboEsVuelosPage(DriverFactory.getDriver());
        rumboEsVuelosPage.ingresarOrigen(origen);
        rumboEsVuelosPage.ingresarDestino(destino);
        rumboEsVuelosPage.desplegarPasajeros();
        rumboEsVuelosPage.desplegarClases();
        rumboEsVuelosPage.establecerFechaViaje();
        rumboEsVuelosPage.buscarViaje();

        rumboEsVuelosBusquedaPage = new RumboEsVuelosBusquedaPage(DriverFactory.getDriver());
        String resultado = rumboEsVuelosBusquedaPage.obtenerRutaOri() + " - " + rumboEsVuelosBusquedaPage.obtenerRutaDes();

        System.out.println(resultado);

        Assertions.assertEquals(esperado,resultado);

    }

    static Stream<Arguments> CP001_MultiplesVuelos(){
        return Stream.of(
                Arguments.arguments("Madrid", "Roma", "MAD - FCO"),
                Arguments.arguments("Madrid", "Lisboa", "MAD - LIS"),
                Arguments.arguments("Madrid", "Londres","MAD - LHR")
        );
    }

}
