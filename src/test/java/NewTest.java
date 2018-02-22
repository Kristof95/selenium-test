import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;


public class NewTest {

    private WebDriver driver;



    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }
    @BeforeTest
    public void beforeTest() {
        String chromeDriverPath = "/usr/bin/chromedriver";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary(chromeDriverPath);
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1024x758");
        driver = new ChromeDriver(chromeOptions);
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
