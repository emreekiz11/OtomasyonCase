package StepDefinitions;

import Pages.SearchPage;
import Util.DriverFactory;
import Util.JsonReader;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    WebDriver driver = DriverFactory.getDriver();
    SearchPage searchPage = new SearchPage(driver);

    @When("Click Toolbar")
    public void clickToolbar() {
        searchPage.clickToolbar();
    }

    @When("Write name the city {string}")
    public void writeNameTheCity(String CitYNames) {
        String city = JsonReader.getValue(CitYNames,"city1");
        searchPage.writeNameTheCity(city);
    }

    @When("Click name the city")
    public void clickNameTheCity() {
        searchPage.clickNameTheCity();
    }

    @Then("Check Adventure")
    public void checkAdventure() {
        searchPage.checkAdventure();
    }
}
