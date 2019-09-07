package framework.tests;

import framework.pages.GooglePage;
import framework.pages.GoogleResultsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSDA extends BaseTest{

@Test public void navigateTo15min()
{
    driver.manage().window().maximize();
    driver.get("https://www.15min.lt");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    assertEquals("15 naujienos", driver.getTitle());

    driver.navigate().to("https://www.basketnews.lt");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.navigate().back();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}

    @Test public void testSimpleForm() throws InterruptedException
    {
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");

        Thread.sleep(3000);

        WebDriverWait laukimas = new WebDriverWait(driver, 30);
        laukimas.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='showInput();']")));

        driver.findElement(By.cssSelector("input[placeholder*='your Messag']")).sendKeys("labas");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[onclick='showInput();']")).click();
        Thread.sleep(2000);

        assertEquals("labas",driver.findElement(By.id("display")).getText());
    }



}
