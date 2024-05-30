package TestCase;

import Config.env_;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.createAccountpages;
import pages.homepages;
import static org.junit.Assert.assertEquals;

public class test_createAccount extends env_ {
    @Test
    public void SuccessfullCreateAccount () throws InterruptedException {
        driver.get(BaseUrl);
        //create homepage object
        homepages home = new homepages(driver);
        //click create an account
        home.clickCreateAcc();
        //create object createAccount pages
        createAccountpages create = new createAccountpages(driver);

        //Input Valid Data register/signup
        create.setInputFistName("Aditya");
        create.setInputLastName("Pratama");
        create.setInputEmail("aditya1995.jr@gmail.com");
        create.setInputPassword("reyshaka@#$_&030723");
        create.setInputConfirmPassword("reyshaka@#$_&030723");

        //click button create account
        create.clickCreateBtn();
        Thread.sleep(3000);
    }
    @Test
    public void CreateAccountWithEmailAlreadyExist () throws InterruptedException {
        driver.get(BaseUrl);
        //create homepages object
        homepages home = new homepages(driver);
        //click create an account
        home.clickCreateAcc();
        //create object createAaccount pages
        createAccountpages create = new createAccountpages(driver);

        //Input valid information but email already exist
        create.setInputFistName("Aditya");
        create.setInputLastName("Pratama");
        create.setInputEmail("aditya1995.jr@gmail.com");
        create.setInputPassword("reyshaka@#$_&030723");
        create.setInputConfirmPassword("reyshaka@#$_&030723");
        //click button create account
        create.clickCreateBtn();

        //verify error email already registered
        WebElement message = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div"));
        String emailExist = message.getText();
        assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", emailExist);
        Thread.sleep(5000);
    }
}
