package io.young.dev.selenium.srp.result;

import io.young.dev.selenium.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "이미지")
    private WebElement images;

    @FindBy(linkText = "뉴스")
    private WebElement news;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToImages() {
        this.images.click();
    }

    public void goToNews() {
        this.news.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(d -> this.bar.isDisplayed());
    }
}
