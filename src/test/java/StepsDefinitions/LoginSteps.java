package StepsDefinitions;


import Commons.Hooks;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Commons.BasePage.driver;


public class LoginSteps{

    Hooks hooks;
    LoginPage_PF login;


    @Given("user is on login page")
    public void user_is_on_login_page(){
        hooks = new Hooks(driver);

        System.out.println("init");
        hooks.setup();


    }

    @And("user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password){
        login = new LoginPage_PF(driver);

        login.enterUsername(username);
        login.enterPassword(password);

    }

    @When("clicks on login button")
    public void clicks_on_login_button(){

        login.clickLogin();

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){

        System.out.println("finish");
        hooks.teardown();

    }
}
