package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.navigationheader.NavigationHeader;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private SelenideElement getUserNameField() {
        return $("[name='username']");
    }

    private SelenideElement getLoginButton() {
        return $(".btn-lg[type='submit']");
    }

    public void enterEmail(String email) {
        getUserNameField().sendKeys(email);
    }

    public NavigationHeader pressLoginButton() {
        getLoginButton().click();
        return page(NavigationHeader.class);
    }
}
