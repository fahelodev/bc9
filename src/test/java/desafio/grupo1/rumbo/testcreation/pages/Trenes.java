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
    By leerMasOfertasAve= By.xpath("(//span[@class=\"show-more--divided\"])[1]");
    By leerMasFuncionaRumbo = By.xpath("(//span[@class=\"show-more--divided\"])[2]");
    By ofertasRenfe= By.xpath("(//div[@class=\"display-1aslju6-HubFeatureCard-styled e1apqt34\"])[1]");
    By textoErrorTren= By.xpath("//span[text()='No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.']");
    By chequeoLeerMasAve= By.xpath("//a[text()='Billetes de AVE más hotel a Madrid']");
    By chequeoLeerMasRumbo= By.xpath("//h3[text()='Ventajas del buscador de Rumbo']");
    By seccionModifDespleg = By.xpath("//div[@class=\"search-summary__search-widget-bar with-animation--open\"]");
    By containerMsjError=By.xpath("//div[@class=\"display-ecv2-HubNoResults-styled e1nej8py3\"]");

    //---------SECCION TRENES----------
    By btnTrenes = By.xpath("(//li/div/a[@title=\"Trenes\"])[1]");
    By menuTrenes = By.xpath("//div[@class='lmn-sw-train searchContainer lmn-sw-trainContainer']");
    By origen= By.xpath("(//div[@class=\"lmn-sw-select-responsive light custom-select-responsive\"])[1]");
    By btnIdayVuelta= By.xpath("//div[@data-type=\"round_trip\"]");
    By btnIdaSolo= By.xpath("//div[@data-type=\"one_way\"]");
    By msjErrorSeleccionaDestino = By.xpath("//div[@class=\"validation-error\"]");
    By btnBuscarTren= By.xpath("//div[@class=\"lmn-sw-submitFlightContainer\"]");
    By listaDesplegadaOrigen= By.xpath("//div[@class=\"select-items\"]");
    By btnModificar = By.xpath("//span[text()=\"Modificar\"]");


    //---------CALENDARIO-----------
    By calDesplegado = By.xpath("(//div[@class=\"dropdownContent\"])[1]");
    By fechaIda= By.xpath("//div[@data-date=\"22-7-2022\"]");
    By fechaVuelta= By.xpath("//div[@data-date=\"24-7-2022\"]");
    By datoFecha = By.xpath("//div[@class=\"search-summary__date\"]");
    By fechaIdaUnica= By.xpath("//div[@data-date=\"19-7-2022\"]");
    By buscarSoloIda= By.xpath("(//div[@class=\"lmn-sw-submitFlightContainer\"])");
    By seleccionFechaIda = By.xpath("//div[@data-date=\"28-7-2022\"]");
    By seleccionFechaVuelta = By.xpath("//div[@data-date=\"31-7-2022\"]");

    //---------ORIGEN Y DESTINO-----------
    By opcionOrigenACorunia = By.xpath("//div[@data-value=\"YJC\"]");
    By opcionOrigenAlicante= By.xpath("//div[@data-value=\"YJE\"]");
    By opcionDestinoAlicante= By.xpath("(//div[@data-value=\"YJE\"])[2]");
    By opcionOrigenBarcelona=By.xpath("(//div[text()='Barcelona'])[1]");
    By opcionDestinoMadrid= By.xpath("(//div[@data-value=\"MAD\"])[2]");
    By opcionOrigenAgde = By.xpath("//div[@data-value=\"XAG\"]");
    By opcionDestinoGirona = By.xpath("(//div[text()=\"Girona\"])[2]");
    By BrcAli= By.xpath("//div[@class=\"search-summary__section search-summary__section--place\"]");

    //---------LISTADO TRENES-----------
    By precioMasBaratoTab= By.xpath("(//div[@class=\"sorting-tabs-view__amount\"])[5]");
    By trenMasBarato= By.xpath("(//span[@color=\"var(--lmn-ds-colors-primary-400)\"])[1]");



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
        if(!isDisplayed(listaDesplegadaOrigen)){
            esperaEnSegundosYClick(15, origen);
        }
        esperaEnSegundosYClick(15,opcionOrigenACorunia);
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
        if(!isDisplayed(listaDesplegadaOrigen)){
            esperaEnSegundosYClick(5, origen);
        }
        esperaEnSegundosYClick(15, opcionOrigenACorunia);
        esperaEnSegundosYClick(10, opcionDestinoMadrid);
        if (isDisplayed(calDesplegado)) {
            esperaEnSegundosYClick(10, seleccionFechaIda);
            esperaEnSegundosYClick(10, seleccionFechaVuelta);
        }
        click(btnBuscarTren);
    }

    public void modificarViajeTren(){
        esperaEnSegundosYClick(5, btnModificar);
        eWait(15).until(ExpectedConditions.visibilityOfElementLocated(seccionModifDespleg));
        if (!isDisplayed(listaDesplegadaOrigen)){
            esperaEnSegundosYClick(8, origen);
        }
        esperaEnSegundosYClick(8, opcionOrigenAgde);
        esperaEnSegundosYClick(8, opcionDestinoGirona);
        esperaEnSegundosYClick(5, btnBuscarTren);
    }

    public String datosModificados(){
        String datos = getText(datoFecha);
        System.out.println(datos);
        return datos;
    }

    public void viajeTrenFiltro() throws InterruptedException {

        if(!isDisplayed(listaDesplegadaOrigen))
        {
            esperaEnSegundosYClick(10,origen);
        }
        esperaEnSegundosYClick(10,opcionOrigenAlicante);
        esperaEnSegundosYClick(10,opcionDestinoMadrid);
        if (isDisplayed(calDesplegado)) {
            esperaEnSegundosYClick(10, fechaIda);
            esperaEnSegundosYClick(10, fechaVuelta);
        }
        click(btnBuscarTren);

        }
    public String chequeoMenorPrecio(){
        String chequeo= getText(trenMasBarato);
        System.out.println(chequeo);
        return chequeo;
        }
    public String chequeoMenorPrecioTab(){
        String chequeo= getText(precioMasBaratoTab);
        System.out.println(chequeo);
        return chequeo;
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

        eWait(10).until(ExpectedConditions.visibilityOfElementLocated(containerMsjError));
        String chequeo=getText(textoErrorTren);
        System.out.println(chequeo);
        return chequeo;
        }
    public void cambioPag(){
        //eWait(10).until(ExpectedConditions.visibilityOfElementLocated(ofertasRenfe));

        esperaEnSegundosYClick(10,ofertasRenfe);
        }

    public void viajeSoloIda() {
        esperaEnSegundosYClick(10,btnIdaSolo);
        if(!isDisplayed(listaDesplegadaOrigen))
        {
            esperaEnSegundosYClick(10,origen);
        }
        esperaEnSegundosYClick(10,opcionOrigenBarcelona);
        esperaEnSegundosYClick(10,opcionDestinoAlicante);
        if (isDisplayed(calDesplegado)) {
            esperaEnSegundosYClick(10, fechaIdaUnica);
            }
        esperaEnSegundosYClick(10,buscarSoloIda);
        }
    public String datosViajeIda(){
        String chequeo=getText(BrcAli);
        System.out.println(chequeo);
        return chequeo;
        }




}
