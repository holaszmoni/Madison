package page;

import helper.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    private final String PATH ="customer/account/login/";

    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(name = "login[username]")
    private WebElement emailField;

    @FindBy(name = "login[password]" )
    private WebElement passField;

    @FindBy(name ="send")
    private WebElement loginButton;

    @FindBy(className = "welcome-msg")
    private WebElement welcomeMessage;

    public void getLoginPage(){
        getDriver().get(Constants.BASE_URL + PATH);
    }

    public void login(String userEmail, String userPass){
        emailField.sendKeys(userEmail);
        passField.sendKeys(userPass);
        loginButton.click();
    }

    public WebElement waitForWelcomeMessage(){
        return new WebDriverWait(getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".welcome-msg")));
    }

    public String getWelcomeMessage(){
        return welcomeMessage.getText();
    }
}

