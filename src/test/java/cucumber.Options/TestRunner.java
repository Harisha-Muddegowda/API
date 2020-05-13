package cucumber.Options;

//import com.cucumber.listener.Reporter;
import gherkin.formatter.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.*;
//import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"json:target/jsonReports/cucumber.json", "html:target/html_report/cucumber-html-report"},
//        "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-html-reports/Extent-report.html"},
        features="src/test/resources/features",
        glue= {"stepDefinations"})

public class TestRunner {

    @AfterClass
    public static void writeExtentReport() {
//        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//        Reporter.(new File("target/jsonReports/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
////        Reporter.setSystemInfo("os", "Mac OSX");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
