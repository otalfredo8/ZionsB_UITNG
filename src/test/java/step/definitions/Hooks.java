package step.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before(order = 0)
    public void setUpEnvWaits() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before(value = "@db", order = 1)
    public void connect(){
        //!!! JDBC Connection
    }

    @After
    public void tearDownScenario(Scenario scenario){
        //cucumber-java.5.6v scenario.write
        scenario.log("scenario.getName() = " + scenario.getName());
        scenario.log("Complete scenario: " + scenario.getName());
        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //cucumber-java.5.6v scenario.embed
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        scenario.log("Close driver");
        Driver.closeDriver();
    }

}
