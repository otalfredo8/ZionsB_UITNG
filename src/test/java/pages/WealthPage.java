package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class WealthPage extends PageBase{
    public WealthPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //!!! WebElements
}
