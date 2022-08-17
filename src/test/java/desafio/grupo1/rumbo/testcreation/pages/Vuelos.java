package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class Vuelos extends SeleniumWrapper {
    //Identificacion de localizadores

    //**cooki inicial
    By btnAceptarCokies = By.xpath("//button[@data-qa='oil-YesButton']"); //btn cook hacer click

    //**Menu para realizar busqueda vuelo
    By inputOrigen = By.xpath("//input[@id='mui-1']"); // borrar lo escrito por default
    By inputDestino = By.xpath("//input[@id='mui-2']");
    By btnMenuVuelo = By.xpath("(//a[@href='https://www.rumbo.es/vuelos/'])[1]");
    By btnLimpiarOrigen = By.xpath("(//div[@role='button'])[1]");
    By listaVuelosOrigen = By.xpath("//ul[@id='mui-1-listbox']");
    By listaVuelosDestino =By.xpath("//ul[@id='mui-2-listbox']");
    By listaVueloDestinoRecorrer = By.xpath("//ul[@id='mui-2-listbox']/li");




    //seccion de opciones destino
    By btnOrigenArgentina = By.xpath("//ul[@id='mui-1-listbox']/li[@id='mui-1-option-0']");
    By btnDestinoSantiago = By.xpath("//ul[@id='mui-2-listbox']/li[@id='mui-2-option-1']");

    //seccion tipo vuelo
    By btnSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");
    By btnMultidestino = By.xpath("//a[contains(text(),'Multidestino')]");
    By btnIdaVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");

    //seccion pasajeros
    By btnPasajeros = By.xpath("//div[contains(text(),'1 adulto')]"); // ver como cerrar la ventana
    By btnMinAdulto = By.xpath("(//button[@class='display-1s7lzx-Counter-styled'])[1]");
    By btnMasAdulto = By.xpath("(//button[@class='display-1s7lzx-Counter-styled'])[2]");
    By btnMinNino =  By.xpath("(//button[@class='display-1s7lzx-Counter-styled'])[3]");
    By btnMasNino =  By.xpath("(//button[@class='display-1s7lzx-Counter-styled'])[4]");
    By btnMinBebe =  By.xpath("(//button[@class='display-1s7lzx-Counter-styled'])[5]");
    By btnMasBebe = By.xpath("(//button[@class='display-1s7lzx-Counter-styled'])[6]");

    //seccion clase
    By btnTipoClase = By.xpath("(//div[@class='visible display-1c9d0qv-Container-styled'])//*[text()='Cualquier clase']");
    By listaClase = By.xpath("//div[@class='display-1q6oxg9']");
    By btnTurista = By.xpath("//div[@class='display-611hh1-DropdownList-styled-DropdownList-styled'][text()='Turista']");
    By btnTuristaPremiun = By.xpath("//div[@class='display-611hh1-DropdownList-styled-DropdownList-styled'][text()='Turista Premium']");
    By btnBusines = By.xpath("//div[@class='display-611hh1-DropdownList-styled-DropdownList-styled'][text()='Business']");
    By btnPrimera = By.xpath("//div[@class='display-611hh1-DropdownList-styled-DropdownList-styled'][text()='Primera']");

    //seccion fecha
    By btnMenuFechaIda = By.xpath("//div[@class='display-pfh0xi'][1]");
    By btnMenuFechaVuelta = By.xpath("//div[@class='display-pfh0xi'][2]");
    By btnFechaIda = By.xpath("//div[@aria-labelledby='7']/descendant::button[text()='26']"); // CAMBIAR NUMERO MES Y FECHA
    By btnFechaVuelta = By.xpath("//div[@aria-labelledby='8']/descendant::button[text()='25']"); // CAMBIAR NUMERO MES Y FECHA

    //boton buscar
    By btnBuscar = By.xpath("//button[contains(text(),'Buscar')]");

//***************************************************************************************************
// Localizadores pagina de resultado de busqueda

    //Seccion modificar datos
    By btnModificar = By.xpath("//div[@class='search-summary__section search-summary__section--search']");
    By listaDatosModificar = By.xpath("//div[@class='search-summary__search-widget-bar with-animation--open']");
    //Seccion tipo vuelo (ida/idauelta/Multidestino) Mantiene localizadores

    By btnModificarOrigen = By.xpath("//input[@id='input-bs4m3']");
    By getBtnModificarDestino = By.xpath("//input[@id='input-sg6pv']");

    //Seccion Pasajeros
    By listaModificarPasajeros = By.xpath("//div[@class='lmn-sw-secondaryFieldsContainer']//div[@class='dropdownResponsive']");
    By btnModificarPasajeros = By.xpath("//div[@class='passengersText lmn-sw-responsive-form-field lmn-sw-tooltip-responsive__text']");
    By btnModificarMinAdulto = By.xpath("(//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-minus'])[1]");
    By btnModificarMasAdulto = By.xpath("(//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-plus'])[1]");
    By btnModificarMinNino = By.xpath("(//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-minus'])[2]");
    By btnModificarMasNino = By.xpath("(//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-plus'])[2]");
    By btnModificarMinBebe = By.xpath("(//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-minus'])[3]");
    By btnModificarMasBebe = By.xpath("(//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-plus'])[3]");

    //Seccion tipo Clase
    By btnModificarClase = By.xpath("//div[@class='select-selected']");
    By getBtnModificarTurista = By.xpath("//div[@data-value='Y']");
    By getBtnModificarTuristaPrem = By.xpath("//div[@data-value='P']");
    By getBtnModificarBusines = By.xpath("//div[@data-value='C']");
    By getBtnModificarPrimera = By.xpath("//div[@data-value='F']");

    //Boton busqueda modificar
    By btnModificarBuscar = By.xpath("//div[contains(text(),'Buscar')]");

//SECCION DE CHECKBOX

    By checkAerolineasArgentina = By.xpath("//span[@class='checkboxlist-filter-view__desc desc']//*[text()='Aerolineas Argentinas']");
    //detectar los check totales de la pagina : //span[@class='check']

    //Escalas //funcionan para ida          || PARA USO DE IDA Y VUELTA CAMBIAR EL DATA [2]
    By checkNinguna = By.xpath("(//div[@data-e2e='stops-filter'])[1]//span[text()='Ninguna']");
    By checkUnaEscala = By.xpath("(//div[@data-e2e='stops-filter'])[1]//span[text()='1 escala']");
    By checkDosMasEscala = By.xpath("(//div[@data-e2e='stops-filter'])[1]//span[text()='2 escalas o más']");

    //***************************************************************************************************
    //Login
    By btnMiRumbo = By.xpath("(//button[@class='display-1kl1c3w-HubNavigationProfile-styled esa6j1t10'])[1]");
    By inputEmail = By.xpath("//input[@name='email']");
    By inputPassword = By.xpath("//input[@name='password']");
    By menuLogin = By.xpath("//div[@class='modal-body']");
    By btnLogin = By.xpath("//button[contains(text(),'Iniciar sesión')]");

    //Seleccion Vuelos del listado despues de generar vuelo **************************************************************
    By listadoVuelos = By.xpath("//div[@class='content-layout-view__column-right col-md-9']");
    By primeroDeListaVuelos = By.xpath("(//div[@class='FullTripCard__PaymentContainer-sc-z8znd4-3 bjAqvb'])[1]");

    //*************************************************************************
    //Seccion servicios
    By btnPagoFlexible = By.xpath("//div[@id='']//*[text()='Elegir Flexible']");
    //Seccion Multidestino
    By btnCerrarPopMultidestino = By.xpath("//div[@class='Modal__ModalWrapperContent-sc-15ie1vv-3 cZmLcP']//button[@data-test=\"ModalCloseButton\"]");
    By btnAceptarCokiesMultidestino = By.xpath("//button[@id='cookies_accept']");





    public Vuelos(WebDriver driver) {
        super(driver);

    }

    //inicio

    public void navegarAlHomeWeb(){
        navigateTo(BASE_URL_AUT);

    }




    public void aceptarCokies(){
        click(btnAceptarCokies);
    }
    public void seleccionarMenuVuelo(){
        click(btnMenuVuelo);

    }


    public void generarVuelo() throws InterruptedException {
        Thread.sleep(2000);

        click(btnSoloIda);
        //findElements(listaVueloDestinoRecorrer).get(1).click();
          /*
            for (WebElement option: findElements(listaVueloDestinoReal)) {
                if(option.getText().contentEquals(" (SCL) Arturo Merino Benítez, Chile"));
                    System.out.println(option.getText());
                    option.click();

            }

*/// Para correr listas desplegables

        //origen
        click(btnLimpiarOrigen); // apretar en la x
        write("Buenos Aires",inputOrigen);

           if(isDisplayed(listaVuelosOrigen))
               click(btnOrigenArgentina);
        Thread.sleep(2000); // MODIFICAR TIEMPO

        //destino
        write("Santiago",inputDestino);

        if(isDisplayed(listaVuelosDestino)){// Nose como hacer guardar de 1 el listado AYUDA
            click(btnDestinoSantiago);
            Thread.sleep(2000);

        }

        //fecha ida
        if (isDisplayed(btnMenuFechaIda)){
            click(btnFechaIda);
            Thread.sleep(2000);
        }

        //claseTurista
            click(btnTipoClase);
        if(isDisplayed(listaClase)){
            click(btnTurista);
            Thread.sleep(2000);
        }

        //generar busqueda
            click(btnBuscar);

    }

    //Multidestino
    public void seleccionarMultidestino(){
        click(btnMultidestino);
    }


    //Generar Modificacion




    public void seleccionarModificar(){
        click(btnModificar);
    }





    public void modificarVuelo() throws InterruptedException {

        if(isDisplayed(listaDatosModificar)) {

            //modificar pasajero
            click(btnModificarPasajeros);
            Thread.sleep(2000);
            if (isDisplayed(listaModificarPasajeros)) {
                click(btnModificarMasAdulto); //aumento adulto
                click(btnModificarBuscar);
            }


        }
    }





    public void logearseEnPagina() throws InterruptedException {
       Thread.sleep(5000);
        click(btnMiRumbo);
        Thread.sleep(5000);
        if(isDisplayed(menuLogin)){
            write("equipo1desafiotsoft@gmail.com",inputEmail);
            write("equipo1tsoft",inputPassword);
            click(btnLogin);
        }
        Thread.sleep(4000);



    }


    public void seleccionarPrimerVuelo(){

        if(isDisplayed(listadoVuelos))
        click(primeroDeListaVuelos);

    }

    public void seleccionarServicio(){
        click(btnPagoFlexible);
    }


    public void seleccionarCompania(){
        click(checkAerolineasArgentina);
    }


    public void cerrarVentanasEmergente() throws InterruptedException {

        click(btnCerrarPopMultidestino);
        Thread.sleep(3000);
        click(btnAceptarCokiesMultidestino);


    }



}

