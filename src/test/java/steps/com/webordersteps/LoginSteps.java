package steps.com.webordersteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class LoginSteps {

  WebDriver driver;
  LoginPage loginPage;

    @Given("the user navigates to the WebOrder")
    public void the_user_navigates_to_the_web_order() {

        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("webOrderUrl"));
    }

    @When("the user provides the credentials")
    public void the_user_provides_the_credentials() {

        loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.getProperty("webOrderPassword"),
                ConfigReader.getProperty("webOrderUsername"));

//        loginPage = new LoginPage(driver);
//        loginPage.username.clear();
//        LoginPage.username.sendKeys(ConfigReader.getProperty("webOrderUsername"));
//        loginPage.password.clear();
//        LoginPage.password.sendKeys(ConfigReader.getProperty("webOrderPassword"));
//        loginPage.signInButton.click();

    }

    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {

      String expectedTitle = "ORDER DETAILS - WebOrder";
      String actualTitle = driver.getTitle();
        Assert.assertEquals("Home Page Validation After Login", expectedTitle, actualTitle);

    }



}
