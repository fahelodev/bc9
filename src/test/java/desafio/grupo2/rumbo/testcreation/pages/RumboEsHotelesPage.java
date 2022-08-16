package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsHotelesPage extends SeleniumWrapper {

    public RumboEsHotelesPage(WebDriver driver) {
        super(driver);

    }

    public void ingresarDestino(String Destino){
        By inputDestino = By.id("mui-1");
        write(Destino,inputDestino);
        By origenChicago = By.xpath("//b[@class=\"display-16ky3fq-Autocompleter-styled\"]");
        click(origenChicago);
    }


    public void FechaInicioVuelta(){
        By ida = By.xpath("(//button[text()='24'])[1]");
        click(ida);
        By vuelta = By.xpath("(//button[text()='31'])[1]");
        click(vuelta);
    }

    public void buscar(){
        By botonBuscar = By.xpath("//button[@class=\"display-joffoz-Button\"] ");
        click(botonBuscar);
    }

}
