package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboVuelosSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CP005_Vuelos extends SeleniumTestBase {
    RumboEsHomePage rumboEsHomePage;
    RumboEsVuelosPage rumboEsVuelosPage;

    RumboEsVuelosBusquedaPage rumboEsVuelosBusquedaPage;

    RumboVuelosSecurePage rumboVuelosSecurePage;

    @ParameterizedTest
    @MethodSource
    void CP005_comprobacionNumeroTarjeta(String origen, String destino, List<String> DatosPersonales){
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
    }


    static Stream<Arguments> CP005_comprobacionNumeroTarjeta(){
        return Stream.of(
                Arguments.arguments("Madrid", "Roma",List.of(
                        "Lucas",
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
                        "1538 9021 9009 2119 000"
                )
                ),
                Arguments.arguments("Madrid", "Roma","380444973929002","Introduce un número de teléfono válido"),
                Arguments.arguments("Madrid", "Roma","180422251789021", "Introduce un número de teléfono válido")
        );
    }
}
