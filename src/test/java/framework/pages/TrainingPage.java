package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage {
    private WebDriver driver;

    //Locators
    @FindBy(how = How.ID, using = "sum1")
    public WebElement pirmasLaukas;

    @FindBy(how = How.ID, using = "sum2")
    public WebElement antrasLaukas;

    @FindBy(how = How.CSS, using = "button[onclick*='total']")
    public WebElement getTotalMygtukas;

    @FindBy(how = How.CSS, using = "button[onclick*='showInput']")
    public WebElement showMessageMygtukas;

    @FindBy(how = How.ID, using = "displayvalue")
    public WebElement displayLaukas;

    //Constructor
    public TrainingPage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
}