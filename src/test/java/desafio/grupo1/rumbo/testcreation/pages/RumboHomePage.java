package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePage extends SeleniumWrapper {
    public RumboHomePage(WebDriver driver) {
        super(driver);
    }


    //---------LOCALIZADORES-----------
    //PAGINA INICIAL
    By btnAceptarCokies = By.xpath("//button[@data-qa='oil-YesButton']");  /*btn cook hacer click*/
    By btnTrenes = By.xpath("(//li/div/a[@title=\"Trenes\"])[1]");

    //-----------METODOS-------------
    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }

    public void aceptarCookies(){
        click(btnAceptarCokies);
    }

    public void seccionTrenes(){
        click(btnTrenes);
    }

}