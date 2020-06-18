package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PersonalPage;
import utils.ConfigurationReader;
import utils.Driver;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class personal_sd {
    PersonalPage personalPage = new PersonalPage();

    @Given("I am in personal page")
    public void i_am_in_personal_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I click the business tab")
    public void i_click_the_business_tab() {
        personalPage.businessTab.click();
    }

    @Then("I can verify window title is {string}")
    public void i_can_verify_window_title_is(String string) {
        assertThat(Driver.getDriver().getTitle(), is(string));
    }
}
