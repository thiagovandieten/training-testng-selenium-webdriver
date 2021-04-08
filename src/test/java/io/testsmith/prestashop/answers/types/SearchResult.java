package io.testsmith.prestashop.answers.types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResult {

    private final String productName;
    private final String price;

    public SearchResult(WebElement el) {
        productName = el.findElement(By.cssSelector("a.product-name")).getText();
        price = el.findElement(By.cssSelector("span.product-price")).getText();
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

}
