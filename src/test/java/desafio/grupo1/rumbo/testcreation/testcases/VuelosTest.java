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
}   @Test
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


        vuelos.guardarPag(); //pagina colada
        System.out.println(vuelos.guardarPag());


        vuelos.switchTo(0).close();// cierro pagina anexa

        Thread.sleep(3000);
        vuelos.guardarPag(); //guardo pagina actual
        System.out.println(vuelos.guardarPag());
       vuelos.switchTo(0); // continuo con el proceso



        vuelos.seleccionarModificar();

        Thread.sleep(5000);
        vuelos.modificarVuelo();


        //agregar assert

    }

    @Test
    @Description(" comprobar listado de checkbox se encuentren habilitados")
    void checkboxHabilitados() throws InterruptedException {

        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();
        //continuacion
        vuelos.guardarPag();
        vuelos.switchTo(1);


    }

    @Test
    @Description("Comprobar que se muestre la nueva pestania de destino en vuelos Multidestino")
    void pestanaEmergenteMultidestino() throws InterruptedException {
        vuelos.guardarPag();
        System.out.println(vuelos.guardarPag());
        vuelos.seleccionarMenuVuelo();
        vuelos.seleccionarMultidestino();
        vuelos.guardarPag();
        Thread.sleep(3000);
        //continuacion

        System.out.println(vuelos.guardarPag());
        vuelos.switchTo(1);
        vuelos.cerrarVentanasEmergente();

        //crear aasert que me compare con titulo de la pagina





        //agregar assert

    }

    @Test
    @Description("Filtrar vuelos por 'companias Aerolineas Argentinas' ")
    void filtrarVuelosCompanias() throws InterruptedException {
        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();
        Thread.sleep(5000);

        //continuacion
        vuelos.guardarPag();
        vuelos.switchTo(1);
        vuelos.seleccionarCompania();

        Thread.sleep(3000);
        //agregarAssert COMPROBAR QUE LA LISTA CORRESPONDA A AEROLINEA ARGENTINA


    }

    @Test
    @Description("Comprobar registro de datos de clientes previo al pago")
    void datosCorrectoCliente() throws InterruptedException {
        vuelos.guardarPag();

        vuelos.logearseEnPagina();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();
        Thread.sleep(5000);

        //continuacion
        vuelos.guardarPag();
        vuelos.switchTo(1);

        vuelos.seleccionarPrimerVuelo();
        Thread.sleep(10000);
        vuelos.seleccionarServicio();
        Thread.sleep(3000);

        // desarrollar assert


    }






}
