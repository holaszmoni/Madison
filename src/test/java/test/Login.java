package test;

import helper.Constants;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;

import java.util.List;

@RunWith(JUnit4.class)

public class Login extends BaseTest{

    LoginPage loginPage;


    @Test
    public void loginTest(){
        loginPage = new LoginPage(driver);

        loginPage.getLoginPage();
        loginPage.login(Constants.USER_NAME, Constants.USER_PASS);
        Assert.assertTrue(driver.getCurrentUrl().equals(Constants.BASE_URL + "customer/account/"));



    }
}












//    static WebDriver driver;
//
//    @Before
//    public void beforetest() {
//        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://qa2.dev.evozon.com/customer/account/login/");
//    }
//
//    @After
//    public void aftertest() {
//        driver.quit();
//    }
//
//    @Test
//    public void testLoginPage() {
//        WebElement email = driver.findElement(By.cssSelector("#email"));
//        WebElement password = driver.findElement(By.cssSelector("#pass"));
//
//        email.sendKeys("moni@yahoo.com");
//        email.submit();
//        password.sendKeys("eminem");
//        password.submit();
//        WebElement welcomeMsg = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".welcome-msg")));
//        Assert.assertEquals("WELCOME, MONI H!", welcomeMsg.getText());
//    }
//}
