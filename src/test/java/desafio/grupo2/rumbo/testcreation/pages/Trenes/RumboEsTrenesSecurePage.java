package desafio.grupo2.rumbo.testcreation.pages.Trenes;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class RumboEsTrenesSecurePage extends SeleniumWrapper {
    public RumboEsTrenesSecurePage(WebDriver driver) {
        super(driver);
    }


    By btnFullFlex = By.xpath("(//div[@class=\"radio\"])[1]");
    By btnSiguiente = By.xpath("//button[@class=\"btn btn-cta lead-generation-submit__btn \"]");


    public void pasarSiguiente() {
        click(btnSiguiente);
    }



    public String sinDatos() {
        By datosVacios = By.xpath("(//label[@class=\"form-elements-2__error-label  \"])[1]");
        return getText(datosVacios);

    }
    public void AsistenciaEspecial() throws InterruptedException {

        By btnAsistenciaespecial = By.xpath( "//div[@class=\"special-requests-structured__fieldset-wrapper\"]");

        click(btnAsistenciaespecial);
        By tipoDeSolicitud = By.xpath("(//select[@class=\"form-control select-input\"])[1]");
        click(tipoDeSolicitud);
        By selecMovReducida = By.xpath("(//option[@data-test=\"special-request-structured-types-option\"])[2]");
        click(selecMovReducida);
        By tipoDeAsistencia =By.xpath("(//select[@class=\"form-control select-input\"])[2]");
        click(tipoDeAsistencia);
        By pasajeroInmovil = By.xpath("(//option[@data-test=\"special-requests-structured-requirements-select-option\"])[3]");
        click(pasajeroInmovil);

    }

    public boolean desplegadoAsistenciaEspecial(){
        By divAsistenciaEspecial = By.xpath("//div[@class=\"special-requests-structured-selections css-1wjqq29\"]");
        return isDisplayed(divAsistenciaEspecial);
    }

    public void clickFullFlex(){

        click(btnFullFlex);
    }
    public boolean FullFlexSeleccionado(){
        By btnModificar = By.xpath("(//span[text()=\"Modificar\"])[1]");
        return isDisplayed(btnModificar);
    }

    public String tarifaDetalle(){
        By btnDesplegarDetalle = By.xpath("(//span[@class=\"receipt__toggle-link\"])[1]");
        click(btnDesplegarDetalle);
        By elemTarifaDetalle = By.xpath("(//span[@data-test=\"currency-amount\"])[1]");
        return getText(elemTarifaDetalle);
    }


    public double cantidadAumento() throws InterruptedException {
        Thread.sleep(3000);
        By msjAumento = By.xpath("(//span[@class=\"change-amount__amount\"])[1]");
        Thread.sleep(3000);
        String mensaje = getText(msjAumento);
        String aumentoNro="";
        double aumento;
        for(int i=0; i<mensaje.length()-2;i++){

            if((String.valueOf(mensaje.charAt(i)).equals(","))) {

                aumentoNro += ".";

            }else{

                aumentoNro += String.valueOf(mensaje.charAt(i));

            }
        }
        aumento = Double.parseDouble(aumentoNro);
        return aumento;
    }
    public String restarAumento(String precioFinal, double aumento){

        String pFinalNros="";
        for(int i=0; i<precioFinal.length()-2; i++){

            if((String.valueOf(precioFinal.charAt(i)).equals(","))) {

                pFinalNros += ".";

            }else{

                pFinalNros += String.valueOf(precioFinal.charAt(i));

            }
        }
        double pFinal= Double.parseDouble(pFinalNros);
        double resultado = pFinal-aumento;


        return Double.toString(Math.round(resultado*100.0)/100.0);

    }


}
