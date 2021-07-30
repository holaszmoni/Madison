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

import java.util.List;

@RunWith(JUnit4.class)

public class LandingPage {

    static WebDriver driver;

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
    public void NewProductsTest() {
        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
        int productsCount = products.size();
        System.out.println("Products number: " + productsCount);
        for (WebElement element : products) {
            System.out.println(element.getText());
        }
        Assert.assertEquals(productsCount, 5);
    }

}
