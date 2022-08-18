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

public class CP002_Trenes extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsTrenesPage rumboEsTrenesPage;

    RumboEsTrenesBusquedaPage rumboEsTrenesBusquedaPage;

    RumboEsTrenesSecurePage rumboEsTrenesSecurePage;

    @ParameterizedTest
    @MethodSource
    @Description("Realizar el test CP002 del RF02")
    void CP002_MenorDuracion(String Origen,String Destino, String esperado) throws InterruptedException {
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
        rumboEsTrenesBusquedaPage.duracionmenor();



        rumboEsTrenesBusquedaPage = new RumboEsTrenesBusquedaPage(DriverFactory.getDriver());
        String Resultado = rumboEsTrenesBusquedaPage.obtenerRutaOri() + " - " + rumboEsTrenesBusquedaPage.obtenerRutaDes();

        Assertions.assertEquals(esperado,Resultado);




}
    static Stream<Arguments> CP002_MenorDuracion(){
        return Stream.of(

                Arguments.arguments("Madrid","Barcelona", "XOC - YJB")
        );
    }
}
