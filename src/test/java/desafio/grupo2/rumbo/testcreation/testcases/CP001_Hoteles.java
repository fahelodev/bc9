package desafio.grupo2.rumbo.testcreation.testcases;

import desafio.grupo2.rumbo.testcreation.pages.RumboEsHotelesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.Test;

public class CP001_Hoteles extends SeleniumTestBase {

    RumboEsHotelesPage rumboEsHotelesPage;

    @Test
    @Description("Test de prueba")
    void busquedaHoteles() throws InterruptedException{
        rumboEsHotelesPage = new RumboEsHotelesPage(DriverFactory.getDriver());
        rumboEsHotelesPage.ingresarDestino("Chicago");
        rumboEsHotelesPage.aceptarCookies();
        rumboEsHotelesPage.buscarHoteles();
    }


}
