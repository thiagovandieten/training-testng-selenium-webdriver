package io.testsmith.prestashop.exercises;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Search products (data-driven)
 **/
public class Exercise5 extends TestBase {
    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {"Dress", "Printed Dress"},
                {"Sleeves", "Faded Short Sleeves T-shirt"},
                {"Blouse", "Blouse"},
                {"T-shirt", "Faded Short Sleeves T-shirt"}
        };
    }

    @Test(dataProvider = "data")
    public void searchSuccess(String query, String expectedResult) {
        Assert.fail("Implement this test.");
    }
}
