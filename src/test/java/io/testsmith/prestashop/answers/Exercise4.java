package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Search products
 **/
public class Exercise4 extends TestBase {

    @Test
    public void submitSearch_shouldDisplayResult() {
        getDriver().get("http://demo.seleniuminaction.com/index.php");
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        getDriver().findElement(By.name("search_query")).sendKeys("shirt");
        getDriver().findElement(By.name("submit_search")).click();

        // Java 7
//         List<String> productNames = new ArrayList<>();
//         List<WebElement> nameEl = driver.findElements(By.cssSelector("ul.product_list a.product-name"));
//         for (WebElement el : nameEl) {
//         productNames.add(el.getText());
//         }

        // Java 8
        List<String> productNames = getDriver().findElements(By.cssSelector("#product_list .product-name")).stream().map(WebElement::getText)
                .collect(Collectors.toList());

        Assertions.assertThat(productNames).contains("Faded Short Sleeves T-shirt");
    }
}
