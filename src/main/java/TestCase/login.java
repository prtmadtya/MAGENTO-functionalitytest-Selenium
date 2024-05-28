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
    public void main() {
        //set driver location path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //set url
        driver.get(BaseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //create home object
        homepages home = new homepages(driver);
        home.clickLogin();

        //create login object
        loginpages login = new loginpages(driver);
        login.inputEmail("testing@mailsec.com");
        login.inputPass("pass123");
        //click login button
        login.setSignInbtn();

        driver.quit();

    }
}
