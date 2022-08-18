package desafio.grupo2.rumbo.testcreation.pages.Hoteles;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class RumboEsHotelesSecurePage extends SeleniumWrapper {

    public RumboEsHotelesSecurePage(WebDriver driver) {
        super(driver);
    }

    public void rellenardatos() {
        By nombre = By.xpath("//input[@data-test='input-name']");
        write("Juan", nombre);
        By apellido = By.xpath("//input[@data-test='input-surname']");
        write("Perez", apellido);
        sendKeys(Keys.TAB, apellido);
        By email = By.xpath("(//input[@name='email'])[2]");
        write("algo@gmail.com", email);
        sendKeys(Keys.TAB, email);
        By filtropais = By.xpath("//div[@class='arrow down']");
        click(filtropais);
        By pais = By.xpath("//li[@data-country-code='ar']");
        click(pais);
        By telefono = By.xpath("//input[@data-test='input-phone']");
        write("123456789", telefono);
    }
    public void rellenardatos06() {
        By nombre = By.xpath("//input[@data-test='input-name']");
        write("Cristian", nombre);
        By apellido = By.xpath("//input[@data-test='input-surname']");
        write("Solis", apellido);
        sendKeys(Keys.TAB, apellido);
        By email = By.xpath("(//input[@name='email'])[2]");
        write("millansoliscristian@gmail.com", email);
        sendKeys(Keys.TAB, email);
        By filtropais = By.xpath("//div[@class='arrow down']");
        click(filtropais);
        By pais = By.xpath("//li[@data-country-code='cl']");
        click(pais);
        By telefono = By.xpath("//input[@data-test='input-phone']");
        write("963722723", telefono);
    }
    public void tarjeta () {
        By tarjeta = By.xpath("(//input[@class='form-control text-input '])[3]");
        write("Cristian Millan S", tarjeta);
        sendKeys(Keys.TAB, tarjeta);
        By mes = By.xpath("//input[@data-test='input-creditCard.cardNumber']");
        write("1111111111111111", mes);
        sendKeys(Keys.TAB, mes);
        By anio = By.xpath("//input[@name='creditCard.expirationDate']");
        write("4", anio);
        sendKeys(Keys.TAB, anio);
        By cvv = By.xpath("(//input[@name='creditCard.expirationDate'])[2]");
        write("26", cvv);
        sendKeys(Keys.TAB, cvv);
        By cvv2 = By.xpath("//input[@data-test='input-creditCard.cvv']");
        write("024", cvv2);

    }
    public void continuarpago () {
        By continuar = By.xpath("//button[@data-test='submit-button']");
        click(continuar);
    }
    public void rellenarhuesped(){
        By nombre = By.xpath("groups.1.travellers.1.name");
        write("Juan", nombre);
        By apellido = By.xpath("groups.1.travellers.1.surname");
        write("Perez", apellido);
        By nombre2 = By.xpath("groups.2.travellers.2.name");
        write(" cristian", nombre2);
        By apellido2 = By.xpath("groups.2.travellers.2.surname");
        write("millan", apellido2);
    }
}

