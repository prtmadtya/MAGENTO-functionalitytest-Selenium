package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createAccountpages {
    WebDriver driver;

    public createAccountpages(WebDriver driver){
        this.driver = driver;
    }

    //locator for input data
    By inputFistName = By.id("firstname");
    By inputLastName = By.id("lastname");

    By inputEmail = By.id("email_address");
    By inputPassword = By.id("password");
    By inputConfirmPassword = By.id("password-confirmation");

    By createBtn = By.xpath("//*[@id='form-validate']/div/div[1]/button");

    //Method input data
    public void setInputNameData (String firstName, String lastName){
        driver.findElement(inputFistName).sendKeys(firstName);
        driver.findElement(inputLastName).sendKeys(lastName);
    }
    public void setInputEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void setInputPasswordData (String password, String confirmPassword){
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(inputConfirmPassword).sendKeys(confirmPassword);

    }
    //Method click button create account
    public void clickCreateBtn(){
        driver.findElement(createBtn).click();
    }
}
