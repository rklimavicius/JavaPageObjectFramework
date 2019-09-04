package framework.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    private static String browser = "Firefox";

    @BeforeEach
    public void setup(){
        //use Chrome Driver

        if (this.browser=="Chrome")
        {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

        if (this.browser=="Firefox")
        {
            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }
    }

    protected void WaitForElementToBeClickable(WebElement by)
    {
        WebDriverWait wait = new WebDriverWait(driver, 45);
        wait.until(ExpectedConditions.visibilityOf(by));
    }

    @AfterEach
    public void close(){
        driver.close();
    }
}
