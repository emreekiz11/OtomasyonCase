package Pages;

import Util.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void HomePage() {
        
    }

    public void ClickLoginButton() {
    }

    public void clickEmailAddress() {
    }

    public void writeEmailAddress() {
    }

    public void clickpassword() {
    }

    public void writepassword() {
    }

    public void clicklogintripbutton() {
    }
}
