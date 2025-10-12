package StepDefinitions;

import Pages.LoginPage;
import Util.DriverFactory;
import Util.JsonReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("User is on homepage")
    public void userIsOnHomepage() {
        loginPage.HomePage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.ClickLoginButton();
    }

    @When("Click the Email address button")
    public void clickTheEmailAddressButton() {
        loginPage.clickEmailAddress();
    }

    @When("Write the email address {string}")
    public void writeTheEmailAddress(String Veriler) {
        String email = JsonReader.getValue(Veriler,"email");
        loginPage.writeTheEmailAddress(email);

    }

    @When("Click the password button")
    public void clickThePasswordButton() {
        loginPage.clickpassword();
    }

    @When("Write password {string}")
    public void writePassword(String Veriler) {
        String password = JsonReader.getValue(Veriler,"password");
        loginPage.writePassword(password);
    }

    @When("Click login to Qtrip button")
    public void clickLoginToQtripButton() {
        loginPage.clickLoginToQtripButton();

    }

    @Then("Check Successful Login")
    public void checkSuccessfulLogin() {
        loginPage.checkSuccessfulLogin();
    }

    @And("Click Logout Button")
    public void clickLogoutButton() {
        loginPage.clickLogoutButton();
    }

    @And("Check Successful Logout")
    public void checkSuccessfulLogout() {
       loginPage.checkSuccessfulLogout();
    }

    @Then("Verify error message")
    public void verifyErrorMessage() {
        loginPage.verifyErrorMessage();
    }

    @Then("Verify error message for wrong email")
    public void verifyErrorMessageForWrongEmail() {
        loginPage.verifyErrorMessageForWrongEmail();
    }
}
