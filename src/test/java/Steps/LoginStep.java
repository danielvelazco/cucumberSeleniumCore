package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {

    @Given("^I navigate to the login page$")
    public void I_navigate_to_the_login_page() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }


    @And("^I click login buttom$")
    public void I_click_login_buttom() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Then("^I should see the useform page$")
    public void I_shold_see_the_useform_page() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
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

        for (User user : users) {
            System.out.println("The usermane is: " + user.username);
            System.out.println("The password is: " + user.password);
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
