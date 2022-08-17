package aut.testcreation.steps;
import aut.testcreation.pages.GoogleHomePage;
import aut.testplan.sprint.GoogleTestRunner;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;


public class GoogleSteps extends GoogleTestRunner implements En{

    GoogleHomePage ghp;
    public GoogleSteps(){

        GoogleHomePage googleHomePage;

        Before(2, GoogleTestRunner::setUp);
        After(GoogleTestRunner::tearDown);

        Given("que estoy en el Home de Google", () -> {
            ghp=new GoogleHomePage(driver);
            ghp.navegarAlHome();
            Assertions.assertEquals("Google",ghp.getUrlTitle());});

        When("busco la palabra {string} en el navegador", (String string) -> {
            ghp.buscarConBotonBuscar(string);
        });

        When("presiono el boton buscar", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("me lleva a la pagina de resultados", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Given("today is Sunday", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        When("I ask whether it's Friday yet", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });
    }
}
