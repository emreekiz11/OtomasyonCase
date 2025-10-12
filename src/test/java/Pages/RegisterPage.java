package Pages;

import Util.ElementHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    By registerButton = By.cssSelector(".nav-link.login.register");
    By registerInput = By.cssSelector("#floatingInput");
    By passwordButton = By.xpath("//div[2]//input[1]");
    By confirmPasswordButton = By.xpath("//div[3]//input[1]");
    By register = By.cssSelector("button[type='submit']");
    By login = By.cssSelector("button[type='submit']");



    public void clickRegisterButton() {
        elementHelper.click(registerButton);
    }

    public void clickTheEmailAddressInputField() {
        elementHelper.click(registerInput);
    }

    public void enterTheEmailAddress(String email) {
        elementHelper.sendKey(registerInput,email);
    }

    public void clickThePasswordInputField() {
        elementHelper.click(passwordButton);
    }

    public void enterThePassword(String password) {
        elementHelper.sendKey(passwordButton,password);

    }

    public void clickTheConfirmPasswordInputField() {
        elementHelper.click(confirmPasswordButton);
    }

    public void enterTheConfirmPassword(String confirmPassword) {
        elementHelper.sendKey(confirmPasswordButton,confirmPassword);
    }

    public void clickRegisterToQtripButton() {
        elementHelper.click(register);
    }

    public void checkSuccessfulRegister() {
        elementHelper.presenceElement(login);
    }

    public void verifyErrorMessageForRegister() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            Assert.assertEquals(alertText, "Failed - Email already exists");
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Hata: Alert bekleniyor ama gelmedi.");
            Assert.fail("Alert bekleniyordu ama gelmedi.");
        }
    }

    public void verifyErrorMessageForRetypePassword() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            Assert.assertEquals(alertText, "Password and confirm Password do not match");
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Hata: Alert bekleniyor ama gelmedi.");
            Assert.fail("Alert bekleniyordu ama gelmedi.");
        }
    }
}
