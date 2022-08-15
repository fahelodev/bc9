package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsTrenesBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsTrenesPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsTrenesSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CP003_Trenes extends SeleniumTestBase {
    RumboEsHomePage rumboEsHomePage;
    RumboEsTrenesPage rumboEsTrenesPage;

    RumboEsTrenesBusquedaPage rumboEsTrenesBusquedaPage;

    RumboEsTrenesSecurePage rumboEsTrenesSecurePage;


    @ParameterizedTest
    @MethodSource
    @Description("Realizar el test CP003 del RF02")
    void CP003_DatosIncompletos(String Origen, String Destino, String esperado) throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irATrenes();


        rumboEsTrenesPage = new RumboEsTrenesPage(DriverFactory.getDriver());
        rumboEsTrenesPage.seleccionarIda();
        rumboEsTrenesPage.ingresarOrigen(Origen);
        rumboEsTrenesPage.ingresarDestino(Destino);
        rumboEsTrenesPage.seleccionarCalendario();
        rumboEsTrenesPage.establecerBusqueda();

        rumboEsTrenesBusquedaPage = new RumboEsTrenesBusquedaPage(DriverFactory.getDriver());
        rumboEsTrenesBusquedaPage.seleccionarViaje();

        rumboEsTrenesSecurePage = new RumboEsTrenesSecurePage(DriverFactory.getDriver());
        rumboEsTrenesSecurePage.pasarSiguiente();
        String resultado = rumboEsTrenesSecurePage.sinDatos();

        Assertions.assertEquals(esperado, resultado);
    }


    static Stream<Arguments> CP003_DatosIncompletos(){
        return Stream.of(

                Arguments.arguments("Madrid","Barcelona", "Introduce el nombre")
        );
    }
}

