package desafio.grupo2.rumbo.testcreation.testcases.testHoteles;

import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesDetallesPage;
import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesPage;
import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesSecurePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CP006_Hoteles extends SeleniumTestBase {
    RumboEsHomePage rumboEsHomePage;
    RumboEsHotelesPage rumboEsHotelesPage;
    RumboEsHotelesBusquedaPage rumboEsHotelesBusquedaPage;
    RumboEsHotelesDetallesPage rumboEsHotelesDetallesPage;
    RumboEsHotelesSecurePage rumboEsHotelesSecurePage;
    @Test
    @Description("Test Caso CP006_Hoteles")
    void CP006_Hoteles() throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAHoteles();

        rumboEsHotelesPage = new RumboEsHotelesPage(DriverFactory.getDriver());
        rumboEsHotelesPage.ingresarDestino2("Santiago");
        rumboEsHotelesPage.FechaInicioVuelta();
        rumboEsHotelesPage.pasajeros();
        rumboEsHotelesPage.buscar();

        rumboEsHotelesBusquedaPage = new RumboEsHotelesBusquedaPage(DriverFactory.getDriver());
        rumboEsHotelesBusquedaPage.seleccionarHotel06();
        ArrayList<String> tabs = rumboEsHotelesBusquedaPage.getWinndowsHandled();
        if (tabs.size() > 1) {
            rumboEsHotelesBusquedaPage.SwitchTo(tabs.get(1));
        }
        rumboEsHotelesDetallesPage = new RumboEsHotelesDetallesPage(DriverFactory.getDriver());
        rumboEsHotelesDetallesPage.cancelaciongratuita();

        rumboEsHotelesSecurePage = new RumboEsHotelesSecurePage(DriverFactory.getDriver());
        rumboEsHotelesSecurePage.rellenardatos06();
        rumboEsHotelesSecurePage.tarjeta();
        rumboEsHotelesSecurePage.continuarpago();


    }
}

