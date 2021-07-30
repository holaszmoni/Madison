import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

@RunWith(JUnit4.class)

public class Register {
    static WebDriver driver;

    @Before
    public void beforetest() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa2.dev.evozon.com/customer/account/create/");
    }

    @After
    public void aftertest() {
        driver.quit();
    }

    @Test
    public void registerTest() {
        WebElement firstname = driver.findElement(By.cssSelector("#firstname"));
        WebElement lastname = driver.findElement(By.cssSelector("#lastname"));
        WebElement emailAddress = driver.findElement(By.cssSelector("#email_address"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement confirmPassword = driver.findElement(By.cssSelector("#confirmation"));
        WebElement registerButton = driver.findElement(By.cssSelector("button[title=\"Register\"]"));
        String pageTitle = driver.getTitle();
        int number = new Random().nextInt(100000);

        Assert.assertEquals(pageTitle,"Create New Customer Account");
        firstname.sendKeys("Holasz");
        lastname.sendKeys("Moni");
        emailAddress.sendKeys("testing@"+number+"testing.com");
        password.sendKeys("password");
        confirmPassword.sendKeys("password");
        registerButton.click();
        WebElement successMessage = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success-msg span")));
        Assert.assertEquals(successMessage.getText(),"Thank you for registering with Madison Island.");
    }

}
