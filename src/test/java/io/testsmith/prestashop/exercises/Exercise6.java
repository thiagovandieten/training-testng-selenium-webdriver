package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test a slow form
 **/
public class Exercise6 extends TestBase {

    /**
     * 1. Navigate to http://www.seleniuminaction.com/examples/FormWithDelay.html
     * 2. Enter `First name`, `Last name` and `email`
     * 3. Click on the `Save` button
     * 4. Wait just long enough till the text `Well done! Thanks for submitting the information!` is visible
     */
    @Test
    public void waitForSuccessMessage_withWait() {
        Assert.fail("Implement this test.");
    }

}
