package pages;

import enums.SortDirections;
import enums.SortValues;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CustomersPage extends BankManagerLoginPage {
    public CustomersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-model='searchCustomer']")
    WebElement searchCustomerField;

    public Integer countRows() {
        return driver.findElements(By.xpath("//*[@class='table table-bordered table-striped']//*[@class='ng-scope']")).size();
    }

    public WebElement makeCellLocator(String name) {
        return driver.findElement(By.xpath("//*[@class='table table-bordered table-striped']//*[@class='ng-scope']//*[contains(text(), '" + name + "')]"));
    }

    public WebElement makeRowLocator(String name) {
        return driver.findElement(By.xpath("//*[@class='table table-bordered table-striped']//*[@class='ng-scope']//*[contains(text(), '" + name + "')]/ancestor::*[@ng-repeat='cust in Customers | orderBy:sortType:sortReverse | filter:searchCustomer']"));
    }

    public void clickOnSortLink(SortValues sortValue) {
        driver.findElement(By.xpath("//*[contains(@ng-click, \"sortType = '" + sortValue + "'\")]")).click();
    }

    public List<String> getTextFromCellFirstNameColumn() {
        List<String> array = new ArrayList<>();
        List<WebElement> cells = driver.findElements(By.xpath("//*[@ng-repeat='cust in Customers | orderBy:sortType:sortReverse | filter:searchCustomer']/td[1]"));
        for (WebElement cell : cells) {
            String text = cell.getText();
            array.add(text);
        }
        return array;
    }

    public void checkSortDirection(SortDirections direction) {
        driver.findElement(By.xpath("//*[@class='fa fa-caret-" + direction + "']")).isDisplayed();
    }

    public void deleteTableRow(String name) {
        makeRowLocator(name).findElement(By.xpath("//*[@ng-click='deleteCust(cust)']")).click();
    }

    //driver.findElement(By.xpath("//*[@ng-model='searchCustomer']")).clear() == searchCustomerField.clear()


    public void filterCustomer(String customer) {
        searchCustomerField.sendKeys(customer);
    }

    public void clearFilterCustomer() {
        searchCustomerField.clear();
    }
}
