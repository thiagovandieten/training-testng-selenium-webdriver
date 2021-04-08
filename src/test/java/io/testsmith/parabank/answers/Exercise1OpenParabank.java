package io.testsmith.parabank.answers;

import io.testsmith.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise1OpenParabank extends TestBase {

    @Test
    public void openWebsite() {
        getDriver().get("http://parabank.parasoft.com");
        String currentTitle = getDriver().getTitle();

        Assert.assertEquals(currentTitle, "ParaBank | Welcome | Online Banking");
    }

}
