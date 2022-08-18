package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Hoteles;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HotelesTest extends SeleniumTestBase {
    Hoteles hoteles;

    @BeforeEach
    public void inicializar() {
        hoteles= new Hoteles(DriverFactory.getDriver());
        hoteles.navegarAlHome();
        hoteles.aceptarCookies();
    }


    @Test
    public void Test_H01() {

        hoteles.seccionHoteles();
        hoteles.busquedaHabitacionPorPersona();

    }

}
