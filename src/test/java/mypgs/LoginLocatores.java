package mypgs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student06 on 15.12.15.
 */
public class LoginLocatores {
    @FindBy(how = How.XPATH, using = ".//*[@id='LoginForm__username']")
    public WebElement login;

    @FindBy(how = How.XPATH, using = ".//*[@id='LoginForm__password']")
    public WebElement password;

    @FindBy(how = How.XPATH, using = ".//*[@id='LoginForm_save']")
    public WebElement signIn;


}
