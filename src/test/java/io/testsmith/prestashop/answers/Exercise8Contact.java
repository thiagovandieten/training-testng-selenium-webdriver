package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import io.testsmith.prestashop.answers.pages.ContactPage;
import io.testsmith.prestashop.answers.pages.HomePage;
import io.testsmith.prestashop.answers.types.ContactSubject;
import io.testsmith.prestashop.answers.types.ServiceDetails;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

/**
 * Implement Page Object Model
 **/
public class Exercise8Contact extends TestBase {

    @Test
    public void completeContactForm_confirmationShown() {
        getDriver().get("http://demo.seleniuminaction.com");

        ServiceDetails details = new ServiceDetails();
        details.setSubject(ContactSubject.CUSTOMER_SERVICE);
        details.setEmail("email@test.com");
        details.setReference("order4321");
        details.setMessage("The product arrived with damages.");

        ContactPage contactPage = new HomePage(getDriver()).navigateToContactPage()
                .completeForm(details.getSubject(), details.getEmail(), details.getReference(), details.getMessage());

        Assertions.assertThat(contactPage.getSuccessMessage()).isEqualTo("Your message has been successfully sent to our team.");
    }

    @Test
    public void invalidEmailGiven_shouldShowErrorMessage() {
        getDriver().get("http://demo.seleniuminaction.com");

        ServiceDetails details = new ServiceDetails();
        details.setSubject(ContactSubject.CUSTOMER_SERVICE);
        details.setEmail("email");
        details.setReference("order4321");
        details.setMessage("The product arrived with damages.");

        ContactPage contactPage = new HomePage(getDriver()).navigateToContactPage()
                .completeForm(details.getSubject(), details.getEmail(), details.getReference(), details.getMessage());

        Assertions.assertThat(contactPage.getErrorMessage()).isEqualTo("Invalid email address.");
    }
}
