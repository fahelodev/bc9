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

import java.util.List;
import java.util.stream.Stream;

public class CP004_Vuelos extends SeleniumTestBase {
    RumboEsHomePage rumboEsHomePage;
    RumboEsVuelosPage rumboEsVuelosPage;

    RumboEsVuelosBusquedaPage rumboEsVuelosBusquedaPage;

    RumboVuelosSecurePage rumboVuelosSecurePage;
    @ParameterizedTest
    @MethodSource
    @Description("Realizando la prubea CP004 del RF01")
    void CP004_NumeroTelefonoInvalido(String origen, String destino,List<String> num,String esperado) throws InterruptedException {
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
        rumboEsVuelosBusquedaPage.seleccionarViaje();

        rumboVuelosSecurePage = new RumboVuelosSecurePage(DriverFactory.getDriver());

        rumboVuelosSecurePage.elegirClassic();
        rumboVuelosSecurePage.rellenarDatosPersonales(num);
        String resultado = rumboVuelosSecurePage.datosInvalidos();

        Assertions.assertEquals(esperado,resultado);
    }
    static Stream<Arguments> CP004_NumeroTelefonoInvalido(){
        return Stream.of(
                Arguments.arguments("Madrid", "Roma", List.of("380444973929002"
                        ,"Lucas",
                        "Gonzalez",
                        "lucasgon98@g",
                        "Felipe II",
                        "125",
                        "5300",
                        "La Rioja",
                        "Argentina",
                        "09",
                        "1998",
                        "Lucas Gonzalez",
                        "1538 9021 9009 2119 000"),"Introduce un número de teléfono válido"),
                Arguments.arguments("Madrid", "Roma", List.of("180422251789021"
                        ,"Lucas",
                        "Gonzalez",
                        "lucasgon98@g",
                        "Felipe II",
                        "125",
                        "5300",
                        "La Rioja",
                        "Argentina",
                        "09",
                        "1998",
                        "Lucas Gonzalez",
                        "1538 9021 9009 2119 000"),"Introduce un número de teléfono válido"),
                Arguments.arguments("Madrid", "Roma", List.of("180422223454021"
                        ,"Lucas",
                        "Gonzalez",
                        "lucasgon98@g",
                        "Felipe II",
                        "125",
                        "5300",
                        "La Rioja",
                        "Argentina",
                        "09",
                        "1998",
                        "Lucas Gonzalez",
                        "1538 9021 9009 2119 000"), "Introduce un número de teléfono válido")
        );
    }
}
