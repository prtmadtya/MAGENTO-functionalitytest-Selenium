package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class profile_pages {
    WebDriver driver;
    public profile_pages (WebDriver driver){
        this.driver = driver;
    }
    //Locator Navigation Bar
    By MyAccount = By.xpath("//li[@class='nav item current']//strong[contains(text(),'My Account')]");
    public void myAccount () {driver.findElement(MyAccount).click();}
    By order = By.xpath("//a[normalize-space()='My Orders']");
    public void MyOrder (){driver.findElement(order).click();}
    By download = By.xpath("//a[normalize-space()='My Downloadable Products']");
    public void downloadableProduct () {driver.findElement(download).click();}
    By wish = By.xpath("//li[@class='nav item']//a[normalize-space()='My Wish List']");
    public void MyWish () {driver.findElement(wish).click();}
    By addressBook = By.xpath("//strong[normalize-space()='Address Book']");
    public void MyAddressBook() {driver.findElement(addressBook).click();}
    By infoAcc = By.xpath("//a[normalize-space()='Account Information']");
    public void MyInfoAccount(){driver.findElement(infoAcc).click();}
    By paymentMethod = By.xpath("//a[normalize-space()='Stored Payment Methods']");
    public void storedPaymentMethod(){driver.findElement(paymentMethod).click();}
    By productReview = By.xpath("//a[normalize-space()='My Product Reviews']");
    public void ProductReview(){driver.findElement(productReview).click();}
}
