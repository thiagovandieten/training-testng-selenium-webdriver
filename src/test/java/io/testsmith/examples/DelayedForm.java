package io.testsmith.examples;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class DelayedForm extends TestBase {

    /**
     * Doesn't work
     */
    @Test(invocationCount = 3)
    public void waitForSuccessMessage() {
        getDriver().get("http://www.seleniuminaction.com/examples/FormWithDelay.html");

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isEqualTo(true);
    }

    /**
     * Doesn't work, as the element is already in the DOM (only not visible)
     */
    @Test(invocationCount = 3)
    public void waitForSuccessMessage_withImplicitlyWait() {
        getDriver().get("http://www.seleniuminaction.com/examples/FormWithDelay.html");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isEqualTo(true);
    }

    /**
     * Doesn't work as you don't know how long you have to wait
     *
     * @throws InterruptedException
     */
    @Test(invocationCount = 5)
    public void waitForSuccessMessage_withSleep() throws InterruptedException {
        getDriver().get("http://www.seleniuminaction.com/examples/FormWithDelay.html");

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        Thread.sleep(5000);

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isTrue();
    }

    /**
     * Works, as long as the timeOutInSeconds didn't exceeds <br/>
     * In this case we just wait as long as needed.
     */
    @Test(invocationCount = 5)
    public void waitForSuccessMessage_withWait() {
        getDriver().get("http://www.seleniuminaction.com/examples/FormWithDelay.html");

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.cssSelector(".alert-success"))));

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isTrue();
    }

}
