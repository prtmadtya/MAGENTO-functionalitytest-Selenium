package pages;

import Config.env_;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class collectionpages {
    WebDriver driver;
    public collectionpages (WebDriver driver){
        this.driver = driver;
    }
    //locator for search item
    By search = By.id("search");
    public void setSearch(String cari){
        driver.findElement(search).sendKeys(cari);
    }

}
