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
    By filtroTipoAlojamientoHotel = By.xpath("/html/body/div[4]/div[1]/div/div[5]/div[1]");
        click(filtroTipoAlojamientoHotel);

    }
    public void aplicarFiltro(){
        //button[text()='Aplicar']
        By aplicarFiltro = By.xpath("//button[@class='styled__ApplyStyled-sc-18vcrz8-4 cHQYkF']");
        click(aplicarFiltro);

    }
}
