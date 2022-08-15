package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsHotelesPage extends SeleniumWrapper {

    public RumboEsHotelesPage(WebDriver driver) {
        super(driver);

    }
    By inputDestino = By.id("mui-1");

    public void ingresarDestino(String Destino){
        write(Destino, inputDestino);
       // By destinoChicago
    }

}
