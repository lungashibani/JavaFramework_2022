package com.mtnplay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Glob_LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='loginId']")
    public WebElement emailTextField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@class='blue button']")
    public WebElement submitButton;

    public Glob_LoginPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }

    public void OpenPage() throws Exception {

        if (System.getProperty("env").equals("dev")) {
            webDriver.get("http://app.dev.mtnplay.com/");
            System.out.println("Opening - http://app.dev.mtnplay.com/");
        }else if (System.getProperty("env").equals("sit")) {
            webDriver.get("http://app.dev.mtnplay.com/");
            System.out.println("Opening - http://app.dev.mtnplay.com/");
        }

    }
}
