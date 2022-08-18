package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Hoteles;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HotelesTest extends SeleniumTestBase {
    Hoteles H01;

    @BeforeEach
    public void inicializar() {
        H01= new Hoteles(DriverFactory.getDriver());
        H01.navegarAlHome();
        H01.aceptarCookies();
    }


    @Test
    public void Test_H01() {

        H01.seccionHoteles();
        H01.busquedaHabitacionPorPersona();

    }

}
