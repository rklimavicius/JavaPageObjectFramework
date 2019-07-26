package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://www.google.com";

    //Locators

    //Apply as Developer Button
    @FindBy(how = How.CSS, using = "input[name='q']")
    private WebElement searchInput;

    //Constructor
    public GooglePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void typeTextIntoSearchInput(String textToSearch){

        searchInput.sendKeys(textToSearch);

    }
}