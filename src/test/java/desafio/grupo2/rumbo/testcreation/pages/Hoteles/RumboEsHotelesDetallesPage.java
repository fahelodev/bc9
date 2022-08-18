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
    public void internet() throws InterruptedException {
        Thread.sleep(1000);
        By internet = By.xpath("//div[text()='Internet']");
        click(internet);
    }
    public void cancelaciongratuita(){
        By cancelaciongratuita = By.xpath("(//button[text()='Continuar'])[2]");
        click(cancelaciongratuita);
    }


    public String getFiltroSeleccionado() {
        By filtroSeleccionado = By.xpath("//span[@class='RoomPanelMealPlan__MealPlanName-sc-u6tmcf-3 cvZnwc']");
        return getText(filtroSeleccionado);
    }

    public String getFiltroSeleccionado2() {
        By filtroSeleccionado = By.xpath("//div[text()='WiFi gratis']");
        return getText(filtroSeleccionado);
    }
}


