package pages.flights;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InvoicePage {
    private SelenideElement getCustomerInfo(String option) {
        return $(By.xpath("//table//td//tr//div[contains(.,'" + option + "')]"));
    }

    public boolean isAddressVisible(String info) {
        return getCustomerInfo(info).isDisplayed();
    }

    public boolean isNameVisible(String info) {
        return getCustomerInfo(info).isDisplayed();
    }
    public boolean isPhoneNumberVisible(String info) {
        return getCustomerInfo(info).isDisplayed();
    }
}
