package pages.navigationheader;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.flights.FlightsPage;
import pages.login.LoginPage;
import pages.signup.SignUpPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationHeader {

    private SelenideElement getFlights() { return $("[title ='Flights']"); }

    private SelenideElement getHomeButton() { return $("li a[href='https://www.phptravels.net/']"); }

    private SelenideElement getLoadingIndicator() {
        return $("#preloader");
    }

    private SelenideElement getLoginButton() { return $("#collapse #li_myaccount [href*='login']"); }

    private SelenideElement getLogoutButton() { return $(".open [href*='logout']"); }

    private SelenideElement getMyAccountButton() {
        return $("#collapse #li_myaccount .dropdown-toggle");
    }

    private SelenideElement getMyAccountButtonWhenLoggedIn(String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(),'" + username + "')]"));
    }

    private SelenideElement getSignUpButton() { return $("#collapse #li_myaccount [href*='register']"); }

    public FlightsPage selectFlights() {
        getFlights().click();
        return page(FlightsPage.class);
    }

    public void selectHomeButton() {
        getHomeButton().click();
    }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public void selectMyAccountButtonWhenLoggedIn(String username) {
        getMyAccountButtonWhenLoggedIn(username).click();
    }

    public LoginPage selectLogInOption() {
        getLoginButton().click();
        return page(LoginPage.class);
    }

    public NavigationHeader selectLogOutOption() {
        getLogoutButton().click();
        return page(NavigationHeader.class);
    }

    public SignUpPage selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPage.class);
    }

    public void waitForLoader() {
        getLoadingIndicator().waitUntil(Condition
                .attribute("style","displayed:none"), 5000);
    }
}
