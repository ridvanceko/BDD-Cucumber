package steps.com.ebaysteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ebaypages.EbayHomePage;
import pages.ebaypages.EbayResultsPage;
import utils.ConfigReader;
import utils.Driver;

public class EbaySearchSteps {

    WebDriver driver;
    EbayHomePage ebayHomePage;
    EbayResultsPage ebayResultsPage;

    @Given("user is on ebay home page")
    public void user_is_on_ebay_home_page() {
        driver = Driver.getDriver();
       Driver.getDriver().get("https://ebay.com");

    }

    @When("user searches for iMac 2021")
    public void user_searches_for_i_mac() {
        ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.searchBox.sendKeys(ConfigReader.getProperty("searchValue"));
        ebayHomePage.searchButton.click();

    }

    @Then("user sees results about iMac only")
    public void user_sees_results_about_i_mac_only() {
        ebayResultsPage = new EbayResultsPage(driver);
       for(WebElement link :  ebayResultsPage.listOfLinks) {
           System.out.println(link.getText());
       }

    }

    @And("there are more than 3 pages of results")
    public void there_are_more_than_pages_of_results() {
       ebayResultsPage = new ebayResultsPage(driver);

        int actualPageNumber = ebayResultsPage.pages.size();
        Assert.assertTrue(actualPageNumber>3);

    }
}
