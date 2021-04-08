package io.testsmith.examples;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class FormWithDisabledButton extends TestBase {

    public void submitForm() {
        getDriver().get("http://seleniuminaction.com/examples/FormWithDisabledButton.html");

        Assertions.assertThat(getDriver().findElement(By.cssSelector("button[type=submit]")).isEnabled()).isEqualTo(false);

        getDriver().findElement(By.cssSelector("input#username")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#password")).sendKeys("pass");

        getDriver().findElement(By.cssSelector("body")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector("button[type=submit]")).isEnabled()).isEqualTo(true);
    }

}
