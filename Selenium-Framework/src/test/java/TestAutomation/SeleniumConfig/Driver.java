package TestAutomation.SeleniumConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by joshu on 24-12-2016.
 */
public class Driver {

    public WebDriver driver;

    public WebDriver Launch(String browser) {

        String currentDir   =   System.getProperty("user.dir");
        String driverPath   =   currentDir + "/DriverFiles/";
        DesiredCapabilities capability = null;

        switch(browser.toUpperCase()){

            case "IE":
                System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
                capability = DesiredCapabilities.internetExplorer();
                capability.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,"http://www.google.co.in");
                driver = new InternetExplorerDriver(capability);
                break;

            case "CHROME":
                System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
                capability = DesiredCapabilities.chrome();
                capability.setBrowserName("chrome");
                driver = new ChromeDriver(capability);
                break;

            case "FIREFOX":
                driver = new FirefoxDriver();
                break;

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        return driver;
    }
}
