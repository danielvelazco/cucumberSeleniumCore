package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Logon {
    private BaseUtil base;
    @Given("^I navigate to the logon page$")
    public void I_navigate_to_the_logon_page() throws Throwable {
       // base.driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
        System.out.println("hola");
    }

    @And("^Enter mi user and pass$")
    public void Enter_mi_user_and_pass() throws Throwable {
        System.out.println("hola otra vez");
    }
}
