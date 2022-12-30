package PageFactory;


import Commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_PF {

    WebDriver driver;
   public LoginPage_PF(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    WebElement txt_username;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id = "login")
    WebElement btn_login;


    public void enterUsername(String username){
     txt_username.sendKeys(username);
    }
    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickLogin(){
        btn_login.click();
    }

    public void loginValid(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_login.click();
    }

}

