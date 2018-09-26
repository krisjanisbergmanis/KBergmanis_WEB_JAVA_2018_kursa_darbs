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
        test.getBookingSummaryPage().confirmBooking();
    }

    @And("^I confirm email address$")
    public void iConfirmEmailAddress() throws Throwable {
        test.getBookingSummaryPage().enterEmailConfirmation(test.getUser().getEmailAddress());
    }

    @And("^I enter first name$")
    public void iEnterFirstName() throws Throwable {
        test.getBookingSummaryPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter last name$")
    public void iEnterLastName() throws Throwable {
        test.getBookingSummaryPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() throws Throwable {
        test.getBookingSummaryPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() throws Throwable {
        test.getBookingSummaryPage().enterMobilePhone(test.getUser().getMobileNumber());
    }

    @And("^I enter Address$")
    public void iEnterAddress() throws Throwable {
        test.getBookingSummaryPage().enterAddress(test.getUser().getAddress());
    }

    @Then("^new booking contains correct flight details$")
    public void newBookingContainsCorrectFlightDetails() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I set country to ([^\\”]*)$")
    public void iSetCountryToLatvia(String country) throws Throwable {
        test.getBookingSummaryPage().enterCountry(country);
    }

    @Then("^invoice details contain correct data$")
    public void invoiceDetailsContainCorrectData() throws Throwable {
        test.getInvoicePage().isNameVisible(test.getUser().getFirstName() + ' ' + test.getUser().getLastName());
        test.getInvoicePage().isPhoneNumberVisible(test.getUser().getMobileNumber());
        test.getInvoicePage().isAddressVisible(test.getUser().getAddress());
    }
}
