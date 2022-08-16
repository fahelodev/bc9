package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsHotelesPage extends SeleniumWrapper {

    public RumboEsHotelesPage(WebDriver driver) {
        super(driver);

    }
    By inputDestino = By.id("mui-1");

    By BotonCalendarioIda = By.xpath("(//button[@class='display-pc5m51-DateInput-styled'])[1]");

    By botonBuscar = By.xpath("//button[@class=\"display-joffoz-Button\"] ");

    public void ingresarDestino(String Destino){
        write(Destino,inputDestino);
        By origenChicago = By.xpath("//b[@class=\"display-16ky3fq-Autocompleter-styled\"]");
        click(origenChicago);
    }

    public void establecerFechaViaje(){
        click(BotonCalendarioIda);//prueba spath completo
        By ida = By.xpath("/div/div[2]/div/form/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[2]/div[2]/button[10]");
        click(ida);
        By vuelta = By.xpath("(//button[text()='31'])[1]");
        click(vuelta);
    }

}
