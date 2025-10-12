package StepDefinitions;

import Pages.RegisterPage;
import Util.DriverFactory;
import Util.JsonReader;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    WebDriver driver = DriverFactory.getDriver();
    RegisterPage registerPage= new RegisterPage(driver);

    @When("Click register button")
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @When("Click the Email address input field")
    public void clickTheEmailAddressInputField() {
        registerPage.clickTheEmailAddressInputField();
    }

    @When("Enter the email address {string}")
    public void enterTheEmailAddress(String Veriler) {
        String email = JsonReader.getValue(Veriler, "email");
        registerPage.enterTheEmailAddress(email);
    }

    @When("Click the password input field")
    public void clickThePasswordInputField() {
        registerPage.clickThePasswordInputField();
    }

    @When("Enter the password {string}")
    public void enterThePassword(String Veriler) {
        String password = JsonReader.getValue(Veriler,"password");
        registerPage.enterThePassword(password);
    }

    @When("Click the confirm password input field")
    public void clickTheConfirmPasswordInputField() {
        registerPage.clickTheConfirmPasswordInputField();
    }

    @When("Enter the confirm password {string}")
    public void enterTheConfirmPassword(String Veriler) {
        String confirmPassword = JsonReader.getValue(Veriler,"confirmPassword");
        registerPage.enterTheConfirmPassword(confirmPassword);
    }

    @When("Click register to Qtrip button")
    public void clickRegisterToQtripButton() {
        registerPage.clickRegisterToQtripButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Check Successful Register")
    public void checkSuccessfulRegister() {
        registerPage.checkSuccessfulRegister();
    }

    @Then("Verify error message for register")
    public void verifyErrorMessageForRegister() {
        registerPage.verifyErrorMessageForRegister();
    }

    @Then("Verify error message for retypePassword")
    public void verifyErrorMessageForRetypePassword() {
        registerPage.verifyErrorMessageForRetypePassword();
    }
}
