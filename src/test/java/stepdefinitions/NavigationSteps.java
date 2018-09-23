package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

public class NavigationSteps {
    private TestContext test;
    public NavigationSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I navigate to Accounts page$")
    public void iNavigateToAccountsPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I navigate to Home page$")
    public void iNavigateToHomePage() throws Throwable {
        test.getNavigationHeader().selectHomeButton();
    }

    @And("^I open invoice for the newest booking$")
    public void iOpenInvoiceForTheNewestBooking() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select FLIGHTS menu in booking section$")
    public void iSelectFLIGHTSMenuInBookingSection() throws Throwable {
        test.getNavigationHeader().selectFlights();
    }
}
