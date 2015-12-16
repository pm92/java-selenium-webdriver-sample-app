package mypgs;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestLogin {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       }

 /**   @Test
    public void testLoginPage() {
        driver.navigate().to("https://owa.pgs-soft.com/");
        Assert.assertEquals("Outlook Web App", driver.getTitle());
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("login");
        System.out.println(userNameInput.getAttribute("value"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("passwd");
        WebElement signIn = driver.findElement(By.className("signinbutton"));
        signIn.click();
        Assert.assertTrue(isElementPresent(By.id("signInErrorDiv")));
    }

    @Test
    public void testRadioButton() {
        driver.navigate().to("http://codeseven.github.io/toastr/demo.html");

        for(int i=0; i<4; i++) {
            List<WebElement> toastTypeRadioButtons = driver.findElements(By.xpath("//*[@id='toastTypeGroup']//input[@type='radio']"));
            toastTypeRadioButtons.get(i).click();
            Assert.assertTrue("Radio should be selected", toastTypeRadioButtons.get(i).isSelected());
        }
        for(int i=0; i<8; i++) {
            List<WebElement> positionTypeRadioButtons = driver.findElements(By.xpath("//*[@id='positionGroup']//input[@type='radio']"));
            positionTypeRadioButtons.get(i).click();
            Assert.assertTrue("Radio should be selected", positionTypeRadioButtons.get(i).isSelected());
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        }catch (NoSuchElementException e) {
            return false;
        }

   }**/

    @Test
    public void testDropdown() {
        driver.navigate().to("https://testingcup.pgs-soft.com/");
        driver.findElement(By.linkText("Zadanie 8")).click();

        WebElement typyKartyWebElement = driver.findElement(By.id("task8_form_cardType"));
        Select typyKarty = new Select(typyKartyWebElement);
        typyKarty.selectByVisibleText("Discover");
        Assert.assertEquals("Discover", typyKarty.getFirstSelectedOption().getText());

        WebElement monthWebElement = driver.findElement(By.id("task8_form_cardInfo_month"));
        Select month = new Select(monthWebElement);
        month.selectByVisibleText("February");
        Assert.assertEquals("February", month.getFirstSelectedOption().getText());

        WebElement yearWebElement = driver.findElement(By.id("task8_form_cardInfo_year"));
        Select year = new Select(yearWebElement);
        year.selectByVisibleText("2025");
        Assert.assertEquals("2025", year.getFirstSelectedOption().getText());
    }
}
