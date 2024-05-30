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

    By collectionCategory = By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[1]/a");
    public void setCollectionCategory (){
        driver.findElement(collectionCategory).click();
    }

    By itemSelect = By.xpath("//div[@id='option-label-size-143-item-166']");
    By colorSelect = By.xpath("//div[@id='option-label-color-93-item-53']");

    By addcart = By.xpath("//body[@class='page-with-filter page-products categorypath-women-tops-women-hoodies-and-sweatshirts-women category-hoodies-and-sweatshirts-women catalog-category-view page-layout-2columns-left']");
    public void setItemSelect(){
        driver.findElement(itemSelect).click();
    }
    public void setCollor(){
        driver.findElement(colorSelect).click();
    }
    public void setAddcart(){
        driver.findElement(addcart).click();
    }

}
