package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BusinessPage extends PageBase{
    public BusinessPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //!!! WebElements
}
