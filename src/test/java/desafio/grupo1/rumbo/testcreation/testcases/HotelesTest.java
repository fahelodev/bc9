package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;

public class HotelesTest extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    @BeforeEach
    public void inicializar(){
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.aceptarCookies();
    }

}
