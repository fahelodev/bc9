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

public class CP002_Vuelos extends SeleniumTestBase {
    RumboEsHomePage rumboEsHomePage;
    RumboEsVuelosPage rumboEsVuelosPage;

    RumboEsVuelosBusquedaPage rumboEsVuelosBusquedaPage;

    RumboVuelosSecurePage rumboVuelosSecurePage;

    @ParameterizedTest
    @MethodSource
    @Description("Realizando la prubea CP002 del RF01")
    void CP002_VuelosSinDestinos(String origen,String destino, String esperado) {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAVuelos();

        rumboEsVuelosPage = new RumboEsVuelosPage(DriverFactory.getDriver());
        rumboEsVuelosPage.ingresarOrigen(origen);
        rumboEsVuelosPage.ingresarDestino(destino);

        String resultado = rumboEsVuelosPage.SinResultados();

        Assertions.assertEquals(esperado,resultado);
    }
    static Stream<Arguments> CP002_VuelosSinDestinos(){
        return Stream.of(
                Arguments.arguments("Madrid", "Uzbeskitan", "La búsqueda no ha dado resultados"),
                Arguments.arguments("Madrid", "Lestonia", "La búsqueda no ha dado resultados"),
                Arguments.arguments("Madrid", "Angola","La búsqueda no ha dado resultados")
        );
    }
}
