package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsVuelosPage extends SeleniumWrapper {


    public RumboEsVuelosPage(WebDriver driver) {
        super(driver);
    }

    By inputOrigen = By.id("mui-1");
    By inputDestino = By.id("mui-2");



    public void ingresarOrigen(String Origen){
        write(Origen,inputOrigen);
    }
    public void ingresarDestino(String Destino){write(Destino,inputDestino);}



}
