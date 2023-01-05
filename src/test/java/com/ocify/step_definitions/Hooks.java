package com.ocify.step_definitions;

import com.ocify.utilities.ConfigurationReader;
import com.ocify.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("home.page"));
    }
    /*
    @After//cucumber-java dan cek not from j unit
    public void tearDownScenario(Scenario scenario){
        //Take screenshot
        //scenario class cucumber- java library den geliyor
        //scenario.isFailed()  ----> if scenario fails this method will return TRUE boolean value
        if (scenario.isFailed()){
            //TakesScreenshot is an interface below we make downcasting
            byte[] screenshot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName() );
        }


        Driver.closeDriver();
//     System.out.println("====Closing browser using cucumber @After");
//     System.out.println("=======Scenario ended//Take screenshot ");
    }

     */
}
