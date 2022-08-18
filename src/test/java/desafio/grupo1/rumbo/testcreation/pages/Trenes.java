package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class Trenes extends SeleniumWrapper {

    public Trenes(WebDriver driver) {
        super(driver);
    }

    //---------LOCALIZADORES-----------
    By btnAceptarCokies = By.xpath("//button[@data-qa='oil-YesButton']");  /*btn cook hacer click*/
    By btnTrenes = By.xpath("(//li/div/a[@title=\"Trenes\"])[1]");
    By menuTrenes = By.xpath("//div[@class='lmn-sw-train searchContainer lmn-sw-trainContainer']");
    By textAreaOrigen = By.xpath("//div[text()=\"Origen\"]");
    By origen1 = By.xpath("(//div[@class=\"lmn-sw-select-responsive light custom-select-responsive\"])[1]");
    By menuOrigenDestino = By.xpath("//div[@class='mainFieldsContainer']");
    By listaOrigenDespleg = By.xpath("//div[@class=\"select-items\"]");
    By origen= By.xpath("((//div[@class=\"lmn-sw-custom-select left-icon\"])[1]");
    By destino= By.xpath("(//div[@class=\"lmn-sw-custom-select left-icon\"])[2]");
    By opcionOrigenACorunia = By.xpath("//div[@data-value=\"YJC\"]");
    By msjErrorSeleccionaDestino = By.xpath("descendant::div[@class=\"validation-error__content\"]");
    By btnTrenesMenu= By. xpath("(//a[@title=\"Trenes\"])[1]");
    By btnIdayVuelta= By.xpath("//div[@data-type=\"round_trip\"]");
    By btnIdaSolo= By.xpath("//div[@data-type=\"one_way\"]");
    By opcionOrigenAlicante= By.xpath("//div[@data-value=\"YJE\"]");
    By textAreaDestino= By.xpath("//div[text()=\"Destino\"]");
    By opcionDestinoMadrid= By.xpath("(//div[@data-value=\"MAD\"])[2]");
    By calendarioIzq= By.xpath("(//div[@class=\"display-pfh0xi\"])/button");
    By calDesplegado = By.xpath("(//div[@class=\"dropdownContent\"])[1]");
    By calendarioDer= By.xpath("(//div[@class=\"timeBox\"])[2]");
    By seleccionFechaIda = By.xpath("//div[@data-date=\"28-7-2022\"]");
    By seleccionFechaVuelta = By.xpath("//div[@data-date=\"31-7-2022\"]");
    By fechaIda= By.xpath("//div[@data-date=\"22-7-2022\"]");
    By fechaVuelta= By.xpath("//div[@data-date=\"24-7-2022\"]");
    By listaPasajero= By.xpath("//div[@class=\"lmn-sw-passengersContainer\"]");
    By btnBuscarTren= By.xpath("//div[@class=\"lmn-sw-submitFlightContainer\"]");
    By btnModificar = By.xpath("//span[text()=\"Modificar\"]");
    By seccionModifDespleg = By.xpath("//div[@class=\"search-summary__search-widget-bar with-animation--open\"]");
    By seccionViajeTren = By.xpath("//div[@class=\"lmn-sw-train searchContainer lmn-sw-trainContainer\"]");
    By nuevoOrigen = By.xpath("(//div[@data-value=\"\"])[1]");
    By nuevoDestino = By.xpath("(//div[@data-value=\"\"])[2]");
    By opcionOrigenAgde = By.xpath("//div[@data-value=\"XAG\"]");
    By opcionDestinoGirona = By.xpath("(//div[text()=\"Girona\"])[2]");
    By btnBuscar = By.xpath("(//div[@tabindex=\"-1\"])[2]");
    By seccionDatosModif = By.xpath("//div[@class=\"search-summary__content\"]");
    By ordenarMenorPrecio= By.xpath("(//ul[@role=\"tablist\"])[2]/descendant::li[@data-value=\"price.asc\"]");
    By leerMasOfertasAve= By.xpath("(//span[@class=\"show-more--divided\"])[1]");
    By leerMasFuncionaRumbo = By.xpath("(//span[@class=\"show-more--divided\"])[2]");
    By ofertasRenfe= By.xpath("(//div[@class=\"display-1aslju6-HubFeatureCard-styled e1apqt34\"])[1]");
    By textoErrorTren= By.xpath("//span[text()='No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.']");
    By primerViernes= By.xpath("(//div[text()='26'])[1]");
    By chequeoLeerMasAve= By.xpath("//a[text()='Billetes de AVE más hotel a Madrid']");
    By chequeoLeerMasRumbo= By.xpath("//h3[text()='Ventajas del buscador de Rumbo']");
    By datoFecha = By.xpath("//div[@class=\"search-summary__date\"]");





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

    public void viajeEnTrenSinDestino() {
        eWait(15).until(ExpectedConditions.visibilityOfElementLocated(menuOrigenDestino));
        esperaEnSegundosYClick(15, origen1);
        if(isDisplayed(listaOrigenDespleg)){
            esperaEnSegundosYClick(15,opcionOrigenACorunia);
        }
        esperaEnSegundosYClick(10, btnBuscarTren);
    }

    public String msjErrorDestino() {
        String msjError = getText(msjErrorSeleccionaDestino);
        System.out.println(msjError);
        return msjError;
    }

    public void buscarViajeTren(){
        eWait(15).until(ExpectedConditions.visibilityOfElementLocated(menuTrenes));
        esperaEnSegundosYClick(3, btnIdayVuelta);
        esperaEnSegundosYClick(5, textAreaOrigen);
        esperaEnSegundosYClick(15, opcionOrigenACorunia);
        esperaEnSegundosYClick(10, opcionDestinoMadrid);
        if (isDisplayed(calDesplegado)) {
            esperaEnSegundosYClick(10, seleccionFechaIda);
            esperaEnSegundosYClick(10, seleccionFechaVuelta);
        }
        click(btnBuscarTren);
    }

    public void modificarViajeTren(){
        esperaEnSegundosYClick(3, btnModificar);
        eWait(15).until(ExpectedConditions.visibilityOfElementLocated(seccionModifDespleg));
        if (isDisplayed(seccionViajeTren)){
            esperaEnSegundosYClick(8, nuevoOrigen);
            esperaEnSegundosYClick(8, opcionOrigenAgde);
            esperaEnSegundosYClick(10, opcionDestinoGirona);
            esperaEnSegundosYClick(5, btnBuscar);
        }
    }

    public String datosModificados(){
        String datos = getText(datoFecha);
        System.out.println(datos);
        return datos;
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
