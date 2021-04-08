package io.testsmith.parabank.answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageBase {

    @FindBy(name = "username")
    private WebElement usernameTextfield;

    @FindBy(name = "password")
    private WebElement passwordTextfield;

    @FindBy(css = "form[name = login] .button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public AccountsOverviewPage loadAndLoginAs(String username, String password) {
        usernameTextfield.sendKeys(username);
        passwordTextfield.sendKeys(password);
        loginButton.click();
        return new AccountsOverviewPage(driver);
    }
}
