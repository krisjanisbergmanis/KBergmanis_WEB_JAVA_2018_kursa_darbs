package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

public class FlightSteps {
    private TestContext test;

    public FlightSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I book the first flight offer available$")
    public void iBookTheFirstFlightOfferAvailable() throws Throwable {
        test.getFlightsPage().selectFirstBookNow();
    }

    @And("^I confirm guest count$")
    public void iConfirmGuestCount() throws Throwable {
        test.getFlightsPage().submitPassengerCount();
    }

    @And("^I search for a flight$")
    public void iSearchForAFlight() throws Throwable {
        test.getFlightsPage().submitSearchFilter();
    }

    @And("^I select ROUND TRIP flight option$")
    public void iSelectROUNDTRIPFlightOption() throws Throwable {
        test.getFlightsPage().selectRoundTripOptions();
    }

    @And("^I set ([^\\”]*) as arrival airport$")
    public void iSetBARCELONAAsArrivalAirport(String city) throws Throwable {
        test.getFlightsPage().selectCityArrival(city);
    }

    @And("^I set ([^\\”]*) class tickets$")
    public void iSetFIRSTClassTickets(String cabinClass) throws Throwable {
        test.getFlightsPage().selectCabinClass(cabinClass);
    }

    @And("^I set ([^\\”]*) as departure airport$")
    public void iSetRIGAAsDepartureAirport(String city) throws Throwable {
        test.getFlightsPage().selectCityDeparture(city);
    }

    @And("^I set valid departure date$")
    public void iSetValidDepartureDate() throws Throwable {
        test.getFlightsPage().selectTimeDeparture();
    }

    @And("^I set valid return date$")
    public void iSetValidReturnDate() throws Throwable {
        test.getFlightsPage().selectTimeArrival();
    }

    @And("^I set ([^\\”]*) adults$")
    public void iSetAdults(String count) throws Throwable {
        test.getFlightsPage().selectCountAdults(count);
    }

    @And("^I set ([^\\”]*) children$")
    public void iSetChildren(String count) throws Throwable {
        test.getFlightsPage().selectCountChildren(count);
    }

    @And("^I set ([^\\”]*) infant$")
    public void iSetInfant(String count) throws Throwable {
        test.getFlightsPage().selectCountInfant(count);
    }

    @And("^I open guest selection$")
    public void iOpenGuestSelection() throws Throwable {
        test.getFlightsPage().openPassengerSelection();
    }
}
