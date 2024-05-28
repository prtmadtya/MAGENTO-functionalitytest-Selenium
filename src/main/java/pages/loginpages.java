package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpages {
    WebDriver driver;

    public loginpages(WebDriver driver){
        this.driver = driver;
    }
    //locator
    By email = By.id("email");
    By password = By.id("pass");
    By signInbtn = By.xpath("//input[@type='submit']");
    //method input
    public void inputEmail (String emailaddress){
        driver.findElement(email).sendKeys(emailaddress);
    }
    public void inputPass(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    //method click sign in
    public void setSignInbtn(){
        driver.findElement(signInbtn).click();
    }

}
