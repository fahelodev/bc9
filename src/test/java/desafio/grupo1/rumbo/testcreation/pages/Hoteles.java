package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class Hoteles extends SeleniumWrapper {


    public Hoteles(WebDriver driver) {
        super(driver);
    }
    By btnAceptarCokies = By.xpath("//button[@data-qa='oil-YesButton']");  /*btn cook hacer click*/
    By paginaGral= By.xpath("//html[@lang=\"es\"]");
    //----------------LOCALIZADORES PRUEBA ID_H05
    By btnMiRumbo = By.xpath("(//button[@class=\"display-1kl1c3w-HubNavigationProfile-styled esa6j1t10\"])[1]");
    By seccionLogin = By.xpath("//div[@class=\"modal-content\"]");
    By areaEmail = By.xpath("//input[@id=\"lmn_login_widget_modal__email-input\"]");
    By areaContrasenia = By.xpath("//input[@id=\"lmn_login_widget_modal__password-input\"]");
    By btnIniciarSesion = By.xpath("//button[@data-role=\"login\"]");
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
    By desplegarIdeasHotelesEspania = By.xpath ("//button/h5[text()=\"Ideas de destinos de hoteles en España\"]");
    By datosHotelesEspania = By.xpath("(//div/ul[@class=\"display-6yr8km-HubLinkList-styles ee89y333\"])[1]");
    By desplegarDestPopularesExtanj = By.xpath("//button/h5[text()=\"Destinos populares en el extranjero\"]");
    By datosDestinosExtranj = By.xpath("(//div/ul[@class=\"display-6yr8km-HubLinkList-styles ee89y333\"])[2]");
    By desplegarHtlesCiudadesEspa = By.xpath ("//button/h5[text()=\"Hoteles en ciudades españolas\"]");
    By datosHotelesCiudEsp = By.xpath("(//div/ul[@class=\"display-6yr8km-HubLinkList-styles ee89y333\"])[3]");
    By desplegarIdeasDeViajes = By.xpath("//button/h5[text()=\"Ideas de viaje\"]");
    By datosIdeasViajes = By.xpath("(//div/ul[@class=\"display-6yr8km-HubLinkList-styles ee89y333\"])[4]");


    //Identificar localizadores
    By btnDestino = By.xpath("//*[@id=\"mui-1\"]");
    By btnCualquierDestino= By.xpath("//*[@id=\"mui-1-option-0\"]");

    By btnHabitaciones= By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[3]/div[1]/div/div[1]");
    By agregarHabitaciones= By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[3]/div[1]/div/div[2]/div/div[2]/button");

    By filtroHabitacion= By.xpath("//*[@id=\"__next\"]/header/div[1]/div[3]/div[6]/span");
    //---------------------METODOS

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }
    public void aceptarCookies(){
        click(btnAceptarCokies);
    }

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

    public void desplegarListasHoteles(){
        eWait(10).until(ExpectedConditions.visibilityOfElementLocated(paginaGral));
        esperaEnSegundosYClick(20, desplegarIdeasHotelesEspania);
        isDisplayed(datosHotelesCiudEsp);
        esperaEnSegundosYClick(20, desplegarDestPopularesExtanj);
        isDisplayed(datosDestinosExtranj);
        esperaEnSegundosYClick(20, desplegarHtlesCiudadesEspa);
        isDisplayed(datosHotelesCiudEsp);
        esperaEnSegundosYClick(20, desplegarIdeasDeViajes);
        isDisplayed(datosIdeasViajes);

    }



}
