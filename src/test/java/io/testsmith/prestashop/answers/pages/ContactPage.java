package io.testsmith.prestashop.answers.pages;

import io.testsmith.prestashop.answers.types.ContactSubject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactPage extends AbstractPageBase {

    @FindBy(css = ".contact-form-box")
    private List<WebElement> contactForm;

    @FindBy(css = "h1.page-heading")
    private WebElement pageTitle;

    @FindBy(css = "select#id_contact")
    private WebElement subjectSelect;

    @FindBy(css = "input#email")
    private WebElement emailField;

    @FindBy(css = "input#id_order")
    private WebElement referenceField;

    @FindBy(css = "textarea#message")
    private WebElement messageField;

    @FindBy(css = "button#submitMessage")
    private WebElement submitButton;

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    @FindBy(css = "div.alert ol>li")
    private WebElement errorMessage;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public ContactPage completeForm(ContactSubject subject, String email, String orderReference, String message) {
        new Select(subjectSelect).selectByVisibleText(subject.toString());
        emailField.sendKeys(email);
        referenceField.sendKeys(orderReference);
        messageField.sendKeys(message);
        submitButton.click();
        return this;
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

}
