package TestCase;

import Config.env_;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.collectionpages;
import pages.homepages;
import pages.loginpages;

import static org.junit.Assert.assertEquals;

public class test_search_Item extends env_ {
    @Test
    public void searchItemTest() throws InterruptedException {
        driver.get(BaseUrl);
        collectionpages coll = new collectionpages(driver);
        //create home object
        homepages home = new homepages(driver);
        home.clickLogin();
        //create login object
        loginpages login = new loginpages(driver);
        //input valid information
        login.inputEmail("aditya1995.jr@gmail.com");
        login.inputPass("reyshaka@#$_&030723");
        //click login button
        login.setSignInbtn();
            //input search item
            coll.setSearch("pants men blue");
        Thread.sleep(4000);
        WebElement SearchAutoComplete = driver.findElement(By.id("search_autocomplete"));
        SearchAutoComplete.click();
        //verify search result is displayed
        WebElement result = driver.findElement(By.xpath("//*[@id='maincontent']/div[1]/h1/span"));
        assert(result.isDisplayed());

    }


}
