package io.testsmith.prestashop.answers;

import io.testsmith.TestBase;
import io.testsmith.prestashop.answers.pages.HomePage;
import io.testsmith.prestashop.answers.pages.MyAccountPage;
import io.testsmith.prestashop.answers.types.Title;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Implement Page Object Model
 **/
public class Exercise8Register extends TestBase {

    @Test
    public void register() {
        String rand = Integer.toString(new Random().nextInt());
        MyAccountPage accountPage = new HomePage(getDriver())
                .clickOnLogin() //
                .createNewAccount(rand + "tester@test.com") //
                .setTitle(Title.MR) //
                .setFirstname("T") //
                .setLastname("Tester") //
                .setPassword("1qazxsw2") //
                .setDob("12", "1", "1986")//
                .clickOnRegister();

        Assertions.assertThat(accountPage.getWelcomeMessage()).isEqualTo("Your account has been created.");
    }

}
