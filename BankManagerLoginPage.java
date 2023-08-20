package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends PageBase {
    public BankManagerLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-click='addCust()']")
    WebElement addCustomerTab;

    @FindBy(xpath = "//*[@ng-click='openAccount()']")
    WebElement openAccountTab;

    @FindBy(xpath = "//*[@ng-click='showCust()']")
    WebElement customersTab;

    public void openAddCustomerTab() {
        click(addCustomerTab);
    }

    public void openOpenAccountTab() {
        click(openAccountTab);
    }

    public void openCustomersTab() {
        click(customersTab);
    }
}
