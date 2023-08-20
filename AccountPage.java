package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageBase {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='fontBig ng-binding']")
    WebElement customerFirstAndLastName;

    public String getCustomerFirstAndLastName() {
        return customerFirstAndLastName.getText();
    }

    public String fooMethod() {
        return "1";
    }
}
