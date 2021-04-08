package io.testsmith.examples;

import io.testsmith.TestBase;
import io.testsmith.utils.DisplayUtil;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class FormAddDiv extends TestBase {

    /**
     * Doesn't work, as the div is added to the DOM.
     */
    public void waitForSuccessMessage() {
        getDriver().get("http://www.seleniuminaction.com/examples/FormAddDiv.html");

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isEqualTo(false);

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-success")).isDisplayed()).isEqualTo(true);
    }

    public void waitForSuccessMessage_CustomIsDisplayed() {
        getDriver().get("http://www.seleniuminaction.com/examples/FormAddDiv.html");

        Assertions.assertThat(DisplayUtil.isDisplayed(getDriver(), By.cssSelector(".alert-success"))).isEqualTo(false);

        getDriver().findElement(By.cssSelector("input#firstName")).sendKeys("John");
        getDriver().findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("foo@bar.com");

        getDriver().findElement(By.cssSelector("button")).click();

        Assertions.assertThat(DisplayUtil.isDisplayed(getDriver(), By.cssSelector(".alert-success"))).isEqualTo(true);
    }

}
