package TestCase;
import Config.env_;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.homepages;
import pages.loginpages;
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
        login.inputPass("reyshaka@#$_&030723");
        //click login button
        login.setSignInbtn();
        Thread.sleep(3000);
        //Capture the page heading and print on console
        System.out.println("The page heading is --- " +home.getHeading());
    }
    @Test
    public void loginWithoutEmail() throws InterruptedException {
        driver.get(BaseUrl);
            homepages home = new homepages(driver);
            loginpages login = new loginpages(driver);
            //Click halaman login
            home.clickLogin();
            //input Password
            login.inputPass("reyshaka@#$_&030723");
            //click login button
            login.setSignInbtn();
            //verify require email should be filled
            WebElement message = driver.findElement(By.id("email-error"));
            String value = message.getText();
            assertEquals("This is a required field.", value);
        Thread.sleep(3000);
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
        login.inputPass("reyshaka@#$_&030723");
        //click login button
        login.setSignInbtn();
        //verify error email format
        WebElement message = driver.findElement(By.id("email-error"));
        String invalidEmail = message.getText();
        assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", invalidEmail);
        Thread.sleep(5000);
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
        login.inputPass("reyshaka@#$_&030723");
        //click login button
        login.setSignInbtn();
        //verify error email format
        WebElement message = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"));
        String emailNotRegistered = message.getText();
        assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", emailNotRegistered);
        Thread.sleep(5000);
    }
}
