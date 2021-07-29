import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
          System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://qa2.dev.evozon.com/");
//
//        //Homepage
//
//        System.out.println(" Webpage title :" + driver.getTitle());
//        System.out.println(" Page URL: " + driver.getCurrentUrl());
//
//        WebElement logo  = driver.findElement(By.cssSelector("#header > div > a > img.large"));
//        logo.click();
//
//        WebElement navigate = driver.findElement(By.cssSelector(".level0.nav-3.parent"));
//        navigate.click();
//        //WebElement back = driver.findElement(By.cssSelector());
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.quit();
//
//        //Account
//
//        WebDriver driver1 = new ChromeDriver();
//        driver1.get("http://qa2.dev.evozon.com/");
//        WebElement account =driver1.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
//        account.click();
//        driver1.quit();

        //Language

//        WebDriver driver2 = new ChromeDriver();
//        driver2.get("http://qa2.dev.evozon.com/");
//        Select list = new Select(driver2.findElement(By.cssSelector("#select-language")));
//        int size = list.getOptions().size();
//        System.out.println("Languages number :" + size);
//        driver2.quit();
//
//        //Search
//
//        WebDriver driver3 = new ChromeDriver();
//        driver3.get("http://qa2.dev.evozon.com/");
//        WebElement clearField = driver3.findElement(By.cssSelector("#search"));
//        clearField.clear();
//        WebElement field = driver3.findElement(By.cssSelector("#search"));
//        field.sendKeys("woman");
//        field.submit();
//        driver3.quit();

        //New Products List

//        WebDriver driver4 = new ChromeDriver();
//        driver4.get("http://qa2.dev.evozon.com/");
//        //List<WebElement> products = driver4.findElements(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > div > h3 > a"));
//       //List<WebElement> products =driver4.findElements(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul"));
//        List<WebElement>products =driver4.findElements(By.cssSelector(".product-name"));
//        int number = products.size();
//        System.out.println("Products number: " + number);
//        for (WebElement element : products) {
//            System.out.println(element.getText());
//        }
       // driver4.quit();

        //Navigation
//
        //WebDriver driver5 = new ChromeDriver();
//        driver5.get("http://qa2.dev.evozon.com/");
//
//        List<WebElement> products1 = driver5.findElements(By.cssSelector("#nav"));
//        for(WebElement elements : products1 ) {
//            System.out.print("Navigation headline: " + elements.getText());
//        }
//        WebElement sale = driver5.findElement(By.cssSelector(".level0.nav-5.parent"));
//        sale.click();
//        driver5.quit();














    }
}
