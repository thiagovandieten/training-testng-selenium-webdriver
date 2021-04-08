package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Complete contactform
 **/
public class Exercise3 extends TestBase {

    @Test
    public void completeContactForm_confirmationShown() {
        getDriver().get("http://demo.seleniuminaction.com/index.php?controller=contact");

        new Select(getDriver().findElement(By.cssSelector("select#id_contact"))).selectByVisibleText("Customer service");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("email@test.com");
        getDriver().findElement(By.cssSelector("input#id_order")).sendKeys("order4321");
        getDriver().findElement(By.cssSelector("textarea#message")).sendKeys("The product arrived with damages.");
        getDriver().findElement(By.cssSelector("button#submitMessage")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector("p.alert-success")).getText())
                .isEqualTo("Your message has been successfully sent to our team.");
    }

    @Test
    public void invalidEmailGiven_shouldShowErrorMessage() {
        getDriver().get("http://demo.seleniuminaction.com/index.php?controller=contact");

        new Select(getDriver().findElement(By.cssSelector("select#id_contact"))).selectByVisibleText("Customer service");
        getDriver().findElement(By.cssSelector("input#email")).sendKeys("email");
        getDriver().findElement(By.cssSelector("input#id_order")).sendKeys("order4321");
        getDriver().findElement(By.cssSelector("textarea#message")).sendKeys("The product arrived with damages.");
        getDriver().findElement(By.cssSelector("button#submitMessage")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector("div.alert ol>li")).getText()).isEqualTo("Invalid email address.");
    }
}
