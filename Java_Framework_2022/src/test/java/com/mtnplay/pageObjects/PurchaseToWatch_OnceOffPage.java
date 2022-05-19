package com.mtnplay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseToWatch_OnceOffPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[2]/div[6]/div[1]")
    public WebElement subscriptionItem;

    @FindBy(xpath = "//div[contains(text(), 'Purchase for R407')]")
    public WebElement btnPurchaseForAmount;

    @FindBy(xpath = "//input[@id='paymentMethod']")
    public WebElement rdBtnAirtime; //Two elements with the same ID

    @FindBy(xpath = "//div[contains(text(), 'confirm purchase')]")
    public WebElement btnConfirmPurchase;

    @FindBy(xpath = "//div[contains(text(), 'confirm')]")
    public WebElement btnConfirm;

    @FindBy(xpath = "//div[contains(text(), 'watch now')]")
    public WebElement btnWatchNow;

    public PurchaseToWatch_OnceOffPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);}
}
