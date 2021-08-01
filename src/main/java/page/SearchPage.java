package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(className = "button.search-button")
    private WebElement searchButton;

    @FindBy(className = "note-msg")
    private WebElement noResultsMessage;

    @FindBy(className = "category-products")
    private WebElement productsCategorySection;

    public void search(String searchInput) {
        searchField.sendKeys(searchInput);
        searchField.submit();
        // searchButton.click();
    }

    public String getNoResultsMessage() {
        return noResultsMessage.getText();
    }

    public boolean productsCategoryIsDisplayed() {
        return productsCategorySection.isDisplayed();
    }
}
