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
        create.setInputNameData ("Aditya", "Pratama");
        create.setInputEmail("aditya1995.jr@gmail.com");
        create.setInputPasswordData("reyshaka@#$_&030723","reyshaka@#$_&030723");

        //click button create account
        create.clickCreateBtn();
        Thread.sleep(3000);
    }
    @Test
    public void CreateAccountWithEmailAlreadyExist () throws InterruptedException {
        driver.get(BaseUrl);
        //create object
        homepages home = new homepages(driver);
        createAccountpages create = new createAccountpages(driver);

        //click button create an account
        home.clickCreateAcc();
        //Input valid information but email already exist
        create.setInputNameData("Aditya", "Pratama");
        create.setInputEmail("aditya1995.jr@gmail.com");
        create.setInputPasswordData("reyshaka@#$_&030723", "reyshaka@#$_&030723");
        //click button create account
        create.clickCreateBtn();
        Thread.sleep(5000);
        //verify error email already registered
        WebElement message = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div"));
        String emailExist = message.getText();
        assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", emailExist);

    }
}
