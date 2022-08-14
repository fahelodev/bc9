package desafio.grupo2.rumbo.testcreation.pages;


import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboEsHomePage extends SeleniumWrapper {
    public RumboEsHomePage(WebDriver driver) {
        super(driver);
    }

    By botonVuelos = By.xpath("(//a[text()=\"Vuelos\"])[1] ");
    By botonHoteles = By.xpath("(//a[text()=\"Hoteles\"])[1]");
    By botonTrenes = By.xpath("Boton para dirigirse a Trenes: (//a[text()=\"Trenes\"])[1] ");

    By botonAceptarCookies = By.xpath("//button[@data-context=\"YES\"]");


    public void despegarARumbos(){navigateTo(BASE_URL_AUT);}

    public void aceptarCookies(){click(botonAceptarCookies);}

    public void irAVuelos(){click(botonVuelos);}

    public void irAHoteles(){click(botonHoteles);}

    public void irATrenes(){click(botonTrenes);}


}
