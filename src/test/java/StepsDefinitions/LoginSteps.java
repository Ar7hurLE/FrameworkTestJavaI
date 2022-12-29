package StepsDefinitions;

import PageFactory.BaseClass;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps{

    WebDriver driver = null;
    //loginPage login;
    LoginPage_PF login;

    @Given("browser is open")
    public void browser_is_open() {

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is: " + projectPath );

        System.setProperty("webdriver.crhome.driver", "chromedriver");

        driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    }

    @And("user is on login page")
    public void user_is_on_login_page(){

        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password){
        login = new LoginPage_PF(driver);

        login.enterUsername(username);
        login.enterPassword(password);

        //login = new loginPage(driver);
        //login.enterUsername(username);
        //login.enterPassword(password);

        //driver.findElement(By.id("name")).sendKeys(username);
        //driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("clicks on login button")
    public void clicks_on_login_button(){

        login.clickLogin();

        //login.clickLogin();

        //driver.findElement(By.id("login")).click();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){

        //login.checkLogOutIsDisplayed();

        //login.checkLogOutIsDisplayed();

        //driver.findElement(By.id("logo")).isDisplayed();
        driver.close();
        //driver.quit();

    }
}
