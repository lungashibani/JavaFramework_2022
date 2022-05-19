package com.mtnplay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrontEndPlayer_And_RelatedIntegrationPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div[1]")
    public WebElement freeContentType;

    @FindBy(xpath = "//div[contains(text(), 'watch for free')]")
    public WebElement btnWatchForFree;

    public FrontEndPlayer_And_RelatedIntegrationPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);}
}
