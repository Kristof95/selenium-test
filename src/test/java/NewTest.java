import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class NewTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("no-sandbox");
        chromeOptions.addArguments("window-size=1024x758");
        chromeOptions.addArguments("port=9515");
        chromeOptions.addArguments("disable-gpu");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
