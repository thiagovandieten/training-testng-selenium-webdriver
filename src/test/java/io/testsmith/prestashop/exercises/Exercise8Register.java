package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Implement Page Object Model
 **/
public class Exercise8Register extends TestBase {

    @Test
    public void register() {
        String rand = Integer.toString(new Random().nextInt());

        Assert.fail("Implement this test.");
    }

}
