package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import general.TestContext;

public class LoginSteps {
    private TestContext test;
    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

    @When("^I login this account$")
    public void iLoginThisAccount() throws Throwable {
        test.getNavigationHeader().selectMyAccountButton();
        test.getNavigationHeader().selectLogInOption();
        test.getLoginPage().enterEmail(test.getUser().getEmailAddress());
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
        test.getLoginPage().pressLoginButton();
    }
}
