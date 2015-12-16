package mypgs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student06 on 15.12.15.
 */
public class HomepageLocator {

    public class Locator {

        @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div/div[2]/div[6]/a/h2")
        public WebElement buttonClick;

    }
}
