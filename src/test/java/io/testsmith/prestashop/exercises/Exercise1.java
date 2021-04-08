package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Register a new account
 **/
public class Exercise1 extends TestBase {

    @Test
    public void registerNewAccount() {
        final String rand = Integer.toString(new Random().nextInt());

        Assert.fail("Implement this test.");
    }
}
