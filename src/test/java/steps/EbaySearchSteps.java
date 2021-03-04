package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EbayHomePage;
import utils.Driver;

import static utils.Driver.getDriver;

public class EbaySearchSteps {
    WebDriver driver;
    EbayHomePage ebayHomePage;

    @Given("user is on ebay home page")
    public void user_is_on_ebay_home_page() {

       Driver.getDriver().get("https://ebay.com");

    }

    @When("user searches for iMac 2021")
    public void user_searches_for_i_mac() {
        ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.searchBox.sendKeys("iMac 2021");
        ebayHomePage.searchButton.click();

    }

    @Then("user sees results about iMac only")
    public void user_sees_results_about_i_mac_only() {

    }

    @And("there are more than 3 pages of results")
    public void there_are_more_than_pages_of_results() {

    }
}
