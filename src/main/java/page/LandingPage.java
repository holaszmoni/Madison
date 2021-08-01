package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }
        @FindBy(className="product-name")
        List <WebElement> productsname;


    public int getProductsCount(){
        return productsname.size();
    }
}
