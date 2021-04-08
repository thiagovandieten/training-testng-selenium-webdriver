package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Check enabled / disabled formelements
 **/
public class Exercise7 extends TestBase {

    /**
     * 1. Navigate to http://www.seleniuminaction.com/examples/FormWithDisabledButton.html
     * 2. Verify if the button is clickable or enabled
     * 3. Enter `Username` and `Password`
     * 4. Move focus to some other element (body)
     * 5. Verify if the button is clickable or enabled
     */
    @Test
    public void submitForm() {
        Assert.fail("Implement this test.");
    }
}
