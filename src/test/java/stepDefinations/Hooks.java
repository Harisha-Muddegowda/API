package stepDefinations;

import baseClass.Utils;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Hooks {

    public static String scenarioName;
    public static Scenario scenario;
    public static Logger log;

    @Before
    public void before(Scenario scenarios) throws IOException {
        scenarioName = scenarios.getName();
        scenario = scenarios;
        log = Logger.getLogger(Hooks.class.getName());
        PropertyConfigurator.configure("log4j.properties");
        log.info("================================================================================================");
        log.info("============================== Scenario Name: " + scenarioName + " =============================");
        log.info("================================================================================================");
    }

    @After
    public void after(){
        if(scenario.isFailed()){
            Utils.req = null;
            log.error("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            log.error("++++++++++++++++++++++++++ Failed: Scenario Name- " + scenarioName + " ++++++++++++++++++++++++++");
            log.error("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }else{
            log.info("------------------------------------------------------------------------------------------------");
            log.info("-------------------------- Passed: Scenario Name- " + scenarioName +  " -------------------------");
            log.info("------------------------------------------------------------------------------------------------");
        }
    }
}
