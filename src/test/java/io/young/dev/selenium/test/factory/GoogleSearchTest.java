package io.young.dev.selenium.test.factory;

import io.young.dev.selenium.factory.GoogleFactory;
import io.young.dev.selenium.factory.GooglePage;
import io.young.dev.selenium.test.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void searchTest(String language, String keyword) {
        this.googlePage = GoogleFactory.get(language, this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
        int resultsCount = this.googlePage.getResultsCount();

        System.out.println("Result Count: " + resultsCount);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {"ENG", "selenium"},
                {"FR", "design patterns"},
                {"SA", "docker"},
                {"ES", "selenium"}
        };
    }
}
