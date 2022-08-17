package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Vuelos;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class VuelosTest extends SeleniumTestBase {
    Vuelos vuelos;

    @BeforeEach
    public void inicializar(){
        vuelos = new Vuelos((DriverFactory.getDriver()));
        vuelos.navegarAlHomeWeb();
        vuelos.aceptarCokies();
}  @Test
    @Tag("regresion")
    void busquedaVuelos() throws InterruptedException {

        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();

        //agregar asssert con paramether

    }

    @Test
    @Description("se modifica el numero de pasajeros")
    void modificarVuelo() throws InterruptedException {
        vuelos.guardarPag();
        System.out.println(vuelos.guardarPag());
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();



        Thread.sleep(5000);

        //comienzo de esta prueba


        vuelos.guardarPag();
        System.out.println(vuelos.guardarPag());

        vuelos.switchTo(1); //
        System.out.println(vuelos.switchTo(1));

        vuelos.probando();

        vuelos.seleccionarModificar();
        Thread.sleep(5000);
        vuelos.modificarVuelo();

    }

    @Test
    @Description(" comprobar listado de checkbox se encuentren habilitados")
    void checkboxHabilitados(){
        vuelos.seleccionarMenuVuelo();

    }

    @Test
    @Description("Comprobar que se muestre la nueva pestania de destino en vuelos Multidestino")
    void pestanaEmergenteMultidestino() throws InterruptedException {
        vuelos.seleccionarMenuVuelo();
        vuelos.seleccionarMultidestino();
        Thread.sleep(3000);

    }

    @Test
    @Description("Filtrar vuelos por 'companias Aerolineas Argentinas' ")
    void filtrarVuelosCompanias(){
        vuelos.seleccionarMenuVuelo();

    }

    @Test
    @Description("Comprobar registro de datos de clientes previo al pago")
    void datosCorrectoCliente() throws InterruptedException {

        vuelos.logearseEnPagina();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();
        Thread.sleep(10000);
        vuelos.probando();




    }






}
