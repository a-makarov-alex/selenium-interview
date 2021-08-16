import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class GoogleTest {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseUrl = "https://google.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    }

    @Test
    public void openPage() {
        driver.get(baseUrl);
        GooglePage googlePage = new GooglePage(driver);
        googlePage.typeSerachRequest("test line");

        //driver.findElement(By.xpath("//input[@name='q']"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
