package TestCase;

import Config.env_;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v123.overlay.model.IsolatedElementHighlightConfig;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_checkoutItem extends env_ {
    @Test
    public void SuccessfulleditItemCart () throws InterruptedException {
        driver.get(BaseUrl);
        shoppingCartpages shopcart = new shoppingCartpages(driver);
        homepages home = new homepages(driver);
        home.clickLogin();
        //create login object
        loginpages login = new loginpages(driver);
        //input valid information
        login.inputEmail("aditya1995.jr@gmail.com");
        login.inputPass("reyshaka@#$_&030723");
        login.setSignInbtn(); // click login button
        Thread.sleep(3000);
            home.showingCart(); // click to show dropdown cart
            //view and edit shopping cart
            home.setViewItem();
            //cick Edit quantity item
            shopcart.clickEditItem();
            Thread.sleep(3000);
                //update item
                shopcart.selectSizeItem();
                shopcart.selectColorItem();
                shopcart.inputFormEdit("7");
                shopcart.clickUpdateButton();
                Thread.sleep(3000);
            //Assert update quantity success
            WebElement message = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div"));
            Thread.sleep(3000);
            String successEditQuantity = message.getText();
            assertEquals("Circe Hooded Ice Fleece was updated in your shopping cart.", successEditQuantity);
    }

    @Test
    public void SuccesscheckoutItem () throws InterruptedException {
        driver.get(BaseUrl);
        shoppingCartpages shopcart = new shoppingCartpages(driver);
        homepages home = new homepages(driver);
        home.clickLogin();
        //create login object
        loginpages login = new loginpages(driver);
        //input valid information
        login.inputEmail("aditya1995.jr@gmail.com");
        login.inputPass("reyshaka@#$_&030723");
        login.setSignInbtn(); // click login button
        Thread.sleep(3000);
        home.showingCart(); // click to show dropdown cart
        //view and edit shopping cart
        home.setViewItem();
        Thread.sleep(3000);
            //Click Checkout button
            shopcart.setCheckoutBtn();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            //shipping information
        try {
            checkoutpages checkout = new checkoutpages(driver);
            checkout.inputName("Aditya", "Pratama");
            checkout.company("hui");
            checkout.inputCity("garut");
            checkout.inputAddress("Jl bahlul");
            //dropdown select state
            Select objSelect = new Select(driver.findElement(By.xpath("//select[@id='OWK4LQR']")));
            objSelect.selectByValue("3");
            checkout.postalCode("44188");
            //Select Country by dropdown
            WebElement dropdown_element = driver.findElement(By.id("TPG5TQV"));
            // Buat objek Select
            Select dropdown = new Select(dropdown_element);
            dropdown.selectByValue("ID");
            checkout.phoneNumber("087654123098");
            checkout.nextBtn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        wait(3000);




    }

}
