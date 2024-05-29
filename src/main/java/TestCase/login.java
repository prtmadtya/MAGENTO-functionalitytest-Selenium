package TestCase;
import Config.env_;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homepages;
import pages.loginpages;

import java.time.Duration;

public class login extends env_ {
    @Test
    public void validLogin() {
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
    }
    @Test
    public void invalidLogin() {
        driver.get(BaseUrl);
        homepages home = new homepages(driver);
        home.clickLogin();
        loginpages login = new loginpages(driver);
        //input invalid information
        login.inputEmail("");
        login.inputPass("reyshaka@#$_&030723");
    }
}
