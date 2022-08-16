package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsHotelesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CP004_Hoteles extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;

    RumboEsHotelesPage rumboEsHotelesPage;

    @Test
    @Description("Test Caso CP004_Hoteles")
    void CP004_Hoteles() throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAHoteles();

        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo", rumboEsHomePage.getUrlTitle());

        rumboEsHotelesPage = new RumboEsHotelesPage(DriverFactory.getDriver());
        rumboEsHotelesPage.ingresarDestino("Chicago");
    }
}

