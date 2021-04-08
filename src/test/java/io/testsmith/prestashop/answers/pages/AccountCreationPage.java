package io.testsmith.prestashop.answers.pages;

import io.testsmith.prestashop.answers.types.Title;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountCreationPage extends AbstractPageBase {

    @FindBy(css = "input#id_gender1")
    private WebElement maleRadio;

    @FindBy(css = "input#id_gender2")
    private WebElement femaleRadio;

    @FindBy(css = "#customer_firstname")
    private WebElement firstnameTextfield;

    @FindBy(css = "#customer_lastname")
    private WebElement lastnameTextfield;

    @FindBy(css = "input#email")
    private WebElement emailTextfield;

    @FindBy(css = "input#passwd")
    private WebElement passwordTextfield;

    @FindBy(css = "select#days")
    private WebElement daysSelect;

    @FindBy(css = "select#months")
    private WebElement monthsSelect;

    @FindBy(css = "select#years")
    private WebElement yearsSelect;

    @FindBy(css = "#submitAccount")
    private WebElement registerButton;

    public AccountCreationPage(WebDriver driver) {
        super(driver);
    }

    public AccountCreationPage setTitle(Title mr) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(maleRadio));

        if (mr.equals(Title.MR)) {
            maleRadio.click();
        } else if (mr.equals(Title.MRS)) {
            femaleRadio.click();
        }
        return this;
    }

    public AccountCreationPage setFirstname(String firstname) {
        firstnameTextfield.sendKeys(firstname);
        return this;
    }

    public AccountCreationPage setLastname(String lastname) {
        lastnameTextfield.sendKeys(lastname);
        return this;
    }

    public AccountCreationPage setEmail(String email) {
        emailTextfield.sendKeys(email);
        return this;
    }

    public AccountCreationPage setPassword(String password) {
        passwordTextfield.sendKeys(password);
        return this;
    }

    public AccountCreationPage setDob(String days, String months, String years) {
        Select daySelect = new Select(daysSelect);
        daySelect.selectByValue(days);

        Select monthSelect = new Select(monthsSelect);
        monthSelect.selectByValue(months);

        Select yearSelect = new Select(yearsSelect);
        yearSelect.selectByValue(years);
        return this;
    }

    public MyAccountPage clickOnRegister() {
        registerButton.click();
        return new MyAccountPage(driver);
    }

}
