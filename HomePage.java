package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-click='customer()']")
    WebElement customerLoginButton;

    @FindBy(xpath = "//*[@ng-click='manager()']")
    WebElement bankManagerLoginButton;

    public void clickOnCustomerLoginButton() {
        click(customerLoginButton);
    }

    public void clickOnBankManagerLoginButton() {
        click(bankManagerLoginButton);
    }
}
