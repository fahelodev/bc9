package desafio.grupo2.rumbo.testcreation.testcases.testVuelos;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.Vuelos.RumboEsVuelosBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.Vuelos.RumboEsVuelosPage;
import desafio.grupo2.rumbo.testcreation.pages.Vuelos.RumboVuelosSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CP003_Vuelos extends SeleniumTestBase {
    RumboEsHomePage rumboEsHomePage;
    RumboEsVuelosPage rumboEsVuelosPage;

    RumboEsVuelosBusquedaPage rumboEsVuelosBusquedaPage;

    RumboVuelosSecurePage rumboVuelosSecurePage;
    @ParameterizedTest
    @MethodSource
    @Description("Realizando la prubea CP003 del RF01")

    void CP003_TiempoDeReservaVuelo(String origen,String destino) throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAVuelos();

        rumboEsVuelosPage = new RumboEsVuelosPage(DriverFactory.getDriver());
        rumboEsVuelosPage.ingresarOrigen(origen);
        rumboEsVuelosPage.ingresarDestino(destino);
        rumboEsVuelosPage.establecerFechaViaje();
        rumboEsVuelosPage.desplegarPasajeros();
        rumboEsVuelosPage.desplegarClases();
        rumboEsVuelosPage.buscarViaje();

        rumboEsVuelosBusquedaPage = new RumboEsVuelosBusquedaPage(DriverFactory.getDriver());
        rumboEsVuelosBusquedaPage.seleccionarViaje();

        rumboVuelosSecurePage = new RumboVuelosSecurePage(DriverFactory.getDriver());

        rumboVuelosSecurePage.elegirClassic();
        Boolean resultado = rumboVuelosSecurePage.ActivacionDeReloj();
        Assertions.assertTrue(resultado);
    }

    static Stream<Arguments> CP003_TiempoDeReservaVuelo(){
        return Stream.of(
                Arguments.arguments("Madrid", "Roma"),
                Arguments.arguments("Madrid", "Lisboa"),
                Arguments.arguments("Madrid", "Londres")
        );
    }
}
