package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Login with existing account
 **/
public class Exercise2 extends TestBase {

    @Test
    public void loginSuccess() {
        getDriver().findElement(By.cssSelector(".login")).click();

        getDriver().findElement(By.name("email")).sendKeys("tester@test.com");
        getDriver().findElement(By.name("passwd")).sendKeys("1qazxsw2");
        getDriver().findElement(By.id("SubmitLogin")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".logout")).isDisplayed())
                .isEqualTo(true);
    }

    @Test
    public void loginAccountDoesNotExist() {
        getDriver().findElement(By.cssSelector(".login")).click();

        getDriver().findElement(By.name("email")).sendKeys("1234@test.com");
        getDriver().findElement(By.name("passwd")).sendKeys("1qazxsw2");
        getDriver().findElement(By.id("SubmitLogin")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-danger")).isDisplayed()).isEqualTo(true);
    }
}
