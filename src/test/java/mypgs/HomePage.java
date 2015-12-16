package mypgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student06 on 16.12.15.
 */
public class HomePage {

    private HomepageLocator locator;

    public HomePage(WebDriver driver)
    {
        locator = new HomepageLocator();
        PageFactory.initElements(driver,locator);

    }
    public void clickOnZadanie(){
        locator.zadanie6Link.click();
    }

}
