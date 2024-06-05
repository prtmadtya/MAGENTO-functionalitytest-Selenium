package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Input;

public class checkoutpages {
    WebDriver driver;
    public checkoutpages(WebDriver driver){
        this.driver = driver;
    }
    //input name locator
    By firstName = By.xpath("//*[@id='W3J8ITB']");
    By lastName = By.xpath("//*[@id='DCTG2NG']");
    public void inputName (String nameFirst, String nameLast){
        driver.findElement(firstName).clear();
        driver.findElement(lastName).clear();
        driver.findElement(firstName).sendKeys(nameFirst);
        driver.findElement(lastName).sendKeys(nameLast);
    }
    //input company locator
    By comp = By.id("E88QG3O");
    public void company(String companyValue){
        driver.findElement(comp).sendKeys(companyValue);
    }

    //address locator
    By addres = By.id("CQ39DD0");
    public void inputAddress (String valueAddress){
        driver.findElement(addres).sendKeys(valueAddress);
    }
    By city = By.id("IN6OLVF");
    public void inputCity (String cityvalue){
        driver.findElement(city).sendKeys(cityvalue);
    }
    By state = By.id("K26U9OK");
    public void inputState (String stateValue){
        driver.findElement(state).sendKeys(stateValue);
    }
    By pos = By.id("OP88THG");
    public void postalCode(String value){
        driver.findElement(pos).sendKeys(value);
    }
    By dropCountry = By.id("YSOH6C5");
    public void dropdown (){
        driver.findElement(dropCountry).click();
    }
    By phone = By.id("TPG5TQV");
    public void phoneNumber (String valueNumber){
        driver.findElement(phone).sendKeys(valueNumber);
    }
    By next = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
    public void nextBtn(){
        driver.findElement(next).click();
    }

}
