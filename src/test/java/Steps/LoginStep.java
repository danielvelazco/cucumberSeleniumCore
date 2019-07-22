package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil{

    private BaseUtil base;


    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void I_navigate_to_the_login_page() throws Throwable {
        base.driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");

    }

    @And("^I click login buttom$")
    public void I_click_login_buttom() throws Throwable {
       LoginPage page = new LoginPage(base.driver);
        page.clickLogin();
    }

    @Then("^I should see the useform page$")
    public void I_shold_see_the_useform_page() throws Throwable {
        WebDriverWait wait = new WebDriverWait(base.driver, 10);
        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Initial"))).isDisplayed(), true);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Initial"))).isDisplayed());

    }

    @And("^I enter the following for login$")
    public void I_enter_the_following_for_login(DataTable table) throws Throwable {

        //create an arrayList
        List<User> users = new ArrayList<User>();
        //store the users
        users = table.asList(User.class);

        /*
        for (type variable : arrayname) {
            // code block to be executed
        }*/

        LoginPage page = new LoginPage(base.driver);

        for (User user : users) {
            page.Login(user.username, user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void I_enter_username_and_password(String userName, String password) throws Throwable {
        System.out.println("Username is: " + userName);
        System.out.println("Passwword is: " + password);
    }

    public class User {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
