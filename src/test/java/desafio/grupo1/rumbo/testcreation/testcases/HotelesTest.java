package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Hoteles;
import desafio.grupo1.rumbo.testcreation.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HotelesTest extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    Hoteles hoteles;

    @BeforeEach
    public void inicializar() {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.aceptarCookies();
    }
    @Test
    public void Test_H01() {
        rumboHomePage.seccionHoteles();
        hoteles.busquedaHabitacionPorPersona();
        Assertions.assertEquals("3 viajeros, 1 habitación", hoteles.busquedaHabitacionPorPersona());
    @Test
    public void Test_H02(){
        rumboHomePage.seccionHoteles();
        }
    }

}
