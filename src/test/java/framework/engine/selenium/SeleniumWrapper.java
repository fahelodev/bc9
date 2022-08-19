package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumWrapper {

    private final WebDriver driver;
    ArrayList<String> tabs;




    //Constructor Base
    public SeleniumWrapper(WebDriver driver){
        this.driver = driver;

    }

    //Wrappers Selenium

    public JavascriptExecutor js(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }


    //guardo las paginas del navegador en un array
    public ArrayList<String> guardarPag(){
        tabs= new ArrayList<String>(driver.getWindowHandles());
        return tabs;
    }
    public WebDriver switchTo(int i){
       return driver.switchTo().window(tabs.get(i));
    }


 //time explicit
    public WebDriverWait eWait(int i){
        WebDriverWait ewait = new WebDriverWait(driver,i);
        return ewait;
    }

    //time implicit
    public WebDriver.Timeouts implicitWait(int TimeOut){
        return driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
    }

    public void esperaEnSegundosYClick(int i,By locator) {
        WebDriverWait espera = new WebDriverWait(driver, i);
        espera.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
        // conseguir url pagina
    public String getUrl(){return driver.getCurrentUrl();}


    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements (By locator){
        return driver.findElements(locator);
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void sendKeys(Keys key, By locator){
        driver.findElement(locator).sendKeys(key);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public String getUrlTitle(){
        return driver.getTitle();
    }



}
