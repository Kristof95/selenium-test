import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


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
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }

    @Test
    public void testRtSection() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.findElement(By.id("navbar-brand-centered")).getText();
        System.out.println("TITLE -> "+title);
    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
