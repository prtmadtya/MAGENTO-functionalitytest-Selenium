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
        By editBtn = By.xpath("//span[normalize-space()='Edit']"); public void editButton(){driver.findElement(editBtn).click();}

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
        //locator change name, email, password
        By firstName = By.id("firstname"); By lastName = By.id("lastname");
        public void editName (String firstname , String lastname) {
            driver.findElement(firstName).clear();
            driver.findElement(lastName).clear();
            driver.findElement(firstName).sendKeys(firstname);
            driver.findElement(lastName).sendKeys(lastname);
        }
        By curentpass = By.id("current-password"); By newPass = By.id("password"); By confirmPass = By.id("password-confirmation");
        public void CurrentPassword (String inputPass){driver.findElement(curentpass).sendKeys(inputPass);}
        public void newPassword (String NewPass, String confirmPassword){
            driver.findElement(newPass).sendKeys(NewPass);
            driver.findElement(confirmPass).sendKeys(confirmPassword);
        }
        By saveBtn = By.xpath("//span[normalize-space()='Save']"); public void saveButton (){driver.findElement(saveBtn).click();}
    By paymentMethod = By.xpath("//a[normalize-space()='Stored Payment Methods']");
    public void storedPaymentMethod(){driver.findElement(paymentMethod).click();}
    By productReview = By.xpath("//a[normalize-space()='My Product Reviews']");
    public void ProductReview(){driver.findElement(productReview).click();}
}
