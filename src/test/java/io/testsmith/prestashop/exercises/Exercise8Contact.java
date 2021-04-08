package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Implement Page Object Model
 **/
public class Exercise8Contact extends TestBase {

    /**
     * 1. Navigate to http://demo.seleniuminaction.com
     * 2. Click on the `Contact us` button
     * 3. Complete the form
     * 4. Verify if the confirmation `Your message has been successfully sent to our team.` is visible
     **/
    @Test
    public void completeContactForm_confirmationShown() {
        Assert.fail("Implement this test.");
    }

    /**
     * 1. Navigate to http://demo.seleniuminaction.com
     * 2. Click on the `Contact us` button
     * 3. Complete the form with an invalid (format) email
     * 4. Verify if the message `Invalid email address.` is visible
     **/
    @Test
    public void invalidEmailGiven_shouldShowErrorMessage() {
        Assert.fail("Implement this test.");
    }
}
