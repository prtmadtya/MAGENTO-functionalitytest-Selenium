package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingCartpages {
    WebDriver driver;

    public shoppingCartpages(WebDriver driver){
        this.driver = driver;
    }
    By checkoutBtn = By.xpath("//button [@type='button' ][@data-role='proceed-to-checkout']");
    public void setCheckoutBtn(){
        driver.findElement(checkoutBtn).click();
    }

    //update shopping cart button not real time
    By updateCartBtn = By.id("product-updatecart-button");
    public void clickUpdateButton(){
        driver.findElement(updateCartBtn).click();
    }

    //locator button edit item
    By editItem = By.xpath("//*[@id='shopping-cart-table']/tbody[1]/tr[2]/td/div/a[2]");
    public void clickEditItem(){
        driver.findElement(editItem).click();
    }

    //locator form quantity
    By formEdit = By.id("qty");
    public void inputFormEdit(String quantiy){
        driver.findElement(formEdit).clear();
        driver.findElement(formEdit).sendKeys(quantiy);
    }

    By selectSize = By.xpath("//*[@id='option-label-size-143-item-170']");
    public void selectSizeItem (){
        driver.findElement(selectSize).click();
    }
    By selectColor = By.xpath("//*[@id=\"option-label-color-93-item-52\"]");
    public void selectColorItem () {
        driver.findElement(selectColor).click();
    }
}
