package desafio.grupo2.rumbo.testcreation.pages.Trenes;

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
    public void AsistenciaEspecial() throws InterruptedException {

        By btnAsistenciaespecial = By.xpath( "//div[@class=\"special-requests-structured__fieldset-wrapper\"]");

        click(btnAsistenciaespecial);
        //Thread.sleep(5000);
        By tipoDeSolicitud = By.xpath("(//select[@class=\"form-control select-input\"])[1]");

        click(tipoDeSolicitud);
        //Thread.sleep(5000);
        By selecMovReducida = By.xpath("(//option[@data-test=\"special-request-structured-types-option\"])[2]");

        click(selecMovReducida);
        //Thread.sleep(5000);
        By tipoDeAsistencia =By.xpath("(//select[@class=\"form-control select-input\"])[2]");

        click(tipoDeAsistencia);
        //Thread.sleep(5000);
        By pasajeroInmovil = By.xpath("(//option[@data-test=\"special-requests-structured-requirements-select-option\"])[3]");

        click(pasajeroInmovil);
        //Thread.sleep(5000);
    }

    public boolean desplegadoAsistenciaEspecial(){
        By divAsistenciaEspecial = By.xpath("//div[@class=\"special-requests-structured-selections css-1wjqq29\"]");
        return isDisplayed(divAsistenciaEspecial);
    }
}
