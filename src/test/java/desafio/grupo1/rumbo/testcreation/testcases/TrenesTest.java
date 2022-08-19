package desafio.grupo1.rumbo.testcreation.testcases;


import desafio.grupo1.rumbo.testcreation.pages.Trenes;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrenesTest extends SeleniumTestBase {


    Trenes trenes;

    @BeforeEach
    public void inicializar(){
        trenes = new Trenes(DriverFactory.getDriver());
        trenes.navegarAlHome();
        trenes.aceptarCookies();
    }
    @Test
    public void irASeccionTrenes() {

        trenes.seccionTrenes();
    }


    @Test
    @Description("ID: T01 - Viaje en tren sin destino")

    public void buscarViajeSinDestino(){
        trenes.seccionTrenes();
        trenes.viajeEnTrenSinDestino();
        Assertions.assertEquals("Selecciona ciudad de destino", trenes.msjErrorDestino());
    }

    @Test
    @Description("ID: T02 - Modificacion viaje tren luego de la busqueda")

    public void buscarViajeEnTren(){
        trenes.seccionTrenes();
        trenes.buscarViajeTren();
        trenes.modificarViajeTren();
        Assertions.assertEquals("sáb. 27 ago. - mar. 30 ago.", trenes.datosModificados());
    }

    @Test
    @Description ("ID:T03- Crear viaje en Tren, filtrar por el más barato")

    public void viajeMasBarato() throws InterruptedException {
        trenes.seccionTrenes();
        trenes.viajeTrenFiltro();
        Assertions.assertEquals(trenes.chequeoMenorPrecioTab(),trenes.chequeoMenorPrecio());
    }

    @Test
    @Description("ID:T04- Listas Desplegables Seccion Trenes")

    public void desplegarListasTrenes(){
        trenes.seccionTrenes();
        Assertions.assertEquals("Billetes de AVE más hotel a Madrid",trenes.leerMasListasAve());
        Assertions.assertEquals("Ventajas del buscador de Rumbo",trenes.leerMasRumbo());

    }
    @Test
    @Description("ID:T05- Popup con mensaje de error en sección Renfe")
    public void mensajeErrorRenfe(){

        trenes.seccionTrenes();
        trenes.cambioPag();
        trenes.guardarPag();
        trenes.switchTo(1);
        Assertions.assertEquals("No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.",trenes.errorRenfe());
    }
    @Test
    @Description("ID:T06- Busqueda de Viaje por tren")
    public void viajePorTren(){
        trenes.seccionTrenes();
        trenes.viajeSoloIda();
        Assertions.assertEquals("Barcelona YJB Alicante YJE",trenes.datosViajeIda());


    }

}
