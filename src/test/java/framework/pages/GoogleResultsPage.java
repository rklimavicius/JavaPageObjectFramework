package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPage {
    private WebDriver driver;

    //Locators
    @FindBy(how = How.CSS, using = "#hdtb-msb-vis > div.hdtb-mitem.hdtb-msel.hdtb-imb > span > img")
    public WebElement allTab;

    @FindBy(how = How.CSS, using = "#hdtb-msb-vis > div:nth-child(2)")
    public WebElement imagesTab;

    //Constructor
    public GoogleResultsPage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
}