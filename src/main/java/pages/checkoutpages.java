package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpages {
    WebDriver driver;
    public checkoutpages(WebDriver driver){
        this.driver = driver;
    }
    //input name locator
    By firstName = By.xpath("//input[@id='JG7NTQA']");
    By lastName = By.xpath("//input[@id='Q3EQM6D']");

    public void inputName(String nameFirst, String nameLast) {
        driver.findElement(firstName).clear();
        driver.findElement(lastName).clear();
        driver.findElement(firstName).sendKeys(nameFirst);
        driver.findElement(lastName).sendKeys(nameLast);
    }
    //input company locator
    By comp = By.xpath("//input[@id='O4VW4QA']");
    public void company(String companyValue){
        driver.findElement(comp).sendKeys(companyValue);
    }

    //address locator
    By addres = By.xpath("//input[@id='B3OLH82']");
    public void inputAddress (String valueAddress){
        driver.findElement(addres).sendKeys(valueAddress);
    }
    By city = By.xpath("//input[@id='V03CQV0']");
    public void inputCity (String cityvalue){
        driver.findElement(city).sendKeys(cityvalue);
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
