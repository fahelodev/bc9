package desafio.grupo2.rumbo.testcreation.testcases.testTrenes;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.Trenes.RumboEsTrenesBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.Trenes.RumboEsTrenesPage;
import desafio.grupo2.rumbo.testcreation.pages.Trenes.RumboEsTrenesSecurePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CP004_Trenes extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsTrenesPage rumboEsTrenesPage;

    RumboEsTrenesBusquedaPage rumboEsTrenesBusquedaPage;

    RumboEsTrenesSecurePage rumboEsTrenesSecurePage;


    @ParameterizedTest
    @MethodSource
    @Description("Realizar el test CP004 del RF02")
    void CP004_AsistenciaEspecial(String Origen, String Destino) throws InterruptedException {
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
        rumboEsTrenesSecurePage.AsistenciaEspecial();
        boolean Resultado = rumboEsTrenesSecurePage.desplegadoAsistenciaEspecial();

        Assertions.assertTrue(Resultado);
        //rumboEsTrenesSecurePage.pasarSiguiente();
        //String resultado = rumboEsTrenesSecurePage.sinDatos();

        //Assertions.assertEquals(esperado, resultado);
    }


    static Stream<Arguments> CP004_AsistenciaEspecial(){
        return Stream.of(

                Arguments.arguments("Madrid","Barcelona")
        );
    }
}
