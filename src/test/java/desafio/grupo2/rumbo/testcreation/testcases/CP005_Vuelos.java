package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsVuelosPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboVuelosSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
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
    @Description("Realizando la prueba CP005 del RF01")
    void CP005_comprobacionNumeroTarjeta(String origen, String destino, List<String> DatosPersonales, String esperado, Boolean condicion) throws InterruptedException {
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
        rumboVuelosSecurePage.rellenarDatosPersonales(DatosPersonales);
        rumboVuelosSecurePage.rellenarQuienViaja(DatosPersonales);
        rumboVuelosSecurePage.opcionesViaje();
        rumboVuelosSecurePage.servicios(condicion);
        rumboVuelosSecurePage.rellanarPago(DatosPersonales);

        String Resultado = rumboVuelosSecurePage.numeroTarjetaInvalido();

        Assertions.assertEquals(esperado,Resultado);
    }


    static Stream<Arguments> CP005_comprobacionNumeroTarjeta(){
        return Stream.of(
                Arguments.arguments("Madrid", "Roma",List.of("3804228169"
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
                        "1538 9021 9009 2119 000"
                ), "Introduce un número válido", true
                ),
                Arguments.arguments("Madrid", "Roma",List.of("3804228169"
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
                                "1538 9021 9009 2119 000"
                        ), "Introduce un número válido", true
                ),
                Arguments.arguments("Madrid", "Roma",List.of("3804228169"
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
                                "1538 9021 9009 2119 000"
                        ), "Introduce un número válido",true
                )
        );
    }
}
