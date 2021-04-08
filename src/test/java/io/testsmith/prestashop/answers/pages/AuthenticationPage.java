package io.testsmith.prestashop.answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends AbstractPageBase {

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    @FindBy(css = ".alert-danger")
    private WebElement alert;

    @FindBy(css = "input#email_create")
    private WebElement emailCreatTextfield;

    @FindBy(css = ".lost_password a")
    private WebElement forgotPasswordLink;

    @FindBy(css = "button#SubmitCreate")
    private WebElement createNewButton;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage loginWith(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new MyAccountPage(driver);
    }

    public boolean isAlertPresent() {
        return alert.isDisplayed();
    }

    public ForgotPasswordPage clickOnForgotPassword() {
        forgotPasswordLink.click();
        return new ForgotPasswordPage(driver);
    }

    public AccountCreationPage createNewAccount(String email) {
        emailCreatTextfield.sendKeys(email);
        createNewButton.click();
        return new AccountCreationPage(driver);
    }
}
