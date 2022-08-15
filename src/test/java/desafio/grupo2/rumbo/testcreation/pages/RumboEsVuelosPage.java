package desafio.grupo2.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboEsVuelosPage extends SeleniumWrapper {


    public RumboEsVuelosPage(WebDriver driver) {
        super(driver);
    }

    By inputOrigen = By.id("mui-1");
    By inputDestino = By.id("mui-2");

    By botonDesplegarPasajeros = By.xpath("(//span[@class=\"display-19d528r-Dropdown-styled-textOverflowEllipsis-Dropdown-styled\"])[1]");

    By botonDesplegarClases = By.xpath("(//span[@class=\"display-19d528r-Dropdown-styled-textOverflowEllipsis-Dropdown-styled\"])[2]");

    By BotonCalendarioIda = By.xpath("(//button[@class='display-pc5m51-DateInput-styled'])[1]");

    By BotonCalendarioVuelta = By.xpath("(//button[@class='display-pc5m51-DateInput-styled'])[2]");

    By botonBuscar = By.xpath("//button[@class=\"display-joffoz-Button\"] ");



    public void ingresarOrigen(String Origen){

        write(Origen,inputOrigen);
        By origenMadrid = By.xpath("//b[@class=\"display-16ky3fq-Autocompleter-styled\"]");
        click(origenMadrid);
    }
    public void ingresarDestino(String Destino){
        write(Destino,inputDestino);
        switch (Destino){
            case "Lisboa":
                By destinoLisboa = By.xpath("(//b[@class=\"display-16ky3fq-Autocompleter-styled\"])[1]");
                click(destinoLisboa);
                break;

            case "Roma":
                By destinoRoma = By.xpath(" (//b[@class=\"display-16ky3fq-Autocompleter-styled\"])[2]");
                click(destinoRoma);
                break;
            case "Londres":
                By destinoLondres = By.xpath("(//b[@class=\"display-16ky3fq-Autocompleter-styled\"])[2]");
                click(destinoLondres);
        }

    }
    public void desplegarPasajeros(){
        click(botonDesplegarPasajeros);
    }
    public void masPasajeros(){
        By masAdultos = By.xpath("(//button[@class=\"display-1s7lzx-Counter-styled\"])[2]");
        click(masAdultos);
    }

    public void desplegarClases(){
        click(botonDesplegarClases);
        By claseTurista = By.xpath("//div[text()=\"Turista\"]\t ");
        click(claseTurista);
    }

    public void establecerFechaViaje(){
        click(BotonCalendarioIda);
        By ida = By.xpath("(//button[text()='24'])[1]");
        click(ida);
        By vuelta = By.xpath("(//button[text()='31'])[1]");
        click(vuelta);
    }

    public void buscarViaje(){click(botonBuscar);}


    public String SinResultados(){
        By sinResultados = By.xpath("//span[@class=\"display-s2q7wx-ValidationMessage-styled-ValidationMessage-styled\"]");
        return getText(sinResultados);
    }



}
