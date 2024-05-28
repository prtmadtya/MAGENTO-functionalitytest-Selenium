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
    public void createAccount() {
        //set driver location path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //set url
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
        create.setInputEmail("testing@mailsec.com");
        create.setInputPassword("pass123");
        create.setInputConfirmPassword("pass123");

        //click button create account
        create.clickCreateBtn();

        driver.quit();
    }
}
