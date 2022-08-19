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

import java.io.IOException;
import java.util.stream.Stream;

public class CP005_Trenes extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsTrenesPage rumboEsTrenesPage;
    RumboEsTrenesBusquedaPage rumboEsTrenesBusquedaPage;
    RumboEsTrenesSecurePage rumboEsTrenesSecurePage;

    @ParameterizedTest
    @MethodSource
    @Description("Realizar el test CP005 del RF02")
    void CP005_CoberturaFullFlex(String Origen, String Destino) throws InterruptedException, IOException {
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
        rumboEsTrenesBusquedaPage.seleccionarViaje();

        rumboEsTrenesSecurePage = new RumboEsTrenesSecurePage(DriverFactory.getDriver());
        rumboEsTrenesSecurePage.clickFullFlex();

        System.out.println(rumboEsTrenesSecurePage.FullFlexSeleccionado());
        Assertions.assertTrue(rumboEsTrenesSecurePage.FullFlexSeleccionado());

    }

    static Stream<Arguments> CP005_CoberturaFullFlex(){
        return Stream.of(
                Arguments.arguments("Madrid","Barcelona")
        );
    }


}
