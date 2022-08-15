package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsTrenesPage extends SeleniumWrapper {

    public RumboEsTrenesPage (WebDriver driver){
        super(driver);
    }

    By SoloIda = By.xpath( "//div[@class='trainSwitch trainOneWay active']");
    By OrigenTren = By.xpath( "//div[text()='Madrid']");
    By DestinoTren = By.xpath("//div[text()='Barcelona']");
    By fechaTren =By.xpath("//div[@class=\"calendarBoxText lmn-sw-responsive-form-field lmn-sw-tooltip-responsive__text\"][text()=\"Mié, 24 Ago\"]");
    By TurnoTren = By.xpath("//div[@class=\"timeSelectionBoxTitle\"][text()='Tarde']");
    By BotonBuscar = By.xpath("//div[@class=\"btn btn-cta btn-block lmn-sw-submitFlight\"]");
}
