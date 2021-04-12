package io.testsmith.parabank.answers;

import io.testsmith.TestBase;
import io.testsmith.parabank.answers.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise4RequestLoanPageObjects extends TestBase {

    @Test
    public void requestLoan_outsideLimits_shouldBeDenied() {
        getDriver().get("http://parabank.parasoft.com");

        String result = new LoginPage(getDriver()).
                loadAndLoginAs("john", "demo")
                .navigateToRequestLoan()
                .submitLoanRequest("10000", "10", "21225")
                .getLoanApplicationResult();

        Assert.assertEquals(result, "Denied");
    }
}
