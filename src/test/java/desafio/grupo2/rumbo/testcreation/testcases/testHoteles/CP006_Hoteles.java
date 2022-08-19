package desafio.grupo2.rumbo.testcreation.testcases.testHoteles;

import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesDetallesPage;
import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesPage;
import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesSecurePage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

class CP006_Hoteles extends SeleniumTestBase {
    RumboEsHomePage rumboEsHomePage;
    RumboEsHotelesPage rumboEsHotelesPage;
    RumboEsHotelesBusquedaPage rumboEsHotelesBusquedaPage;
    RumboEsHotelesDetallesPage rumboEsHotelesDetallesPage;
    RumboEsHotelesSecurePage rumboEsHotelesSecurePage;
    @ParameterizedTest
    @ValueSource(strings={"Santiago"})
    @Description("Test Caso CP006_Hoteles")
    void CP006_Hoteles(String Destino) throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAHoteles();

        rumboEsHotelesPage = new RumboEsHotelesPage(DriverFactory.getDriver());
        rumboEsHotelesPage.ingresarDestino2(Destino);
        rumboEsHotelesPage.FechaInicioVuelta();
        rumboEsHotelesPage.pasajeros();
        rumboEsHotelesPage.buscar();

        rumboEsHotelesBusquedaPage = new RumboEsHotelesBusquedaPage(DriverFactory.getDriver());
        rumboEsHotelesBusquedaPage.seleccionarHotel06();
        ArrayList<String> tabs = rumboEsHotelesBusquedaPage.getWinndowHandleds();
        if (tabs.size() > 1) {
            rumboEsHotelesBusquedaPage.SwitchTo(tabs.get(1));
        }
        rumboEsHotelesDetallesPage = new RumboEsHotelesDetallesPage(DriverFactory.getDriver());
        rumboEsHotelesDetallesPage.cancelaciongratuita();

        rumboEsHotelesSecurePage = new RumboEsHotelesSecurePage(DriverFactory.getDriver());
        rumboEsHotelesSecurePage.rellenardatos06();
        rumboEsHotelesSecurePage.tarjeta();
        rumboEsHotelesSecurePage.continuarpago();

        Assertions.assertEquals("Introduce un número válido", rumboEsHotelesSecurePage.Ninvalido());


    }
}

