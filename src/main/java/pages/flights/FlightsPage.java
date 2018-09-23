package pages.flights;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.DateSelector;

import static com.codeborne.selenide.Selenide.$;

public class FlightsPage {
    private SelenideElement getButtonFirstBookNow() {
        return $(By.xpath("//tbody//tr[1]//button[@id = 'bookbtn']"));
    }
    private SelenideElement getButtonSearchFlights() {
        return $(By.xpath("//form[@name='flightmanualSearch']//button[contains(.,'Search')]"));
    }
    private SelenideElement getButtonSubmitPassengerCount() {
        return $("button#sumManualPassenger");
    }
    private SelenideElement getCabinClass() {
        return $("select[name='cabinclass']");
    }
    private SelenideElement getCabinClassOption(String option) {
        return $(By.xpath("//select[@name = 'cabinclass']/option[.='" + option + "']"));
    }
    private SelenideElement getCityArrivalInput() {
        return $("#s2id_location_to .select2-choice");
    }
    private SelenideElement getCityDepartureInput() {
        return $("#s2id_location_from .select2-choice");
    }
    private SelenideElement getCitySelection(String option) {
        return $(By.xpath("//span[@class = 'select2-match'][.='" + option + "']/parent::div[@class = 'select2-result-label']"));
    }
    private SelenideElement getRoundTripOption() {
        return $(By.xpath("//input[@id = 'round']/parent::div"));
    }
    private SelenideElement getPassengerCountAdult() {
        return $("select[name='madult']");
    }
    private SelenideElement getPassengerCountAdultOption(String count) {
        return $(By.xpath("//select[@name='madult']/option[@value = '" + count + "']"));
    }
    private SelenideElement getPassengerCountChildren() {
        return $("select[name='mchildren']");
    }
    private SelenideElement getPassengerCountChildrenOption(String count) {
        return $(By.xpath("//select[@name='mchildren']/option[@value = '" + count + "']"));
    }
    private SelenideElement getPassengerCountInfant() {
        return $("select[name='minfant']");
    }
    private SelenideElement getPassengerCountInfantOption(String count) {
        return $(By.xpath("//select[@name='minfant']/option[@value = '" + count + "']"));
    }
    private SelenideElement getPassengerCountInput() {
        return $("input[name='totalManualPassenger']");
    }
    private SelenideElement getTimeArrival() {
        return $("input[name='arrival']");
    }
    private SelenideElement getTimeDeparture() {
        return $("input[name='departure']");
    }

    public void selectCabinClass(String cabinClass) {
        getCabinClass().click();
        getCabinClassOption(cabinClass).click();
    }

    public void selectCityDeparture(String city) {
        getCityDepartureInput().click();
        getCityDepartureInput().sendKeys(city);
        getCitySelection(city).click();
    }

    public void selectCityArrival(String city) {
        getCityArrivalInput().click();
        getCityArrivalInput().sendKeys(city);
        getCitySelection(city).click();
    }

    public void openPassengerSelection() {
        getPassengerCountInput().click();
    }

    public void selectCountAdults(String count) {
        getPassengerCountAdult().click();
        getPassengerCountAdultOption(count).click();
    }

    public void selectCountChildren(String count) {
        getPassengerCountChildren().click();
        getPassengerCountChildrenOption(count).click();
    }

    public void selectCountInfant(String count) {
        getPassengerCountInfant().click();
        getPassengerCountInfantOption(count).click();
    }

    public void selectFirstBookNow() {
        getButtonFirstBookNow().click();
    }

    public void selectRoundTripOptions() {
        getRoundTripOption().click();
    }

    public void selectTimeArrival() {
        getTimeArrival().click();
        getTimeArrival().sendKeys(DateSelector.getSecondDate());
    }

    public void selectTimeDeparture() {
        getTimeDeparture().click();
        getTimeDeparture().sendKeys(DateSelector.getFirstDate());
    }

    public void submitPassengerCount() {
        getButtonSubmitPassengerCount().click();
    }

    public void submitSearchFilter() {
        getButtonSearchFlights().click();
    }

}
