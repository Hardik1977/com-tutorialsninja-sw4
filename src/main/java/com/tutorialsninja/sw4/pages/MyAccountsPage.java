package com.tutorialsninja.sw4.pages;

import com.tutorialsninja.sw4.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {


    By myAccountLink = By.xpath("//span[text()='My Account']");
    By myAccountOption = By.cssSelector("#top-links a");
    By textRegister = By.cssSelector("#content h1");
    By textReturningCustomer = By.cssSelector("#content > div > div:nth-child(2) > div > h2");
    By firstName = By.cssSelector("#input-firstname");
    By lastName = By.cssSelector("#input-lastname");
    By email = By.cssSelector("#input-email");
    By telephone = By.cssSelector("#input-telephone");
    By password = By.cssSelector("#input-password");
    By confirmPassword = By.cssSelector("#input-confirm");
    By radioYes = By.cssSelector("input[type='radio'][name='newsletter'][value='1']");
    By checkPrivacy = By.cssSelector("input[type='checkbox']");
    By continueButton = By.cssSelector("input[value='Continue']");
    By textAccountCreated = By.xpath("//h1[text()='Your Account Has Been Created!']");
    By continueButton1 = By.cssSelector("a[class='btn btn-primary']");
    By textAccountLogOut = By.xpath("//h1[text()='Account Logout']");
    By continueButton2 = By.cssSelector(".btn.btn-primary");
    By loginButton = By.cssSelector("input[value='Login']");
    By textMyAccount = By.xpath("//h2[text()='My Account']");

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void callSelectMyAccountOptionMethod() {
        selectMyAccountOptions("Register");
    }

    public void callSelectMyAccountLogoutMethod() {
        selectMyAccountOptions("Logout");
    }

    public String getTextRegister() {
        return getTextFromElement(textRegister);
    }

    public void callSelectMyAccountLoginMethod() {
        selectMyAccountOptions("Login");
    }

    public String getTextReturningCustomer() {
        return getTextFromElement(textReturningCustomer);
    }

    public void fillInInformation() {
        sendTextToElement(firstName, "Vina");
        sendTextToElement(lastName, "Shah");
        sendTextToElement(email, "vinashah12345@gmail.com");
        sendTextToElement(telephone, "78945636547");
        sendTextToElement(password, "12as5464");
        sendTextToElement(confirmPassword, "12as5464");
        clickOnElement(radioYes);
        clickOnElement(checkPrivacy);
        clickOnElement(continueButton);
    }

    public void fillInEmailPassword() {
        sendTextToElement(email, "vinashah12345@gmail.com");
        sendTextToElement(password, "12as5464");
        clickOnElement(loginButton);
    }

    public String getTextAccountCreated() {
        return getTextFromElement(textAccountCreated);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton1);
    }

    public String getTextAccountLogOut() {
        return getTextFromElement(textAccountLogOut);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    public String getTextMyAccount() {
        return getTextFromElement(textMyAccount);
    }


}
