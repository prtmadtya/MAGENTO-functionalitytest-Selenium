package TestCase;

import Config.env_;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.collectionpages;
import pages.homepages;
import pages.loginpages;

public class test_addItemToCart extends env_ {
    @Test
    public void SuccessDirectAddtoCart ()throws InterruptedException {
        driver.get(BaseUrl);
        //create home object
        homepages home = new homepages(driver);
        collectionpages coll = new collectionpages(driver);
        home.clickLogin();
        //create login object
        loginpages login = new loginpages(driver);
        //input valid information
        login.inputEmail("aditya1995.jr@gmail.com");
        login.inputPass("reyshaka@#$_&030723");
        //click login button
        login.setSignInbtn();
        Thread.sleep(3000);
        home.setGoTocollection();
            //Session add item
            coll.setCollectionCategory();
            coll.setCollor();
            coll.setItemSelect();
            coll.setAddcart();
    }

}
