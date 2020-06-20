package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PersonalPage extends PageBase {

    public PersonalPage() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //!!! WebElements


}
