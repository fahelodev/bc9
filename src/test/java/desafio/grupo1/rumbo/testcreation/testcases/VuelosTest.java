package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Vuelos;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class VuelosTest extends SeleniumTestBase {
    Vuelos vuelos;



    @Test
    @Tag("regresion")
    void busquedaVuelos() throws InterruptedException {
        vuelos = new Vuelos((DriverFactory.getDriver()));

        vuelos.navegarAlHomeWeb();
        vuelos.aceptarCokies();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();

        //agregar asssert con paramether

    }

    @Test
    @Description("se modifica el numero de pasajeros")
    void modificarVuelo() throws InterruptedException {
        vuelos = new Vuelos((DriverFactory.getDriver()));
        vuelos.navegarAlHomeWeb();
        vuelos.aceptarCokies();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();




        Thread.sleep(10000);

        //comienzo de esta prueba





        vuelos.probando();
        vuelos.seleccionarModificar();
        vuelos.modificarVuelo();

    }

    @Test
    @Description(" comprobar listado de checkbox se encuentren habilitados")
    void checkboxHabilitados(){


    }

    @Test
    @Description("Comprobar que se muestre la nueva pestania de destino en vuelos Multidestino")
    void pestanaEmergenteMultidestino(){

    }

    @Test
    @Description("Filtrar vuelos por 'companias Aerolineas Argentinas' ")
    void filtrarVuelosCompanias(){

    }

    @Test
    @Description("Comprobar registro de datos de clientes previo al pago")
    void datosCorrectoCliente(){



    }






}
