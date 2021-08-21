package io.young.dev.selenium.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchWidget extends AbstractComponent {

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver) {
        super(driver);
    }

    public void enter(String keyword) {
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(d -> this.searchBox.isDisplayed());
    }
}
