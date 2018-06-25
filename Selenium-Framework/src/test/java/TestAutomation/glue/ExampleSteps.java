package TestAutomation.glue;

import TestAutomation.Pages.GooglePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ExampleSteps extends BaseStepClass {
    @Given("I am Navigating to Google Page")
    public void Navigation_Google_page() {
        GooglePage.login();

    }

}
