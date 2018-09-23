package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import general.TestContext;

public class OtherSteps {
    private TestContext test;
    public OtherSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I have an existing account$")
    public void iHaveAnExistingAccount() throws Throwable {
        test.getNavigationHeader().selectMyAccountButton();
        test.getNavigationHeader().selectSignUpButton();
        test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
        test.getSignUpPage().enterLastName(test.getUser().getLastName());
        test.getSignUpPage().enterMobileNumber(test.getUser().getMobileNumber());
        test.getSignUpPage().enterEmail(test.getUser().getEmailAddress());
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
        test.getSignUpPage().enterConfirmPassword(test.getUser().getPassword());
        test.getSignUpPage().selectSignUpButton();
        test.getNavigationHeader().selectMyAccountButtonWhenLoggedIn(test.getUser().getFirstName());
        test.getNavigationHeader().selectLogOutOption();
    }
}