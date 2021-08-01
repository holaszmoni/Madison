package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LanguagePage extends BasePage {

    public LanguagePage(WebDriver driver) {
        super(driver);
    }
     @FindBy(css="#select-language > option")
     List<WebElement> languageNumber;

    public int getLanguageNumber(){
        return languageNumber.size();
    }
}
