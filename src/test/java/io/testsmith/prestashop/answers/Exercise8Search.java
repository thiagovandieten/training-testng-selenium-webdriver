package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import io.testsmith.prestashop.answers.pages.HomePage;
import io.testsmith.prestashop.answers.pages.SearchResultsPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

/**
 * Implement Page Object Model
 **/
public class Exercise8Search extends TestBase {

    @Test
    public void search() {
        getDriver().get("http://demo.seleniuminaction.com");
        new HomePage(getDriver()).searchFor("shirt");

        Assertions.assertThat(new SearchResultsPage(getDriver()).getProductNames()).contains("Faded Short Sleeves T-shirt");
    }

}
