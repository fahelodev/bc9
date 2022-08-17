package desafio.grupo1.rumbo.testcreation.testcases;


import desafio.grupo1.rumbo.testcreation.pages.RumboHomePage;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrenesTest extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
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





}
