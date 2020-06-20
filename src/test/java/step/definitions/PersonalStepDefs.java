package step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageBase;
import pages.PersonalPage;
import utils.ConfigurationReader;
import utils.Driver;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class PersonalStepDefs {
    PersonalPage personalPage = new PersonalPage();

    @Given("I am in personal page")
    public void i_am_in_personal_page() {
        String url = null;
        if (System.getProperty("env") != null) {
            //getProperty URL by -Denv=qa or dev or etc
            url = ConfigurationReader.getProperty(System.getProperty("env")+"_url");

        } else {
            url = ConfigurationReader.getProperty("url");
        }
        System.out.println("Going to the personal page");
        Driver.getDriver().get(url);
    }

    @When("I click the business tab")
    public void i_click_the_business_tab() {
        personalPage.businessTab.click();
    }

    @Then("I can verify window title is {string}")
    public void i_can_verify_window_title_is(String string) {
        assertThat(Driver.getDriver().getTitle(), is(string));
    }

    @And("I see the URL {string}")
    public void iSeeTheURL(String currentURL) {
        assertThat(Driver.getDriver().getCurrentUrl(), is(currentURL));
    }
}
