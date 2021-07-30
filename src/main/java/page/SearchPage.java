package page;

import helper.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(className = "button.search-button")
    private WebElement searchButton;

    public void getSearchfield(){
        getDriver().get(Constants.BASE_URL);
    }

    public void search(String searchInput){

        searchField.sendKeys(searchInput);
        searchButton.click();


    }



}
