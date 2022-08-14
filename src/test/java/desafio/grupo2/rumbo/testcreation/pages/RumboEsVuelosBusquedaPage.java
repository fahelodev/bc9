package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RumboEsVuelosBusquedaPage extends SeleniumWrapper {
    public RumboEsVuelosBusquedaPage(WebDriver driver) {
        super(driver);
    }

    By seleccionViaje = By.xpath("(//div[@class=\"FullTripCard__PaymentContainer-sc-z8znd4-3 bjAqvb\"])[1]");


    public void seleccionarViaje(){
        click(seleccionViaje);
    }
/*        while (true){
            By seleccionViaje = By.xpath("(//div[@class=\"FullTripCard__PaymentContainer-sc-z8znd4-3 bjAqvb\"])[1]");
            if(seleccionViaje != null){
                click(seleccionViaje);
                break;
            }
        }


    }*/
}
