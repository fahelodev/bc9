package desafio.grupo2.rumbo.testcreation.pages.Hoteles;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsHotelesDetallesPage extends SeleniumWrapper {

    public RumboEsHotelesDetallesPage(WebDriver driver) {
        super(driver);
    }
    public void seleccionarFiltro() throws InterruptedException {
        Thread.sleep(10000);
        By seleccionarFiltro = By.xpath("//button[text()=\"Desayuno incluido\"]");
        click(seleccionarFiltro);

    }
}


