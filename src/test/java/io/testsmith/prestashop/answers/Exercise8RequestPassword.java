package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import io.testsmith.prestashop.answers.pages.ForgotPasswordPage;
import io.testsmith.prestashop.answers.pages.HomePage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

/**
 * Implement Page Object Model
 **/
public class Exercise8RequestPassword extends TestBase {

    @Test
    public void requestNewPasswordExistingUser_SuccessMessageShown() {
        ForgotPasswordPage page = new HomePage(getDriver())
                .clickOnLogin() //
                .clickOnForgotPassword() //
                .requestNewPassword("tester@test.com");

        Assertions.assertThat(page.getMessages()).contains("A confirmation email has been sent to your address: tester@test.com");
    }

    @Test
    public void requestNewPasswordNonExistingUser_ErrorMessageShown() {
        ForgotPasswordPage page = new HomePage(getDriver())
                .clickOnLogin() //
                .clickOnForgotPassword() //
                .requestNewPassword("Test@test.com");

        Assertions.assertThat(page.getMessages()).contains("There is 1 error\nThere is no account registered for this email address.");
    }

}
