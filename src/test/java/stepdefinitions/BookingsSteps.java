package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

public class BookingsSteps {
    private TestContext test;

    public BookingsSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I confirm the booking$")
    public void iConfirmTheBooking() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^new booking contains correct flight details$")
    public void newBookingContainsCorrectFlightDetails() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
