package steps;

import com.myTeck.Base;
import com.myTeck.Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends Base {
    loginPage LoginPage;
    @Given("user open the browser")
    public void user_open_the_browser() {
        luncher();

    }
    @When("fill the email as {string} and password as {string} and click on login button")
    public void fill_the_email_as_and_password_as_and_click_on_login_button(String email, String password) throws InterruptedException {
        LoginPage =new loginPage();
        LoginPage.loginAuth(email, password);

    }
    @Then("user should navigate at the homepage")
    public void user_should_navigate_at_the_homepage() throws InterruptedException {
        LoginPage.loginAssertion();

    }
}
