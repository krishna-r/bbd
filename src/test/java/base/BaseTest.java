package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();  // Ensure chromedriver is in your PATH
    }

    public WebDriver getDriver() {
        return driver;  // Method to access the WebDriver instance
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Quit the driver
        }
    }
}
