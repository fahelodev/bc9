package desafio.grupo1.rumbo.testcreation.testcases;


import desafio.grupo1.rumbo.testcreation.pages.RumboHomePage;
import desafio.grupo1.rumbo.testcreation.pages.Trenes;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
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
    @Description ("ID:T03- Crear viaje en Tren, filtrar por el más barato")

    public void viajeMasBarato(){
        rumboHomePage.seccionTrenes();
        trenes.viajeTrenFiltro();

    }



}
