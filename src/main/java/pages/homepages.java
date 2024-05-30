package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepages {
    WebDriver driver;

    public homepages(WebDriver driver){
        this.driver = driver;
    }
    //locator for create account
    By createAcc = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By loginBtn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    By heading = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span");

    public String getHeading(){
        String head = driver.findElement(heading).getText(); //assert success get welcome massage
        return head;
    }
    //method to click
    public void clickCreateAcc() {
        driver.findElement(createAcc).click();
    }
    public  void clickLogin() {
        driver.findElement(loginBtn).click();
    }

}
