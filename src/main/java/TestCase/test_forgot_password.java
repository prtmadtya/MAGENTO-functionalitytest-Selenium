package TestCase;

import Config.env_;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.homepages;
import pages.loginpages;
import static org.junit.Assert.assertEquals;

public class test_forgot_password extends env_ {
    @Test
    public void test_forgotPasswords () throws InterruptedException {
        driver.get(BaseUrl);
        homepages home = new homepages(driver);
        loginpages login = new loginpages(driver);
        home.clickLogin();
        login.ClickForgotPass();
        login.inputEmailForgot("aditya1995.jr@gmail.com");
        login.clickbuttonreset();
        Thread.sleep(5000);
        WebElement message = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div"));
        String successReset = message.getText();
        assertEquals("If there is an account associated with aditya1995.jr@gmail.com you will receive an email with a link to reset your password.",successReset);
    }
}
