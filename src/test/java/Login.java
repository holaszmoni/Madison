import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@RunWith(JUnit4.class)

public class Login {
   static WebDriver driver;

    @Before
    public void beforetest() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa2.dev.evozon.com/customer/account/login/");
    }
    @After
     public void aftertest() {
        driver.quit();
    }

    @Test
    public void testLoginPage(){
       // List<WebElement> account =driver.findElements(By.cssSelector("#header > div > div.skip-links > div > a"));
       // for (WebElement :account
        //)
        {

        }
       // WebElement account =driver.findElement(By.className("skip-link skip-account"));
       // account.click();
       // WebElement login =driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
       // login.click();
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("moni@yahoo.com");
        email.submit();
        WebElement password = driver.findElement(By.cssSelector("#pass"));
        password.sendKeys("eminem");
        password.submit();

        //String msg = driver.findElement(By)
         //       Assert.assertTrue("The message is not display.", msg.contains("Hello, Moni H!"));






        }
    }
