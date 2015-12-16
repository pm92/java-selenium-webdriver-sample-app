package mypgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student06 on 15.12.15.
 */
public class LoginPage {

    private LoginLocatores locatores;

    public LoginPage(WebDriver driver)
    {
        locatores = new LoginLocatores();
        PageFactory.initElements(driver,locatores);

    }
    public void loginAs(String username, String password){
        locatores.login.sendKeys(username);
        locatores.password.sendKeys(password);
        locatores.signIn.click();
    }

}
