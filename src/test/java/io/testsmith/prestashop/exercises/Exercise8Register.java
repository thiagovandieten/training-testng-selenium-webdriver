package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Implement Page Object Model
 **/
public class Exercise8Register extends TestBase {

    /**
     * Register a new account
     * 1. Navigate to http://demo.seleniuminaction.com
     * 2. Click on the `Sign In` button
     * 3. Enter an emailaddress
     * 4. Click on the `Create an account` button
     * 5. Complete the rest of the form
     * 6. Validate if the `Sign out` button is visible
     **/
    @Test
    public void register() {
        String rand = Integer.toString(new Random().nextInt());

        Assert.fail("Implement this test.");
    }

}
