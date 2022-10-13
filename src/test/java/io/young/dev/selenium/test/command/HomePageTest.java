package io.young.dev.selenium.test.command;

import io.young.dev.selenium.command.ElementValidator;
import io.young.dev.selenium.command.HomePage;
import io.young.dev.selenium.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeTest
    public void setHomePage() {
        this.homePage = new HomePage(driver);
    }

    @Test
    public void homePageTest() {
        this.homePage.goTo();
        this.homePage.getElementValidators()
                .stream()
                .parallel()
                .map(ElementValidator::validate)
                .forEach(Assert::assertTrue);
    }
}
