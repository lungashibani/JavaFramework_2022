package com.mtnplay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MtnPlaySearchP_PurchasesPage extends BasePage {

    @FindBy(xpath = "//div[@class='icons']")
    public WebElement btnSearch;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchField;

    public MtnPlaySearchP_PurchasesPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);}
}
