package general;

import lombok.Data;
import pages.flights.BookingSummaryPage;
import pages.flights.FlightsPage;
import pages.flights.InvoicePage;
import pages.login.LoginPage;
import pages.navigationheader.NavigationHeader;
import pages.signup.SignUpPage;

@Data
public class TestContext {
    private User user;
    private BookingSummaryPage bookingSummaryPage;
    private FlightsPage flightsPage;
    private InvoicePage invoicePage;
    private LoginPage loginPage;
    private NavigationHeader navigationHeader;
    private SignUpPage signUpPage;

    public TestContext() {
        this.user = new User();
        this.bookingSummaryPage = new BookingSummaryPage();
        this.flightsPage = new FlightsPage();
        this.invoicePage = new InvoicePage();
        this.loginPage = new LoginPage();
        this.navigationHeader = new NavigationHeader();
        this.signUpPage = new SignUpPage();
    }
}

