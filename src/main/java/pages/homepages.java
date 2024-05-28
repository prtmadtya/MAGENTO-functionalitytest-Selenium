package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepages {
    WebDriver driver;

    public homepages(WebDriver driver){
        this.driver = driver;
    }
    //locator for create account
    By createAcc = By.xpath("//a[contains(@href,'Create an Account')]");
    //locator for Login
    By loginBtn = By.xpath("//a[contains(@href,'Sign In')]");

    //method to click createAcc
    public void clickSignin() {
        driver.findElement(createAcc).click();
    }
    public  void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}
