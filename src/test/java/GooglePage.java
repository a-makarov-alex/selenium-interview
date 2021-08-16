import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public WebDriver driver;
    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchfield;

    public void typeSerachRequest(String text) {
        searchfield.sendKeys(text);
        searchfield.sendKeys(Keys.ENTER);
    }
}
