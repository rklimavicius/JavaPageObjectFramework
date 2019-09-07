package framework.tests;

import framework.pages.GooglePage;
import framework.pages.GoogleResultsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGoogleSearch extends BaseTest{

@Test public void performGoogleSearch()
{
    GooglePage googlePage = new GooglePage(driver);
    this.palauktiElemento(googlePage.searchInput);

    googlePage.ivestikoieskotiGoogle("pancakes recipe");
    googlePage.searchInput.sendKeys(Keys.ENTER);

    GoogleResultsPage resultsPage = new GoogleResultsPage(driver);
    this.palauktiElemento(resultsPage.allTab);

    assertTrue(resultsPage.imagesTab.isDisplayed());
}
}
