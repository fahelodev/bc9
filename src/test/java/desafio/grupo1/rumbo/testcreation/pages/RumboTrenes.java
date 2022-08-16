package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboTrenes extends SeleniumWrapper {

    public RumboTrenes(WebDriver driver) {
        super(driver);
    }

    //---------LOCALIZADORES-----------

    By textAreaOrigen = By.xpath("//div[text()=\"Origen\"]");
    By opcionOrigenACorunia = By.xpath("//div[@data-value=\"YJC\"]");
    By btnBuscar = By.xpath("(//div[@tabindex='1'])[2]");
    By msjErrorSeleccionaDestino = By.xpath("//div[@class=\"validation-error__content\"])[2]");

    //----------METODOS-----------

    public void viajeEnTrenSinDestino(){
        click(textAreaOrigen);
        click(opcionOrigenACorunia);
        click(btnBuscar);
    }

    public String msjErrorDestino(){
        return getText(msjErrorSeleccionaDestino);
    }
}
