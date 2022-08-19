package desafio.grupo2.rumbo.testcreation.pages.Hoteles;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class RumboEsHotelesBusquedaPage extends SeleniumWrapper {

    public RumboEsHotelesBusquedaPage(WebDriver driver) {
        super(driver);
    }
    public boolean estaHotelFreeHand (){
        By btnFreeHanceChicago = By.xpath("//div[text()=\"Freehand Chicago\"]");
        By btnSiguientePagina = By.xpath("//div[@class=\"styled__PageItemStyled-sc-1pfyfjt-1 bXKdWz pager-arrow\"]");
        boolean encontrado=false;
        do{

            if (isDisplayed(btnFreeHanceChicago)) encontrado=true;

            else
                click(btnSiguientePagina);

        }while (!encontrado || !isEnabled(btnSiguientePagina));

        return encontrado;
    }


    public boolean hayResultados(){
        By subTitulo = By.xpath("//div[@class=\"styled__SubTitleStyled-sc-1qxo3lt-2 gXPgVQ openx-ui-main-subtitle\"]");
        String sTitulo = getText(subTitulo);
        if (sTitulo.startsWith("0")) return false; else return true;
    }
    public void clickEnWifiGratis() throws InterruptedException {
        Thread.sleep(3000);
        By btnWifiGratis = By.xpath("//div[text()=\"Wifi gratis\"] ");
        click(btnWifiGratis);
    }
    public void clickEnCancelacionGratuita() throws InterruptedException {
        Thread.sleep(3000);
        By btnCancelacionGratuita = By.xpath("//div[text()=\"Cancelación gratuita\"]");
        click(btnCancelacionGratuita);
    }



    public void filtroTipoAlojamiento() throws InterruptedException {
        Thread.sleep(3000);
        By filtroTipoAlojamiento = By.xpath("(//div[contains(@class,'styled__CustomCompStyledLabel-sc-1v205vs-1 izWgpy')])[2]");
        click(filtroTipoAlojamiento);
    }
    public void filtroTipoAlojamientoHotel() throws InterruptedException {
        Thread.sleep(2000);
    By filtroTipoAlojamientoHotel = By.xpath("//div[text()='Hotel']");
        click(filtroTipoAlojamientoHotel);

    }
    public void aplicarFiltro() throws InterruptedException {
        Thread.sleep(2000);
        By aplicarFiltro = By.xpath("//button[@class='styled__ApplyStyled-sc-18vcrz8-4 cHQYkF']");
        click(aplicarFiltro);

    }
     public void seleccionarHotel() throws InterruptedException {
         Thread.sleep(3000);
         By seleccionarHotel = By.xpath("//div[text()='Central Loop Hotel']");
         click(seleccionarHotel);
     }
    public void seleccionarHotel04() throws InterruptedException {
        Thread.sleep(3000);
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
