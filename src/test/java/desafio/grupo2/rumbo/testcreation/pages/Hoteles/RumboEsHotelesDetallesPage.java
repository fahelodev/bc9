package desafio.grupo2.rumbo.testcreation.pages.Hoteles;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsHotelesDetallesPage extends SeleniumWrapper {

    public RumboEsHotelesDetallesPage(WebDriver driver) {super(driver);}

    public void seleccionarHabitacion() {
        By seleccionarHabitacion = By.xpath("(//div[@class='RoomFilters__FiltersContainerDesktop-sc-9ig7sr-2 cqjkVT']//button)[3]");
        click(seleccionarHabitacion);
    }
}

