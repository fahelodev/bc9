package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.sql.Driver;
import java.time.Duration;


public class RumboEsVuelosBusquedaPage extends SeleniumWrapper {
    public RumboEsVuelosBusquedaPage(WebDriver driver) {
        super(driver);
    }
    By filtroIberia = By.xpath("//span[text()=\"Iberia\"]");

 //   By seleccionViaje = By.xpath("(//div[@class=\"FullTripCard__PaymentContainer-sc-z8znd4-3 bjAqvb\"])[1]");


    public void seleccionarViaje() throws InterruptedException {
        click(filtroIberia);
        Thread.sleep(5000);
        By seleccionViaje = By.xpath("(//div[@class=\"FullTripCard__PaymentContainer-sc-z8znd4-3 bjAqvb\"])[1]");

        click(seleccionViaje);
    }

}
