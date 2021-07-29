import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)

public class Search {
    WebDriver driver;

    @Before
    public void beforetest() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa2.dev.evozon.com/");
    }

    @After
    public void aftertest() {
       driver.quit();
    }

    @Test
    public void testsearch() {
        //WebElement clearField = driver.findElement(By.cssSelector("#search"));
       // clearField.clear();
        WebElement field = driver.findElement(By.cssSelector("#search"));
        field.sendKeys("woman");
        field.submit();

        String msg = driver.findElement(By.className("note-msg")).getText();
        Assert.assertTrue("The message is not display", msg.equals("Your search returns no results."));
    }

}
