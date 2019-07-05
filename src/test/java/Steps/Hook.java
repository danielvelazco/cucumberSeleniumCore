package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void initializeTest(){
        System.out.println("Opening the browser: MOCK");
    }

    @After
    public void tearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            //take a screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser: MOCK");
    }
}
