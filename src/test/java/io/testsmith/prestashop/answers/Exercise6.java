package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        getDriver().get("http://www.seleniuminaction.com/examples/FormWithDelay.html");

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.cssSelector(".alert-success"))));

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isTrue();
    }

}
