package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class Trenes extends SeleniumWrapper {

    public Trenes(WebDriver driver) {
        super(driver);
    }

    //---------LOCALIZADORES-----------
    By btnAceptarCokies = By.xpath("//button[@data-qa='oil-YesButton']");  /*btn cook hacer click*/
    By btnTrenes = By.xpath("(//li/div/a[@title=\"Trenes\"])[1]");
    By textAreaOrigen = By.xpath("//div[text()=\"Origen\"]");
    By origen= By.xpath("((//div[@class=\"lmn-sw-custom-select left-icon\"])[1]");
    By destino= By.xpath("(//div[@class=\"lmn-sw-custom-select left-icon\"])[2]");
    By opcionOrigenACorunia = By.xpath("//div[@data-value=\"YJC\"]");
    By btnBuscar = By.xpath("(//div[@tabindex='1'])[2]");
    By msjErrorSeleccionaDestino = By.xpath("//div[@class=\"validation-error__content\"])[2]");
    By btnTrenesMenu= By. xpath("(//a[@title=\"Trenes\"])[1]");
    By btnIdayVuelta= By.xpath("//div[@data-type=\"round_trip\"]");
    By btnIdaSolo= By.xpath("//div[@data-type=\"one_way\"]");
    By opcionOrigenAlicante= By.xpath("//div[@data-value=\"YJE\"]");
    By textAreaDestino= By.xpath("//div[text()=\"Destino\"]");
    By opcionDestinoMadrid= By.xpath("(//div[@data-value=\"MAD\"])[2]");
    By calendarioIzq= By.xpath("(//div[@class=\"timeBox\"])[1]");
    By calendarioDer= By.xpath("(//div[@class=\"timeBox\"])[2]");
    By fechaIda= By.xpath("//div[@data-date=\"22-7-2022\"]");
    By fechaVuelta= By.xpath("//div[@data-date=\"24-7-2022\"]");
    By listaPasajero= By.xpath("//div[@class=\"lmn-sw-passengersContainer\"]");
    By btnBuscarTren= By.xpath("//div[@class=\"lmn-sw-submitFlightContainer\"]");
    By ordenarMenorPrecio= By.xpath("(//ul[@role=\"tablist\"])[2]/descendant::li[@data-value=\"price.asc\"]");
    By leerMasOfertasAve= By.xpath("(//span[@class=\"show-more--divided\"])[1]");
    By leerMasFuncionaRumbo = By.xpath("(//span[@class=\"show-more--divided\"])[2]");
    By ofertasRenfe= By.xpath("(//div[@class=\"display-1aslju6-HubFeatureCard-styled e1apqt34\"])[1]");
    By textoErrorTren= By.xpath("//span[text()='No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.']");
    By primerViernes= By.xpath("(//div[text()='26'])[1]");
    By chequeoLeerMasAve= By.xpath("//a[text()='Billetes de AVE más hotel a Madrid']");
    By chequeoLeerMasRumbo= By.xpath("//h3[text()='Ventajas del buscador de Rumbo']");





    //----------METODOS-----------

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }
    public void aceptarCookies(){
        click(btnAceptarCokies);
    }
    public void seccionTrenes(){
        click(btnTrenes);
    }

    public void viajeEnTrenSinDestino(){
        esperaEnSegundosYClick(3,btnTrenes);
       esperaEnSegundosYClick(5,textAreaOrigen);
        esperaEnSegundosYClick(5,opcionOrigenACorunia);
        click(btnBuscar);
    }

    public String msjErrorDestino(){
        return getText(msjErrorSeleccionaDestino);
    }


    public void viajeTrenFiltro() throws InterruptedException {
        esperaEnSegundosYClick(10,textAreaOrigen);

        esperaEnSegundosYClick(10,opcionOrigenAlicante);
        esperaEnSegundosYClick(10,opcionDestinoMadrid);
        esperaEnSegundosYClick(10,calendarioIzq);
        esperaEnSegundosYClick(8,fechaIda);
        esperaEnSegundosYClick(8,fechaVuelta);
        click(btnBuscarTren);
        esperaEnSegundosYClick(10,ordenarMenorPrecio);
    }

    public String leerMasListasAve(){
        esperaEnSegundosYClick(10,leerMasOfertasAve);
        String chequeo= getText(chequeoLeerMasAve);
        System.out.println(chequeo);
        return chequeo;
    }
    public String leerMasRumbo(){
        esperaEnSegundosYClick(10,leerMasFuncionaRumbo);
        String chequeo= getText(chequeoLeerMasRumbo);
        System.out.println(chequeo);
        return chequeo;
    }

    public String errorRenfe(){
        //guardarPag();
        esperaEnSegundosYClick(10,ofertasRenfe);
        //switchTo(1);
        String chequeo=getText(textoErrorTren);
        System.out.println(chequeo);
        return chequeo;

    }






}
