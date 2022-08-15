package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsTrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class CP001_Trenes extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsTrenesPage rumboEsTrenesPage;

    @Test
    @Description("Test de prueba")
    void irARumbos() throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irATrenes();


        rumboEsTrenesPage = new RumboEsTrenesPage(DriverFactory.getDriver());
        rumboEsTrenesPage.seleccionarIda();
        rumboEsTrenesPage.ingresarOrigen();
        rumboEsTrenesPage.ingresarDestino();
        rumboEsTrenesPage.seleccionarCalendario();
        rumboEsTrenesPage.establecerBusqueda();
    }
}
