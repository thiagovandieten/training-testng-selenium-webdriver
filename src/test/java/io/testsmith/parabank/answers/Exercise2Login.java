package io.testsmith.parabank.answers;

import io.testsmith.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise2Login extends TestBase {

    @Test
    public void loginTest() {
        getDriver().get("http://parabank.parasoft.com");

        getDriver().findElement(By.name("username")).sendKeys("john");
        getDriver().findElement(By.name("password")).sendKeys("demo");
        getDriver().findElement(By.xpath("//input[@value='Log In']")).click();

        String currentTitle = getDriver().getTitle();

        Assert.assertEquals(currentTitle, "ParaBank | Accounts Overview");

        WebElement accountsOverviewHeader = getDriver().findElement(By.xpath("//h1[@class='title']"));

        Assert.assertTrue(accountsOverviewHeader.isDisplayed());
    }
}
