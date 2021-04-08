package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import io.testsmith.prestashop.answers.pages.AuthenticationPage;
import io.testsmith.prestashop.answers.pages.HomePage;
import io.testsmith.prestashop.answers.pages.MyAccountPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

/**
 * Implement Page Object Model
 **/
public class Exercise8Login extends TestBase {

    @Test
    public void loginSuccess() {
        getDriver().get("http://demo.seleniuminaction.com");

        MyAccountPage accountPage = new HomePage(getDriver()) //
                .clickOnLogin().loginWith("tester@test.com", "1qazxsw2");

        Assertions.assertThat(accountPage.getWelcomeMessage())
                .isEqualTo("Welcome to your account. Here you can manage all of your personal information and orders.");
    }

    @Test
    public void loginAccountDoesNotExist() {
        getDriver().get("http://demo.seleniuminaction.com");

        AuthenticationPage authenticationPage = new HomePage(getDriver()) //
                .clickOnLogin();
        authenticationPage.loginWith("1234@test.com", "1qazxsw2");

        Assertions.assertThat(authenticationPage.isAlertPresent()).isTrue();
    }
}
