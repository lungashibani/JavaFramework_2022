package com.mtnplay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfilePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'manage')]")
    public WebElement btnManage;

    @FindBy(xpath = "//div[contains(text(), 'my profile')]")
    public WebElement btnMyProfile;

    @FindBy(id = "phone")
    public WebElement txtPhoneNumber;

    @FindBy(id = "name")
    public WebElement txtName;

    @FindBy(name = "email")
    public WebElement txtEmailAddress;

    @FindBy(id = "dob")
    public WebElement btnBirthday;

    @FindBy(id = "location")
    public WebElement btnDropDownLocation;

    @FindBy(xpath = "//option[contains(text(), 'Ghana')]")
    public WebElement btnDropDownLocation_Item;

    @FindBy(id = "language")
    public WebElement btnDropDownLanguage;

    @FindBy(xpath = "//option[contains(text(), 'Swahili')]")
    public WebElement btnDropDownLanguage_Item;

    public MyProfilePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
