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
    public void internet(){
        By internet = By.xpath("//div[text()='Internet']");
        click(internet);
    }
    public void cancelaciongratuita(){
        By cancelaciongratuita = By.xpath("(//button[text()='Continuar'])[2]");
        click(cancelaciongratuita);
    }


}


