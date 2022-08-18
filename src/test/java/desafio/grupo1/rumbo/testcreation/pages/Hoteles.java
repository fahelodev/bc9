package desafio.grupo1.rumbo.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    //----------------LOCALIZADORES PRUEBA ID_H05
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
    By desplegarIdeasHotelesEspania = By.xpath ("(//*[@id=\"arrow_down_svg__filled\"])[1]");
    By desplegarDestPopularesExtanj = By.xpath("(//*[@id=\"arrow_down_svg__filled\"])[2]");
    By desplegarHtlesCiudadesEspa = By.xpath ("(//*[@id=\"arrow_down_svg__filled\"])[3]");
    By desplegarIdeasDeViajes = By.xpath("(//*[@id=\"arrow_down_svg__filled\"])[4]");

    //---------------------METODOS---------------------

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


}
