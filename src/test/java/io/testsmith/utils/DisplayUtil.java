package io.testsmith.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DisplayUtil {
    /**
     * If exception occurs the element can't be visible
     */
    public static boolean isDisplayed(WebDriver driver, By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (final NoSuchElementException ex) {
            return false;
        }
    }

}
