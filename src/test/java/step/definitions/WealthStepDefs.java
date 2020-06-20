package step.definitions;

import io.cucumber.java.en.When;
import pages.WealthPage;

public class WealthStepDefs {

    WealthPage wealthPage = new WealthPage();

    @When("I click the wealth tab")
    public void i_click_the_wealth_tab() {
        wealthPage.wealthTab.click();
    }
}
