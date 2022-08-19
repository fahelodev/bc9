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
        Assertions.assertEquals("Ruben Dario", hoteles.datoNombre());
        Assertions.assertEquals("Chavez Castro", hoteles.datoApellido());
        Assertions.assertEquals("equipo1desafiotsoft@gmail.com",hoteles.datoEmail());
        Assertions.assertEquals("90884812", hoteles.datoTelefono());

    }

    @Test
    @Description("ID:H06- Listas desplegables de Hoteles")
    public void despliegueListas(){
        hoteles.seccionHoteles();
        hoteles.desplegarListasHoteles();
        Assertions.assertTrue(true);}

}
