import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        File file = new File(chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
