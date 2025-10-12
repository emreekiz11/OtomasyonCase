package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    By toolbar = By.cssSelector("#autocomplete");
    By goa = By.xpath("//li[@id='goa']");
    By goaAdventure = By.xpath("//h5[normalize-space()='Perthby']");

    public void clickToolbar() {
        elementHelper.click(toolbar);
    }

    public void writeNameTheCity(String city) {
        WebElement searchBar = driver.findElement(toolbar);
        elementHelper.slowType(searchBar,city);
    }

    public void clickNameTheCity() {
        elementHelper.click(goa);
    }

    public void checkAdventure() {
        String adventureText = elementHelper.findElement(goaAdventure).getText();
        Assert.assertEquals(adventureText, "Perthby");
    }
}
