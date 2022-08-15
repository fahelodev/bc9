package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsTrenesSecurePage extends SeleniumWrapper {
    public RumboEsTrenesSecurePage(WebDriver driver) {
        super(driver);
    }

    By btnSiguiente = By.xpath("//button[@class=\"btn btn-cta lead-generation-submit__btn \"]");

    public void pasarSiguiente() {
        click(btnSiguiente);
    }

    public String sinDatos() {
        By datosVacios = By.xpath("(//label[@class=\"form-elements-2__error-label  \"])[1]");
/*        String texto = getText(datosVacios);
        String caso = " ";
        if (texto == "Introduce el nombre") {
            caso = "Datos incompletos";
        }
        return caso;*/

        return getText(datosVacios);

    }
}
