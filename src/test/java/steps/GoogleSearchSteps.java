package steps;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class GoogleSearchSteps extends BaseTest {

    private GoogleSearchPage googleSearchPage;
    @Given("User opens the Google search page")
    public void userOpensGoogleSearchPage() {
        googleSearchPage = new GoogleSearchPage(getDriver());  // Ensure driver is accessed properly
        googleSearchPage.open();  // This should now work without throwing NullPointerException
    }

    @When("User searches for {string}")
    public void userSearchesFor(String query) {
        googleSearchPage.search(query);
    }
}
