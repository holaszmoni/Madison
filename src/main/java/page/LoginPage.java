package page;

import helper.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private final String PATH ="/customer/account/login/";

    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(name = "login[username]")
    private WebElement emailField;

    @FindBy(name = "login[password]" )
    private WebElement passField;

    @FindBy(name ="send")
    private WebElement loginButton;

    public void getLoginPage(){
        getDriver().get(Constants.BASE_URL + PATH);
    }

    public void login(String userEmail, String userPass){
        emailField.sendKeys(userEmail);
        passField.sendKeys(userPass);
        loginButton.click();

    }
}

