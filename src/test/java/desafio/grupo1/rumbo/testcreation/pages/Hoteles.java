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

    //----------------LOCALIZADORES PRUEBA ID_H01
    By btnDestino = By.xpath("//*[@id=\"mui-1\"]");
    By btnCualquierDestino= By.xpath("//*[@id=\"mui-1-option-0\"]");
    By btnHabitaciones= By.xpath("//div[@class='display-x5p9rc-Dropdown-styled']");
    By agregarHabitaciones= By.xpath("//button[@class='display-iohcwh-ParticipantsDropdown-styled'] ");
    By filtroHabitacion= By.xpath("//div[@class='styled__PlaceholderStyled-sc-hqc7hu-0 buZeto openx-ui-header-collapsed-placeholder-people']");


    //----------------LOCALIZADORES PRUEBA ID_H02---------------
    By btnFiltroEstrellas= By.xpath("(//div[@class='styled__CustomCompStyledLabel-sc-1v205vs-1 izWgpy custom-radio-check'])[2]");
    By btn4Estrellas = By.xpath("(//div[@class='styled__CustomOverlayItem-sc-1prstuv-0 kiZdSH'])[2]");
    By btnBuscarEstrellas = By.xpath("//button[contains(text(),'Aplicar')] ");
    By filtroEstrellas = By.xpath("//div[@class='styled__StarsLabel-sc-mcln4k-0 eVomHt']");


    //----------------LOCALIZADORES PRUEBA ID_H03---------------
    By btnFiltroPrecio = By.xpath("//div[@class='styled__CustomCompStyledLabel-sc-1v205vs-1 izWgpy openx-ui-price-and-range']");
    By btn0a300 = By.xpath("(//div[@class='styled__RangesContainerItem-sc-vm35j3-2 eKBkSD'])[3]");
    By btnAplicarPrecio = By.xpath("//button[@class='styled__ApplyStyled-sc-18vcrz8-4 cHQYkF']");
    By filtroRango = By.xpath("//div[@class='styled__CustomCompStyledLabel-sc-1v205vs-1 dIGINx openx-ui-price-and-range']");


    //----------------LOCALIZADORES PRUEBA ID_H04
    By btnHotelesRurales = By.xpath("//div[@class='display-1aslju6-HubFeatureCard-styled e1apqt34'] ");
    By textoHotelesRurales= By.xpath("(//div/h1)[1]");

    By paginaGral= By.xpath("//html[@lang=\"es\"]");


    //----------------LOCALIZADORES PRUEBA ID_H05
    By btnMiRumbo = By.xpath("(//button[@class=\"display-1kl1c3w-HubNavigationProfile-styled esa6j1t10\"])[1]");
    By seccionLogin = By.xpath("//div[@class=\"modal-content\"]");
    By areaEmail = By.xpath("//input[@id=\"lmn_login_widget_modal__email-input\"]");
    By areaContrasenia = By.xpath("//input[@id=\"lmn_login_widget_modal__password-input\"]");
    By btnIniciarSesion = By.xpath("//button[@data-role=\"login\"]");
    By txtAreaADondeQuieresIr = By.xpath("//*[@id=\"mui-1\"]");
    By calendarFechaIda = By.xpath("//button[@class=\"display-5j7qlk-DateInput-styled\"]");
    By calDesplegado = By.xpath("(//div[@role=\"dialog\"])[2]");
    By seleccionFechaIda = By.xpath ("(//button[text()='28'])[1]");
    By seleccionFechaVuelta = By.xpath("//button[text()='31']");
    By btnBuscar = By.xpath("//div/button[@type=\"submit\"]");
    By opcionHotelHardRock = By.xpath("//div[text()=\"Hard Rock Hotel Cancun All-Inclusive\"]");
    By btnElegirTipoDeHabitacion = By.xpath("//button[text()=\"Elegir tipo de habitación\"]");
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
    By nombreUser = By.xpath("//input[@name=\"name\"]");
    By apellidoUser = By.xpath("//input[@name=\"surname\"]");
    By emailUser = By.xpath("//input[@name=\"email\"]");
    By telefonoUser = By.xpath("//input[@name=\"phone\"]");


    //---------------------INICIALIZAR PAGINA---------------------

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }
    public void aceptarCookies(){
        click(btnAceptarCokies);
    }

    //---------------------METODOS----------------------
    public void seccionHoteles(){ click(btnHoteles);}
    public String busquedaHabitacionPorPersona(){
        //String filtro;
        click(btnDestino);
        esperaEnSegundosYClick(10,btnCualquierDestino);
        esperaEnSegundosYClick(10,btnHabitaciones);
        esperaEnSegundosYClick(10,agregarHabitaciones);
        esperaEnSegundosYClick(10,btnBuscar);
        String filtro = getText(filtroHabitacion);
        return filtro;
    }
    public String busquedaFiltroEstrellas() throws InterruptedException {
        click(btnDestino);
        Thread.sleep(5000);
        click(btnBuscar);
        Thread.sleep(6000);
        click(btnFiltroEstrellas);
        Thread.sleep(7000);
        click(btn4Estrellas);
        Thread.sleep(5000);
        click(btnBuscarEstrellas);
        String filtroEstrella = getText(filtroEstrellas);
        return filtroEstrella;
    }
    public String busquedaFiltroRangoDePrecio() throws InterruptedException {
    click(btnDestino);
    Thread.sleep(3000);
    click(btnBuscar);
    Thread.sleep(4000);
    click(btnFiltroPrecio);
    Thread.sleep(3000);
    click(btn0a300);
    click(btnAplicarPrecio);
    Thread.sleep(4000);
    String filtroRangoPrecio = getText(filtroRango);
    return filtroRangoPrecio;
    }
    public void tituloHoteleresRurales(){
    click(btnHotelesRurales);
    }
    public String getHoteles(){
        String checkeo =getText(textoHotelesRurales);
        System.out.println(checkeo);
        return  checkeo;

    }

    public void logueoMiRumbo() throws InterruptedException {
        eWait(10).until(ExpectedConditions.visibilityOfElementLocated(paginaGral));
        Thread.sleep(5000);
        esperaEnSegundosYClick(5, btnMiRumbo);
        if(isDisplayed(seccionLogin)){
            esperaEnSegundosYClick(5, areaEmail);
            write("equipo1desafiotsoft@gmail.com", areaEmail);
            esperaEnSegundosYClick(5, areaContrasenia);
            write("equipo1tsoft", areaContrasenia);
            esperaEnSegundosYClick(5, btnIniciarSesion);
        }
    }

    public void buscarHotel() throws InterruptedException {
        //eWait(10).until(ExpectedConditions.visibilityOfElementLocated(seccionHoteles));
        write("cancun", txtAreaADondeQuieresIr);
        Thread.sleep(3000);
        esperaEnSegundosYClick(5, calendarFechaIda);
        if(isDisplayed(calDesplegado)){
            esperaEnSegundosYClick(10, seleccionFechaIda);
        }
        Thread.sleep(5000);
        if(isDisplayed(calDesplegado)){
            esperaEnSegundosYClick(15, seleccionFechaVuelta);
        }
        esperaEnSegundosYClick(5, btnBuscar);
        Thread.sleep(3000);
        esperaEnSegundosYClick(10, opcionHotelHardRock);
    }
    public void elegirTipoHabitacion(){
        esperaEnSegundosYClick(10, btnElegirTipoDeHabitacion);
        esperaEnSegundosYClick(10, btnTipoHabContinuar);
    }
    public String datosHotel(){
        String datos = findElement(seccionDatosHotel).getText();
        System.out.println(datos);
        return datos;
    }

    public String datoNombre() {
        String nombreUsuario = findElement(nombreUser).getAttribute("value");
        System.out.println(nombreUsuario);
        return nombreUsuario;
    }
    public String datoApellido() {
        String apellidoUsuario = findElement(apellidoUser).getAttribute("value");
        System.out.println(apellidoUsuario);
        return apellidoUsuario;
    }
    public String datoEmail() throws InterruptedException {
        Thread.sleep(2000);
        String emailUsuario = findElement(emailUser).getAttribute("value");
        System.out.println(emailUsuario);
        return emailUsuario;
    }
   public String datoTelefono() throws InterruptedException {
        Thread.sleep(2000);
        String telefonoUsuario = findElement(telefonoUser).getAttribute("value");
        System.out.println(telefonoUsuario);
        return telefonoUsuario;
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
