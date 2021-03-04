package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintInfoSteps {
    @Given("the user print firstname")
    public void the_user_print_firstname() {
        System.out.println("Techtorial");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @When("the user print lastname")
    public void the_user_print_lastname() {
        System.out.println("Academy");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see the fullname")
    public void the_user_should_see_the_fullname() {
        System.out.println("Techtorial Academy");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Given("the user print the city")
    public void the_user_print_the_city() {
        System.out.println("Houston");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }


    @Then("the user print city")
    public void the_user_print_city() {
        System.out.println("Chicago");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Then("the user print state")
    public void the_user_print_state() {
        System.out.println("Illinois");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Then("the user print age")
    public void the_user_print_age() {
        System.out.println("2");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see the school name")
    public void the_user_should_see_the_school_name() {
        System.out.println("Techtorial School");
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
}
