package page;

import helper.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {
    private final String PATH = "customer/account/create/";

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameField;

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id = "email_address")
    private WebElement emailAddressField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmation")
    private WebElement confirmPasswordField;

    @FindBy(css = "button[title=\"Register\"]")
    private WebElement registerButton;

    @FindBy(css = ".success-msg span")
    private WebElement registrationConfirmationMessage;

    public void getRegisterPage(){
        getDriver().get(Constants.BASE_URL + PATH);
    }

    public void register(String firstName, String lastName, String email,String password, String confirmationPassword) {
            firstNameField.sendKeys(firstName);
            lastNameField.sendKeys(lastName);
            emailAddressField.sendKeys(email);
            passwordField.sendKeys(password);
            confirmPasswordField.sendKeys(confirmationPassword);
            registerButton.click();
    }

    public String getConfirmationMessage(){
        return registrationConfirmationMessage.getText();
    }

    public WebElement waitForConfirmationMessage(){
        return new WebDriverWait(getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success-msg span")));
   }

}
