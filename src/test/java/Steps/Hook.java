package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){

        System.out.println("Opening the browser: Firefox");
        System.setProperty("webdriver.gecko.driver","geckodriver");
        base.driver = new FirefoxDriver();

        //passing a dummy webDriver instance

    }

    @After
    public void tearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            //take a screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser: MOCK");
        base.driver.quit();
    }
}
