package TestAutomation.RunnerClasses;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"},
        glue={"TestAutomation.glue"},
        format = {"pretty","html:src/test/reports"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter"}
)
public class CukesRunner {

    @BeforeClass
    public static void reportsetup() {
        ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        ExtentCucumberFormatter.loadConfig(new File("src/test/extent-config.xml"));
        ExtentCucumberFormatter.addSystemInfo("Selenium Version", "2.53.1");
        ExtentCucumberFormatter.addSystemInfo("os", "Windows");

        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "V1.2.4");
        systemInfo.put("Extent Report Cucumber Version", "1.1.1");
    }
}

