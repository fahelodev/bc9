package desafio.grupo1.rumbo.testcreation.testcases;

import desafio.grupo1.rumbo.testcreation.pages.Vuelos;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
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
    @Description("ID_01 Busqueda de vuelos")
    void busquedaVuelos(){

        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();
        // resultado esperado
        // comprobar que la lista que se desplega son buenos de argentina a santiago
        Assert.assertEquals("Buenos Aires BUE Santiago SCL",vuelos.resultadoPruebaBuscarVuelo());


        //agregar asssert con paramether
    }

    @Test
    @Tag("regresion")
    @Description("ID_v02 Checkbox Habilitados: comprobar listado de checkbox se encuentren habilitados")
    void checkboxHabilitados()  {

        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();
        //continuacion
        vuelos.switchTo(0);
        // resultado esperado
        // comprobar que los checks esten disponibles y no tengan checks
       Assertions.assertTrue(vuelos.resultadoCheckboxHabilitados());


    }
    @Test
    @Tag("regresion")
    @Description("ID_V03 Modificacion de numero de pasajeros de vuelo")
    void modificarVuelo() throws InterruptedException {
        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();
        //comienzo de esta prueba
        vuelos.guardarPag();
        vuelos.switchTo(0);
        vuelos.seleccionarModificar();
        vuelos.modificarVuelo();

        //Resultado esperado
        //Comprobar que el pasajero agregado se visualice en barra de modificar
        Assertions.assertEquals("2", vuelos.resultadoPrubaModificar());

        //agregar assert

    }
    @Test
    @Tag("regresion")
    @Description("ID_V04 Pestania Emergente en vuelos Multidestino")
    void pestanaEmergenteMultidestino() {

        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.seleccionarMultidestino();

        //continuacion
        vuelos.guardarPag();
        vuelos.switchTo(1);
        vuelos.cerrarVentanasEmergente();


        //Resultado esperado
        Assertions.assertEquals("https://rumbo.kiwi.com/es/", vuelos.getUrl());
        //comprobar que la redireccion del sitio corresponda al nuevo sitio

    }

    @Test
    @Tag("regresion")
    @Description("ID_V05 Filtrar vuelos por companias 'Aerolineas Argentinas' ")
    void filtrarVuelosCompanias(){
        vuelos.guardarPag();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();



        //continuacion
        vuelos.guardarPag();
        vuelos.switchTo(0);
        vuelos.seleccionarCompania();

        Assertions.assertEquals("AR", vuelos.resultadoFiltroCheckbox());

        //resultado esperado
        //COMPROBAR QUE LA LISTA CORRESPONDA A AEROLINEA ARGENTINA


    }

    @Test
    @Tag("regresion")
    @Description("ID_V06 Comprobar registro de datos de clientes previo al pago")
    void datosCorrectoCliente() throws InterruptedException {
        vuelos.guardarPag();
        vuelos.logearseEnPagina();
        vuelos.seleccionarMenuVuelo();
        vuelos.generarVuelo();

        //continuacion
        vuelos.guardarPag();
        vuelos.switchTo(0);
        vuelos.seleccionarPrimerVuelo();
        vuelos.seleccionarServicio();

        Thread.sleep(10000);

        // quien reserva
        Assertions.assertEquals("Ruben Dario",vuelos.getDatoNombreReserva());
        Assertions.assertEquals("Chavez Castro",vuelos.getDatoApellidoReserva());
        Assertions.assertEquals("equipo1desafiotsoft@gmail.com",vuelos.getDatoEmailReserva());
        Assertions.assertEquals("90884812",vuelos.getDatoTelefonoReserva());

        // quien viaja

        Assertions.assertEquals("Ruben Dario",vuelos.getDatoNombreReserva());
        Assertions.assertEquals("Chavez Castro",vuelos.getDatoApellidoReserva());
        Assertions.assertEquals("1995",vuelos.getFecha());
        Assertions.assertTrue(vuelos.getCheckQuienViaja());







        //vuelos.resultadoLogin();

        //Resultado esperado
        //comprobar el auto completado de los datos de usuario 



    }

}
