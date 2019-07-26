package framework.tests;

import framework.pages.GooglePage;
import org.junit.jupiter.api.Test;

public class TestGoogleSearch extends BaseTest{

@Test public void performGoogleSearch()
{
    GooglePage googlePage = new GooglePage(driver);
    googlePage.typeTextIntoSearchInput("pancakes recipe");
}
}
