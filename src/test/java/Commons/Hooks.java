package Commons;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static Commons.BasePage.driver;


public class Hooks {

    public Hooks(WebDriver driver) {

    }

    @Before
    public void setup(){
        System.setProperty("webdriver.crhome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.testproject.io/web/");
    }
    @After
    public void teardown(){
        driver.close();
        driver.quit();
    }


}
