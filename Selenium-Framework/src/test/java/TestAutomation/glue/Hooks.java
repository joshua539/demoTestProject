package TestAutomation.glue;

import TestAutomation.SeleniumConfig.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by joshu on 24-12-2016.
 */
public class Hooks {

    public static WebDriver driver;

    @Before
    public void Initialize(){
        Driver driverclass = new Driver();
        driver = driverclass.Launch("IE");

    }

    @After
    public void Terminate(){
        driver.close();
    }

}
