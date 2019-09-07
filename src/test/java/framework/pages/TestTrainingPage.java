package framework.tests;

import framework.pages.TrainingPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTrainingPage extends BaseTest{

    @Test public void testSumavimas() throws InterruptedException
    {

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        TrainingPage trainingPuslapis = new TrainingPage(driver);
        palauktiElemento(trainingPuslapis.showMessageMygtukas);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");

        palauktiElemento(trainingPuslapis.getTotalMygtukas);

        trainingPuslapis.pirmasLaukas.sendKeys("9");
        trainingPuslapis.antrasLaukas.sendKeys("5");

        trainingPuslapis.getTotalMygtukas.click();
        //Thread.sleep(5000);

        assertTrue(trainingPuslapis.displayLaukas.isDisplayed());
        assertEquals("14", trainingPuslapis.displayLaukas.getText());

    }



}
