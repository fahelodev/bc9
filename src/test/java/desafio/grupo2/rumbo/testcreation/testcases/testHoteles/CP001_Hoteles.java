package desafio.grupo2.rumbo.testcreation.testcases.testHoteles;

import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesBusquedaPage;
import desafio.grupo2.rumbo.testcreation.pages.Hoteles.RumboEsHotelesPage;
import desafio.grupo2.rumbo.testcreation.pages.RumboEsHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import lombok.Value;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CP001_Hoteles extends SeleniumTestBase {

    RumboEsHomePage rumboEsHomePage;
    RumboEsHotelesPage rumboEsHotelesPage;
    RumboEsHotelesBusquedaPage rumboEsHotelesBusquedaPage;

    @ParameterizedTest
    @ValueSource(strings = {"Chicago"})
    @Description("CP001_Hoteles")
    void CP001_Hoteles(String destino) throws InterruptedException {
        rumboEsHomePage = new RumboEsHomePage(DriverFactory.getDriver());
        rumboEsHomePage.despegarARumbos();
        rumboEsHomePage.aceptarCookies();
        rumboEsHomePage.irAHoteles();


        rumboEsHotelesPage = new RumboEsHotelesPage(DriverFactory.getDriver());
        rumboEsHotelesPage.ingresarDestino(destino);
        rumboEsHotelesPage.FechaInicioVuelta();
        rumboEsHotelesPage.pasajeros();
        rumboEsHotelesPage.habitaciones();
        rumboEsHotelesPage.buscar();

        rumboEsHotelesBusquedaPage = new RumboEsHotelesBusquedaPage(DriverFactory.getDriver());
        Assertions.assertTrue(rumboEsHotelesBusquedaPage.hayResultados());

    }

}
