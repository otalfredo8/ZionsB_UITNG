package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-segmentpath='business']")
    public WebElement businessTab;

    @FindBy(xpath = "//a[@data-segmentpath='wealth']")
    public WebElement wealthTab;
}
