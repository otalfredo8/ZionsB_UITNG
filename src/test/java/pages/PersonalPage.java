package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalPage {

    private static WebDriver driver;

    public PersonalPage() {
        System.setProperty("driver.webdriver.chromedriver", "C:\\Users\\alfre\\selenium utilities\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-segmentpath='business']")
    public WebElement businessTab;





}
