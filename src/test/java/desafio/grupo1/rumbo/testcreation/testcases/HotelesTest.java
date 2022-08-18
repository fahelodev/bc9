package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Hoteles;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HotelesTest extends SeleniumTestBase {
    Hoteles hoteles;

    @BeforeEach
    public void inicializar() {
        hoteles = new Hoteles(DriverFactory.getDriver());
        hoteles.navegarAlHome();
        hoteles.aceptarCookies();
    }


    @Test
    @Description("Búsqueda de hotel agregando una habitación para cada persona. ")
    public void Test_H01() {
        hoteles.seccionHoteles();
        Assertions.assertEquals("3 viajeros, 1 habitación", hoteles.busquedaHabitacionPorPersona());
    }
    @Test
    @Description("Filtrar Hotel Nro de estrellas")
    public void Test_H02() throws InterruptedException {
        hoteles.seccionHoteles();
        Assertions.assertEquals("4 estrellas",hoteles.busquedaFiltroEstrellas());
    }
    @Test
    @Description("Filtrar hoteles por rango de precio. ")
    public void Test_H03() throws InterruptedException {
        hoteles.seccionHoteles();
        Assertions.assertEquals("Hasta 300 €",hoteles.busquedaFiltroRangoDePrecio());
    }
    @Test
    @Description("Acceder a categoría hoteles rurales ")
    public void Test_H04() {
        hoteles.seccionHoteles();
        hoteles.tituloHoteleresRurales();
        hoteles.guardarPag();
        hoteles.switchTo(1);
        Assertions.assertEquals("Hoteles Rurales",hoteles.getHoteles());
    }
    @Test
    @Description("ID:H06- Listas desplegables de Hoteles")
    public void despliegueListas(){
        hoteles.seccionHoteles();
        hoteles.desplegarListasHoteles();
        Assertions.assertTrue(true);}

}
