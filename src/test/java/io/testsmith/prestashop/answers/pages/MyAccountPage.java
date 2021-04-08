package io.testsmith.prestashop.answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPageBase {

    @FindBy(css = "a.login")
    private WebElement loginLink;

    @FindBy(css = "div#center_column > p")
    private WebElement welcomeMessage;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

}
