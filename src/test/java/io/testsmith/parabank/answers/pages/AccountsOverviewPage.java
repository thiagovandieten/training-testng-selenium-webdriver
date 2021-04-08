package io.testsmith.parabank.answers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsOverviewPage extends AbstractPageBase {

    public AccountsOverviewPage(WebDriver driver) {
        super(driver);
    }

    public RequestLoanPage navigateToRequestLoan() {
        driver.findElement(By.linkText("Request Loan")).click();
        return new RequestLoanPage(driver);
    }
}
