package com.mtnplay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyPlay_FilterContent extends BasePage {
    @FindBy(xpath = "//span[contains(text(), 'my play')]")
    public WebElement btnMyPlay;

    @FindBy(xpath = "//div[contains(text(), 'PURCHASES')]")
    public WebElement btnPurchases;

    @FindBy(xpath = "//div[contains(text(), 'SUBSCRIPTIONS')]")
    public WebElement btnSubscriptions;

    @FindBy(xpath = "//div[contains(text(), 'subscription')]")
    public WebElement txtContainsSubscription;

    public MyPlay_FilterContent(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);}
}


