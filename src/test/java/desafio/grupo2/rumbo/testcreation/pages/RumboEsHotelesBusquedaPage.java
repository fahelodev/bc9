package desafio.grupo2.rumbo.testcreation.pages;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsHotelesBusquedaPage extends SeleniumWrapper {

    public RumboEsHotelesBusquedaPage(WebDriver driver) {
        super(driver);
    }
    public void filtroTipoAlojamiento(){
        By filtroTipoAlojamiento = By.xpath("(//div[contains(@class,'styled__CustomCompStyledLabel-sc-1v205vs-1 izWgpy')])[2]");
        click(filtroTipoAlojamiento);
    }
    public void filtroTipoAlojamientoHotel(){
    By filtroTipoAlojamientoHotel = By.xpath("//div[text()='Hotel']");
        click(filtroTipoAlojamientoHotel);

    }
    public void aplicarFiltro(){
        //button[text()='Aplicar']
        By aplicarFiltro = By.xpath("//button[@class='styled__ApplyStyled-sc-18vcrz8-4 cHQYkF']");
        click(aplicarFiltro);

    }
     public void seleccionarHotel() {
         By seleccionarHotel = By.xpath("(//div[@class='styled__VerticalContentContainer-sc-14jadqx-4 eCjflM'])[1]");
         click(seleccionarHotel);
     }
}
