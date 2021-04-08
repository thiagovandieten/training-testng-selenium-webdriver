package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

/**
 * Register a new account
 **/
public class Exercise1 extends TestBase {

    @Test
    public void registerNewAccount() {
        final String rand = Integer.toString(new Random().nextInt());

        getDriver().get("http://demo.seleniuminaction.com/index.php");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        getDriver().findElement(By.cssSelector("a.login")).click();

        getDriver().findElement(By.cssSelector("input#email_create")).sendKeys(rand + "tetser@test.com");
        getDriver().findElement(By.cssSelector("button#SubmitCreate")).click();

        getDriver().findElement(By.cssSelector("input#id_gender1")).click();
        getDriver().findElement(By.cssSelector("input#customer_firstname")).sendKeys("T");
        getDriver().findElement(By.cssSelector("input#customer_lastname")).sendKeys("Tester");
        getDriver().findElement(By.cssSelector("input#passwd")).sendKeys("1qazxsw2");

        Select days = new Select(getDriver().findElement(By.cssSelector("select#days")));
        days.selectByValue("12");

        Select months = new Select(getDriver().findElement(By.cssSelector("select#months")));
        months.selectByValue("1");

        Select years = new Select(getDriver().findElement(By.cssSelector("select#years")));
        years.selectByValue("1986");

        getDriver().findElement(By.cssSelector("button#submitAccount")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector("div#center_column > p")).getText()).isEqualTo("Your account has been created.");
    }
}
