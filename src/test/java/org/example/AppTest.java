package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.setProperty("webdriver.chrome.driver","C:\\SElenium\\chromedriver.exe");
        //WebDriver driver
        WebDriver driver=new ChromeDriver();//web driver opening
        driver.manage().window().maximize();// maximize browser.
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.3.0");


    }
}
