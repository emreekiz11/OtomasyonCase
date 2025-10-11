package StepDefinitions;

import Pages.LoginPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TripSteps {
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

    @When("Write the email address")
    public void writeTheEmailAddress() {
        loginPage.writeEmailAddress();
    }

    @When("Click the password button")
    public void clickThePasswordButton() {
        loginPage.clickpassword();
    }

    @When("Write password")
    public void writePassword() {
        loginPage.writepassword();
    }

    @When("Click login to Qtrip button")
    public void clickLoginToQtripButton() {
        loginPage.clicklogintripbutton();
    }
}
