package test;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import page.SearchPage;

@RunWith(JUnit4.class)

public class Search extends BaseTest {
    SearchPage searchPage;

    @Test
    public void searchNoResultsTest() {
        searchPage = new SearchPage(driver);

        searchPage.search("woman");

        Assert.assertTrue("The no results message is not display",
                searchPage.getNoResultsMessage().equals("Your search returns no results."));
    }

    @Test
    public void searchResultsTest() {
        searchPage = new SearchPage(driver);

        searchPage.search("dress");
        Assert.assertTrue("The search results are displayed", searchPage.productsCategoryIsDisplayed());
    }
}

//    WebDriver driver;
//
//    @Before
//    public void beforetest() {
//        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://qa2.dev.evozon.com/");
//    }
//
//    @After
//    public void aftertest() {
//        driver.quit();
//    }
//
//    @Test
//    public void searchNoResultsTest() {
//        WebElement field = driver.findElement(By.cssSelector("#search"));
//        field.sendKeys("woman");
//        field.submit();
//
//        String msg = driver.findElement(By.className("note-msg")).getText();
//        Assert.assertTrue("The message is not display", msg.equals("Your search returns no results."));
//    }
//
//    @Test
//    public void searchResultsTest() {
//        WebElement field = driver.findElement(By.cssSelector("#search"));
//        field.sendKeys("dress");
//        field.submit();
//
//        boolean categoryIsDisplayed = driver.findElement(By.className("category-products")).isDisplayed();
//        Assert.assertTrue("The search results are displayed", categoryIsDisplayed);
//    }
//}
