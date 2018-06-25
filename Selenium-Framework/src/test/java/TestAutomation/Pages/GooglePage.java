package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by joshu on 24-12-2016.
 */
public class GooglePage {

    public static WebDriver driver;

    public GooglePage(){
        driver = Hooks.driver;
    }

    public static void login(){
        driver.navigate().to("http://www.google.co.in");
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }

}
