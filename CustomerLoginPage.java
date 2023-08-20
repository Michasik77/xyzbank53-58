package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends PageBase {
    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-model='custId']")
    WebElement customerNameDropDown;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement loginButton;

    public void selectCustomerName(String customerName) {
        selectDropdownText(customerNameDropDown, customerName);
    }

    public void clickOnLoginButton() {
        click(loginButton);
    }
}
