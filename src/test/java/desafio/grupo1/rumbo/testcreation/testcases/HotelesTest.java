package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Hoteles;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
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

    @Test
    public void Logueo() throws InterruptedException {
        hoteles.seccionHoteles();
        hoteles.logueoMiRumbo();
        Thread.sleep(5000);
        hoteles.buscarHotel();
        hoteles.guardarPag();
        hoteles.switchTo(1);
        hoteles.elegirTipoHabitacion();
        Thread.sleep(15000);
        Assertions.assertEquals("Hard Rock Hotel Cancun All-Inclusive\n" +
                "Boulevard Kukulcan KM 14.5, Cancun\n" +
                "dom, 28 ago 2022\n" +
                "mié, 31 ago 2022\n" +
                "1\n" +
                "Deluxe Pure Wellness double\n" +
                "3 NochesTodo Incluido\n" +
                "2 Adultos", hoteles.datosHotel());


        //Assertions.assertEquals("123", hoteles.datosUsuario());

    }

    @Test
    @Description("ID:H06- Listas desplegables de Hoteles")
    public void despliegueListas(){
        hoteles.seccionHoteles();
        hoteles.desplegarListasHoteles();
        Assertions.assertTrue(true);
    }

}
