package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.navigationheader.NavigationHeader;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPage {
    private SelenideElement getFirstNameField() {
        return $("[name='firstname']");
    }

    private SelenideElement getLastNameField() {
        return $("[name='lastname']");
    }

    private SelenideElement getMobileNumberField() {
        return $("[name='phone']");
    }

    private SelenideElement getEmailField() {
        return $("[name='email']");
    }

    private SelenideElement getPasswordField() {
        return $("[name='password']");
    }

    private SelenideElement getConfirmPasswordField() {
        return $("[name='confirmpassword']");
    }

    private SelenideElement getSignUpButton() {
        return $(".signupbtn.btn");
    }

    public void enterFirstName(String firstName) {
        getFirstNameField().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getLastNameField().sendKeys(lastName);
    }

    public void enterMobileNumber(String mobileNumber) {
        getMobileNumberField().sendKeys(mobileNumber);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        getConfirmPasswordField().sendKeys(password);
    }

    public NavigationHeader selectSignUpButton() {
        getSignUpButton().click();
        return page(NavigationHeader.class);
    }
}
