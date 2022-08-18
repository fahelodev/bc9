package desafio.grupo2.rumbo.testcreation.pages.Hoteles;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsHotelesBusquedaPage extends SeleniumWrapper {

    public RumboEsHotelesBusquedaPage(WebDriver driver) {
        super(driver);
    }
    public void filtroTipoAlojamiento() throws InterruptedException {
        Thread.sleep(3000);
        By filtroTipoAlojamiento = By.xpath("(//div[contains(@class,'styled__CustomCompStyledLabel-sc-1v205vs-1 izWgpy')])[2]");
        click(filtroTipoAlojamiento);
    }
    public void filtroTipoAlojamientoHotel() throws InterruptedException {
        Thread.sleep(1000);
    By filtroTipoAlojamientoHotel = By.xpath("//div[text()='Hotel']");
        click(filtroTipoAlojamientoHotel);

    }
    public void aplicarFiltro() throws InterruptedException {
        Thread.sleep(1000);
        //button[text()='Aplicar']
        By aplicarFiltro = By.xpath("//button[@class='styled__ApplyStyled-sc-18vcrz8-4 cHQYkF']");
        click(aplicarFiltro);

    }
     public void seleccionarHotel() throws InterruptedException {
         Thread.sleep(2000);
         By seleccionarHotel = By.xpath("//div[text()='Central Loop Hotel']");
         click(seleccionarHotel);
     }
    public void seleccionarHotel04() {
        By seleccionarHotel4 = By.xpath("//div[text()='Freehand Chicago']");
        click(seleccionarHotel4);
    }
    public void seleccionarHotel05() {
        By seleccionarHotel5 = By.xpath("//div[text()='Found Hotel Chicago River North']");
        click(seleccionarHotel5);
    }
    public void seleccionarHotel06() {
        By seleccionarHotel6 = By.xpath("//div[text()='Regal Pacific Hotel Santiago']");
        click(seleccionarHotel6);
    }

}
