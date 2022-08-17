package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Hoteles;
import desafio.grupo1.rumbo.testcreation.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HotelesTest extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    Hoteles H01;

    @BeforeEach
    public void inicializar() {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.aceptarCookies();
    }


    @Test
    public void Test_H01() {

        rumboHomePage.seccionHoteles();
        H01.busquedaHabitacionPorPersona();

    }

}
