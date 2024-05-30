package Config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class env_ {
    protected WebDriver driver;
    @Before
    public void setup() {
        //set driver location path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window();
    }

    protected String BaseUrl = ("https://magento.softwaretestingboard.com/");

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
