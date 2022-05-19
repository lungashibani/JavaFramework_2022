package com.mtnplay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubscribeToWatch_SubscriptionPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[2]/div[8]/div[1]")
    public WebElement subscriptionItem;

    @FindBy(xpath = "//input[@value='Week']")
    public WebElement rdBtnChoosePlan;

    @FindBy(xpath = "//div[contains(text(), 'Subscribe to watch')]")
    public WebElement btnSubscribeToWatch;

    @FindBy(xpath = "//label[contains(text(), 'Airtime')] ")
    public WebElement rdBtnAirtime;

    @FindBy(xpath = "//div[contains(text(), 'confirm purchase')]")
    public WebElement btnConfirmPurchase;

    @FindBy(xpath = "//div[contains(text(), 'confirm')]")
    public WebElement btnConfirm;

    @FindBy(xpath = "//div[contains(text(), 'watch now')]")
    public WebElement btnWatchNow;

    public SubscribeToWatch_SubscriptionPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);}
}

