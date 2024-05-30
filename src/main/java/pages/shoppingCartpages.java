package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingCartpages {
    WebDriver driver;

    public shoppingCartpages(WebDriver driver){
        this.driver = driver;
    }
    By checkoutBtn = By.xpath("//input[@type='button' ][@data-role='proceed-to-checkout']");
    public void setCheckoutBtn(){
        driver.findElement(checkoutBtn).click();
    }
}
