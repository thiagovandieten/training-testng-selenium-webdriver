package io.testsmith.parabank.answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RequestLoanPage extends AbstractPageBase {

    @FindBy(id = "amount")
    private WebElement loanAmoountTextfield;

    @FindBy(id = "downPayment")
    private WebElement downPaymentTextfield;

    @FindBy(id = "fromAccountId")
    private WebElement fromAccountIdSelect;

    @FindBy(xpath = "//input[@value='Apply Now']")
    private WebElement applyButton;

    public RequestLoanPage(WebDriver driver) {
        super(driver);
    }

    public RequestLoanResultPage submitLoanRequest(String loanAmount, String downPayment, String fromAccountId) {
        loanAmoountTextfield.sendKeys(loanAmount);
        downPaymentTextfield.sendKeys(downPayment);
        Select dropdown = new Select(fromAccountIdSelect);
        dropdown.selectByVisibleText(fromAccountId);
        applyButton.click();
        return new RequestLoanResultPage(driver);
    }
}
