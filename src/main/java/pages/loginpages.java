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

    By emailforgot = By.xpath("//*[@id='email_address']");
         public void inputEmailForgot (String emailForgot){driver.findElement(emailforgot).sendKeys(emailForgot);}
    By resetPassword = By.xpath("//*[@id='form-validate']/div/div[1]/button");
    public void clickbuttonreset (){driver.findElement(resetPassword).click();}
    By password = By.id("pass");
    By signInbtn = By.xpath("//*[@id='send2']");
    By forgotPass = By.xpath("//*[@id='login-form']/fieldset/div[4]/div[2]/a");

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
    public void ClickForgotPass(){
        driver.findElement(forgotPass).click();
    }
}
