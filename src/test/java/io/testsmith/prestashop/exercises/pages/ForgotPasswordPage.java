package io.testsmith.prestashop.exercises.pages;

import io.testsmith.prestashop.answers.pages.AbstractPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ForgotPasswordPage extends AbstractPageBase {

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

}
