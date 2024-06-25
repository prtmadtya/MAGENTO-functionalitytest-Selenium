package TestCase;

import Config.env_;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.homepages;
import pages.loginpages;
import pages.profile_pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_updateProfile extends env_ {
    @Test
    public void changePasswordSuccessfully () throws InterruptedException {
        driver.get(BaseUrl);
        //login required
        homepages home = new homepages(driver);
        home.clickLogin();
        //create login object
        loginpages login = new loginpages(driver);
        //input valid information
        login.inputEmail("aditya1995.jr@gmail.com");
        login.inputPass("reyshakaNew0307");
        login.setSignInbtn(); // click login button
        Thread.sleep(3000);
            //Navigate to profile page
            homepages homepage = new homepages(driver);
            homepage.clickDropdown(); homepage.clickProfile();
        profile_pages profileUpdate = new profile_pages(driver);
            profileUpdate.myAccount(); //account information
                Thread.sleep(2000);
                WebElement information = driver.findElement(By.xpath("//strong[normalize-space()='Account Information']"));
                String gettingText = information.getText();
                    assertEquals("Account Information", gettingText);
                profileUpdate.editButton(); //navigate to edit information
                //checkbox enabled
                driver.findElement(By.id("change-password")).click();
                    //enter new pass word correctly
                    profileUpdate.CurrentPassword("reyshakaNew0307@");
                    profileUpdate.newPassword("reyshaka030723@", "reyshaka030723@");
                //save button
                profileUpdate.saveButton();
                Thread.sleep(2000);
        //Verify password changed successfully
        WebElement message = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        String successfully = message.getText();
            assertEquals("You saved the account information." ,successfully);
    }
    @Test
    public void changePasswordWithInvalidConfirmPassword () throws InterruptedException {
        driver.get(BaseUrl);
        //login Session Required
        homepages home = new homepages(driver);
        home.clickLogin();
        //create login object
        loginpages login = new loginpages(driver);
            //input valid information
            login.inputEmail("aditya1995.jr@gmail.com");
            login.inputPass("reyshaka030723@");
            login.setSignInbtn(); // click login button
            Thread.sleep(3000);
                //Navigate to profile page
                homepages homepage = new homepages(driver);
                homepage.clickDropdown(); homepage.clickProfile();
                profile_pages profileUpdate = new profile_pages(driver);
                profileUpdate.myAccount(); //account information
                Thread.sleep(2000);
                    //verify user already account information
                    WebElement information = driver.findElement(By.xpath("//strong[normalize-space()='Account Information']"));
                    String gettingText = information.getText();
                    assertEquals("Account Information", gettingText);
                    profileUpdate.editButton(); //navigate to edit information
        //checkbox enabled
        driver.findElement(By.id("change-password")).click();
        //enter new pass word correctly
        profileUpdate.CurrentPassword("reyshaka030723@");
        profileUpdate.newPassword("reyshaka030723@@#$", "passwordSALAH");
        //save button
        profileUpdate.saveButton();
        Thread.sleep(2000);
            //Verify password changed error password doesn't matches
            WebElement error = driver.findElement(By.id("password-confirmation-error"));
            String errorMessage = error.getText();
            WebElement message = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
            String successfully = message.getText();
            assertEquals("You saved the account information." ,successfully);
            if (errorMessage.equalsIgnoreCase(successfully))
                System.out.println("Test Pass. Error password doesn't matches");
                else {
                    System.out.println("Test Failed. Password Changed");
            }
    }
}
