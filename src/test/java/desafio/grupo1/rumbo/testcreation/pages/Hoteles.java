package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hoteles extends SeleniumWrapper {

    public Hoteles(WebDriver driver) {
        super(driver);
    }

    //----------------LOCALIZADORES PRUEBA ID_H05
    By txtAreaADondeQuieresIr = By.xpath("//*[@id=\"mui-1\"]");
    By calendarFechaIda = By.xpath("//button[@class=\"display-5j7qlk-DateInput-styled\"]");
    By seleccionFechaIda = By.xpath ("(//button[text()='28'])[1]");
    By seleccionFechaVuelta = By.xpath("//button[text()='31']");
    By btnBuscar = By.xpath("//div/button[@type=\"submit\"]");

    By opcionHotelHardRock = By.xpath("descendant::div[text()=\"Hard Rock Hotel Cancun All-Inclusive\"]");
    By btnElegirTipoDeHabitacion = By.xpath("//button[@data-test-id=\"book-cta\"]");
    By btnTipoHabContinuar = By.xpath("(//button[@data-testid=\"checkout-button\"])[1]");
    By seccionDatosHotel = By.xpath("descendant::div[@class=\"hotel-summary__inner\"]");


    //----------------LOCALIZADORES PRUEBA ID_H06

    By btnHoteles = By.xpath("(//li/div/a[@title=\"Hoteles\"])[1]");
    By desplegarIdeasHotelesEspania = By.xpath ("(//*[@id=\"arrow_down_svg__filled\"])[1]");
    By desplegarDestPopularesExtanj = By.xpath("(//*[@id=\"arrow_down_svg__filled\"])[2]");
    By desplegarHtlesCiudadesEspa = By.xpath ("(//*[@id=\"arrow_down_svg__filled\"])[3]");
    By desplegarIdeasDeViajes = By.xpath("(//*[@id=\"arrow_down_svg__filled\"])[4]");

}
