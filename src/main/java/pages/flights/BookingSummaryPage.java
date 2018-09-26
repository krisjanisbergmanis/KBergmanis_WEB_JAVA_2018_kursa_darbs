package pages.flights;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BookingSummaryPage {
    private SelenideElement getButtonConfirm() {
        return $(".form-group button[type='submit']");
    }
    private SelenideElement getInputAddress() {
        return $("[name='address']");
    }
    private SelenideElement getInputCountryBox() {
        return $("#s2id_autogen1");
    }
    private SelenideElement getInputCountry() {
        return $(".select2-input");
    }
    private SelenideElement getInputEmail() {
        return $("[name='email']");
    }
    private SelenideElement getInputEmailConfirmation() {
        return $("[name='confirmemail']");
    }
    private SelenideElement getInputFirstName() {
        return $("[name='firstname']");
    }
    private SelenideElement getInputLastName() {
        return $("[name='lastname']");
    }
    private SelenideElement getInputMobilePhone() {
        return $("[name='phone']");
    }
    private SelenideElement getSelectCountry(String option) {
        return $(By.xpath("//span[@class = 'select2-match'][.='" + option + "']"));
    }

    public void confirmBooking() {
        getButtonConfirm().click();
    }

    public void enterAddress(String adress) {
        getInputAddress().click();
        getInputAddress().sendKeys(adress);
    }

    public void enterCountry(String country) {
        getInputCountryBox().click();
        getInputCountry().sendKeys(country);
        getSelectCountry(country).click();
    }

    public void enterEmail(String email) {
        getInputEmail().click();
        getInputEmail().sendKeys(email);
    }

    public void enterEmailConfirmation(String email) {
        getInputEmailConfirmation().click();
        getInputEmailConfirmation().sendKeys(email);
    }

    public void enterFirstName(String firstName) {
        getInputFirstName().click();
        getInputFirstName().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getInputLastName().click();
        getInputLastName().sendKeys(lastName);
    }

    public void enterMobilePhone(String mobilePhone) {
        getInputMobilePhone().click();
        getInputMobilePhone().sendKeys(mobilePhone);
    }
}
