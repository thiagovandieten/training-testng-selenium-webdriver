package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Time;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Search products (data-driven)
 **/
public class Exercise5 extends TestBase {
    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {"Dress", "Printed Dress"},
                {"Sleeves", "Faded Short Sleeves T-shirt"},
                {"Blouse", "Blouse"},
                {"T-shirt", "Faded Short Sleeves T-shirt"}
        };
    }

    @Test(dataProvider = "data")
    public void searchSuccess(String query, String expectedResult) {
        getDriver().get("http://demo.seleniuminaction.com/index.php");
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        getDriver().findElement(By.name("search_query")).sendKeys(query);
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

        Assertions.assertThat(productNames).contains(expectedResult);
    }
}
