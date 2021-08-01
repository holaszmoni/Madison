package test;

import helper.Constants;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import page.LoginPage;

@RunWith(JUnit4.class)

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);

        loginPage.getLoginPage();
        loginPage.login(Constants.USER_NAME, Constants.USER_PASS);
        Assert.assertTrue(loginPage.getUrl().equals(Constants.BASE_URL + "customer/account/"));

        loginPage.waitForWelcomeMessage();
        Assert.assertEquals("WELCOME, MONI H!", loginPage.getWelcomeMessage());
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
