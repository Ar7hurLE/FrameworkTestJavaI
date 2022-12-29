package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.crhome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.testproject.io/web/");
    }



}
