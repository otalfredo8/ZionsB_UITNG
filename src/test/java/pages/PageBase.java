package pages;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class PageBase {
    public PageBase(){
        WebDriverManager.chromedriver();
    }
}
