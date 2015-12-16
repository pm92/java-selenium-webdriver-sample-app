package mypgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student06 on 15.12.15.
 */
public class LoginPage {

    private HomepageLocator locators;

    public LoginPage(WebDriver driver) {
        locators = new HomepageLocator();
        PageFactory.initElements(driver, locators);
    }

    public void Enter(){
        locators.buttonClick.click();
    }
}
