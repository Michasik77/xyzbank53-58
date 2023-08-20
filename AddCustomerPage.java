package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends BankManagerLoginPage {
    public AddCustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;

    public void fillFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void fillLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void fillPostCodeField(String postCode) {
        postCodeField.sendKeys(postCode);
    }

    public void clickOnAddCustomerButton() {
        click(addCustomerButton);
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void applyAlert() {
        driver.switchTo().alert().accept();
    }
}
