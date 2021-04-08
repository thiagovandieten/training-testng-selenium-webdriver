package io.testsmith.parabank.answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestLoanResultPage extends AbstractPageBase {

    @FindBy(id = "loanStatus")
    private WebElement applicationResultTextfield;

    public RequestLoanResultPage(WebDriver driver) {
        super(driver);
    }

    public String getLoanApplicationResult() {
        return applicationResultTextfield.getText();
    }
}
