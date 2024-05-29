package TestCase;

import Config.env_;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.createAccountpages;
import pages.loginpages;
import pages.homepages;
import java.time.Duration;

public class CreateAccount extends env_ {
    @Test
    public void createAccount() throws InterruptedException {
        driver.get(BaseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //create homepage object
        homepages home = new homepages(driver);
        //home.getHeading();
        home.clickCreateAcc();
        //create create account pages
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
}
