package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Login with existing account
 **/
public class Exercise2 extends TestBase {

    /**
     * 1. Navigate to http://demo.seleniuminaction.com
     * 2. Click on the `Sign In` button
     * 3. Enter a valid email and password
     * 4. click on the `Sign in` button
     * 5. Validate if the `Sign out` button is visible
     */
    @Test
    public void loginSuccess() {
        Assert.fail("Implement this test.");
    }

    /**
     * 1. Navigate to http://demo.seleniuminaction.com
     * 2. Click on the `Sign In` button
     * 3. Enter a invalid email and password
     * 4. click on the `Sign in` button
     * 5. Validate if an error is visible
     */
    @Test
    public void loginAccountDoesNotExist() {
        Assert.fail("Implement this test.");
    }
}
