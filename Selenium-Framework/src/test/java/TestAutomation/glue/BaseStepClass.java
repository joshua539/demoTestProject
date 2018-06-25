package TestAutomation.glue;

import TestAutomation.Pages.GooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by joshu on 24-12-2016.
 */
public class BaseStepClass {
    public static WebDriver driver;

    public BaseStepClass(){
        driver = Hooks.driver;
        PageFactory.initElements(driver, GooglePage.class);
    }

}
