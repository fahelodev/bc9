package desafio.grupo1.rumbo.testcreation.testcases;


import desafio.grupo1.rumbo.testcreation.pages.RumboHomePage;
import desafio.grupo1.rumbo.testcreation.pages.Trenes;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrenesTest extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
    Trenes trenes;

    @BeforeEach
    public void inicializar(){
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.aceptarCookies();
    }
    @Test
    public void irASeccionTrenes() {

        rumboHomePage.seccionTrenes();
    }

    @Test
    @Description("ID: T01 - Viaje en tren sin destino")
    public void buscarViajeTren(){
        trenes.viajeEnTrenSinDestino();
        trenes.msjErrorDestino();
        System.out.println(trenes.msjErrorDestino());
    }







}
