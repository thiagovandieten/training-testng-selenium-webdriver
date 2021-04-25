package io.testsmith.parabank.answers;

import io.testsmith.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exercise3RequestLoan extends TestBase {

    @Test
    public void loanRequestDenied() {
        getDriver().get("http://parabank.parasoft.com");

        getDriver().findElement(By.name("username")).sendKeys("john");
        getDriver().findElement(By.name("password")).sendKeys("demo");
        getDriver().findElement(By.cssSelector("form[name = 'login'] .button")).click();

        getDriver().findElement(By.linkText("Request Loan")).click();

        getDriver().findElement(By.id("amount")).sendKeys("10000");
        getDriver().findElement(By.id("downPayment")).sendKeys("100");
        Select dropdownFromAccountId = new Select(getDriver().findElement(By.id("fromAccountId")));
        dropdownFromAccountId.selectByIndex(1);

        getDriver().findElement(By.xpath("//input[@value='Apply Now']")).click();

        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.
                textToBePresentInElement(
                        getDriver().findElement(By.id("loanStatus")), "Denied"));

        String result = getDriver().findElement(By.id("loanStatus")).getText();
        Assert.assertEquals(result,"Denied");
    }
}
