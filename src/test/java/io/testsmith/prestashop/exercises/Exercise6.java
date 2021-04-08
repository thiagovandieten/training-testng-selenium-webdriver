package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test a slow form
 **/
public class Exercise6 extends TestBase {
    /**
     * Works, as long as the timeOutInSeconds didn't exceeds <br/>
     * In this case we just wait as long as needed.
     */
    @Test
    public void waitForSuccessMessage_withWait() {
        Assert.fail("Implement this test.");
    }

}
