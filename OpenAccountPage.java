package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends BankManagerLoginPage {
    public OpenAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='userSelect']")
    WebElement customerNameDropdown;

    @FindBy(xpath = "//*[@id='currency']")
    WebElement currencyDropdown;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement processButtonDropdown;

    public void selectCustomerName(String customerName) {
        selectDropdownText(customerNameDropdown, customerName);
    }

    public void selectCurrency(String currency) {
        selectDropdownText(currencyDropdown, currency);
    }

    public void clickOnProcessButton() {
        click(processButtonDropdown);
    }
}
