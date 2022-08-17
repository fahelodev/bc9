package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hoteles extends SeleniumWrapper {
    public Hoteles(WebDriver driver) {super(driver);}

    //Identificar localizadores
    By btnDestino = By.xpath("//*[@id=\"mui-1\"]");
    By btnCualquierDestino= By.xpath("//*[@id=\"mui-1-option-0\"]");
    By btnHoteles = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/ul/li[2]/div/a");
    By btnHabitaciones= By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[3]/div[1]/div/div[1]");
    By agregarHabitaciones= By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[3]/div[1]/div/div[2]/div/div[2]/button");
    By btnBuscar= By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[5]/button");
    By filtroHabitacion= By.xpath("//*[@id=\"__next\"]/header/div[1]/div[3]/div[6]/span");
    //---------------------METODOS
    public void seccionHoteles(){ click(btnHoteles);}
    public void busquedaHabitacionPorPersona(){
        click(btnDestino);
        if (isDisplayed(btnCualquierDestino)){
        }
        if (isDisplayed(btnHabitaciones)){click(btnHabitaciones);}
            if (isDisplayed(agregarHabitaciones)){click(agregarHabitaciones);}
        if (isDisplayed(btnBuscar)){click(btnBuscar);}
        //getText(filtroHabitacion);

    }

}
