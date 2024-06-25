package TestCase;
import Config.env_;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homepages;
import pages.loginpages;

import java.awt.*;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
public class test_login extends env_ {
    @Test
    public void SuccessfullyLogin() throws InterruptedException {
        //set url
        driver.get(BaseUrl);
        //create home object
        homepages home = new homepages(driver);
        home.clickLogin();
        //create login object
        loginpages login = new loginpages(driver);
        //input valid information
        login.inputEmail("aditya1995.jr@gmail.com");
        login.inputPass("reyshaka030723@");
        //click login button
        login.setSignInbtn();
        Thread.sleep(4000);
        //Capture the page heading and print on console
        System.out.println("Test Passed: " +home.getHeading()+" "+"is Displayed");
    }
    @Test
    public void loginWithoutEmail() throws InterruptedException {
        driver.get(BaseUrl);
            homepages home = new homepages(driver);
            loginpages login = new loginpages(driver);
            //Click sign in
            home.clickLogin();
            //input Password
            login.inputPass("reyshaka030723@");
            //click login button
            login.setSignInbtn();
            Thread.sleep(3000);
                //verify require email should be filled
                WebElement failedmessage = driver.findElement(By.id("email-error"));
                String value = failedmessage.getText();
                Assertions.assertEquals("This is a required field.", value);
                String successLogin = home.getHeading();
                if (value.equalsIgnoreCase(successLogin))
                    System.out.println("Test Failed: login success");
                else {
                    System.out.println("Test Passed: email required");
                }
    }
    @Test
    public void loginWithInvalidEmail() throws InterruptedException {
        driver.get(BaseUrl);
        homepages home = new homepages(driver);
        loginpages login = new loginpages(driver);
        //Click Halaman login
        home.clickLogin();
        //input invalid email format
        login.inputEmail("@testing.com");
        //input valid password
        login.inputPass("reyshaka030723@");
        //click login button
        login.setSignInbtn();
        Thread.sleep(5000);
        //verify error email format
        WebElement failedmessage = driver.findElement(By.id("email-error"));
        String invalidEmail = failedmessage.getText();
        assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", invalidEmail);
        String successLogin = home.getHeading();
        if (invalidEmail.equalsIgnoreCase(successLogin))
            System.out.println("Test Failed: login success");
        else {
            System.out.println("Test Passed: valid email required");
        }
    }

    @Test
    public void loginWithEmailNotRegistered () throws InterruptedException {
        driver.get(BaseUrl);
        homepages home = new homepages(driver);
        loginpages login = new loginpages(driver);
        //Click Halaman login
        home.clickLogin();
        //input invalid email format
        login.inputEmail("aditya1995.jr4@gmail.com");
        //input valid password
        login.inputPass("reyshaka030723@");
        //click login button
        login.setSignInbtn();
        //verify error email format
        WebElement message = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"));
        String emailNotRegistered = message.getText();
        assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", emailNotRegistered);
        Thread.sleep(5000);
        String successLogin = home.getHeading();
        if (emailNotRegistered.equalsIgnoreCase(successLogin))
            System.out.println("Test Failed: login success");
        else {
            System.out.println("Test Passed: Email not registered");
        }
    }
}
