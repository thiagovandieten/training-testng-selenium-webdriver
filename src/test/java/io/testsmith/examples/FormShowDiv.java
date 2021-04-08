package io.testsmith.examples;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class FormShowDiv extends TestBase {

    public void waitForSuccessMessage() {
        getDriver().get("http://www.seleniuminaction.com/examples/FormShowDiv.html");

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isEqualTo(false);

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isEqualTo(true);
    }

}
