package io.testsmith.prestashop.answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPageBase {

    @FindBy(className = "login")
    private WebElement loginLink;

    @FindBy(css = "#contact-link > a")
    private WebElement contactLink;

    @FindBy(css = "input#search_query_top")
    private WebElement searchTextfield;

    @FindBy(css = "button[name='submit_search']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AuthenticationPage clickOnLogin() {
        loginLink.click();
        return new AuthenticationPage(driver);
    }

    public ContactPage navigateToContactPage() {
        contactLink.click();
        return new ContactPage(driver);
    }

    public SearchResultsPage searchFor(String query) {
        searchTextfield.sendKeys(query);
        searchButton.click();
        return new SearchResultsPage(driver);
    }
}
