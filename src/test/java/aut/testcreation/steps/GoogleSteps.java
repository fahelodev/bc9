package aut.testcreation.steps;
import aut.testcreation.pages.GoogleHomePage;
import aut.testplan.sprint.GoogleTestRunner;
import framework.engine.selenium.DriverFactory;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.atomic.AtomicReference;


public class GoogleSteps extends GoogleTestRunner implements En{

    GoogleHomePage ghp;


    public GoogleSteps(){



        Before(2, GoogleTestRunner::setUp); //cada vez que ejecute un escenario que ejecute el setup


        After(GoogleTestRunner::tearDown);

        Given("que estoy en el Home de Google", () -> {
            ghp = new GoogleHomePage(driver);
            ghp.navegarAlHome();
            Assertions.assertEquals("Google", ghp.getUrlTitle());
        });

        When("busco la palabra {string} en el navegador", (String string) -> {
            ghp.buscarConBotonBuscar(string);

        });

        When("presiono el boton buscar", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("me lleva a la pagina de resultados", () -> {
            Assertions.assertEquals("Tsoft - Busquedas con Google", ghp.getUrlTitle());
        });



    }
}
