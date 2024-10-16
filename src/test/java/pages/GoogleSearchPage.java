package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    private WebDriver driver;

    // Define web elements using Page Factory
    @FindBy(name = "q") // Google search input
    private WebElement searchBox;

    @FindBy(name = "btnK") // Google search button
    private WebElement searchButton;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize Page Factory elements
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public void search(String query) {
        searchBox.sendKeys(query);
        searchButton.click(); // Click on the search button
    }
}
