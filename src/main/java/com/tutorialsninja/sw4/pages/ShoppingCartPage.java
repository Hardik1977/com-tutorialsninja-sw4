package com.tutorialsninja.sw4.pages;

import com.tutorialsninja.sw4.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {

    By textShoppingCart = By.cssSelector("#content>h1");
    By textProductName = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
    By textDeliveryDate=By.xpath("//small[text()='Delivery Date:2022-11-30']");
    By textModel=By.xpath("//td[text()='Product 21']");
    By textTotal=By.cssSelector("#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");
    By textMacBook=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
    By quantity=By.cssSelector("div.input-group.btn-block>input");
    By updateTab=By.cssSelector(".fa.fa-refresh");
    By textMessage=By.cssSelector(".alert.alert-success.alert-dismissible");
    By textTotal1=By.cssSelector("#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");
    By checkOutbtn=By.cssSelector("a.btn.btn-primary");
    By textCheckout=By.xpath("//h1[text()='Checkout']");
    By textNewCustomer=By.xpath("//h2[text()='New Customer']");
    By guestCheckOutRadio=By.cssSelector("input[value='guest']");
    By continueButton=By.cssSelector("#button-account");
    By firstName=By.cssSelector("#input-payment-firstname");
    By lastName=By.cssSelector("#input-payment-lastname");
    By email=By.cssSelector("#input-payment-email");
    By telephone=By.cssSelector("#input-payment-telephone");
    By address=By.cssSelector("#input-payment-address-1");
    By city=By.cssSelector("#input-payment-city");
    By postcode=By.cssSelector("#input-payment-postcode");
    By zone=By.cssSelector("#input-payment-zone");
    By continueButton1=By.cssSelector("#button-guest");
    By addCommentsAboutOrder=By.cssSelector("textarea[name='comment']");
    By tncCheckbox=By.cssSelector("input[type='checkbox']");
    By continueButton2=By.cssSelector("#button-payment-method");
    By textWarning=By.cssSelector(".alert.alert-danger.alert-dismissible");

    public String getTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String getTextProductName() {
        return getTextFromElement(textProductName);
    }

    public String getTextDeliveryDate() {
        return getTextFromElement(textDeliveryDate);
    }
    public String getTextModel(){
        return getTextFromElement(textModel);
    }
    public String getTextTotal(){
        return getTextFromElement(textTotal);
    }
    public String getTextMacBook(){
        return getTextFromElement(textMacBook);
    }
    public void changeQuantity(){
        sendTextToElement(quantity, Keys.BACK_SPACE+"2");
    }
    public void clickOnUpdateTab(){
        clickOnElement(updateTab);
    }
    public String getTextMessage(){
        return getTextFromElement(textMessage);
    }
    public String getTextTotal1(){
        return getTextFromElement(textTotal1);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutbtn);
    }
    public String getTextCheckOut(){
        return getTextFromElement(textCheckout);
    }
    public String getTextNewCustomer(){
        return getTextFromElement(textNewCustomer);
    }
    public void clickOnGuestCheckOutRadio(){
        clickOnElement(guestCheckOutRadio);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void fillInMandatoryFields(){
        sendTextToElement(firstName, "Ramesh");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "rameshpatel@gmail.com");
        sendTextToElement(telephone, "76895433452");
        sendTextToElement(address, "Kings Street");
        sendTextToElement(city, "London");
        sendTextToElement(postcode, "WC11BC");
        selectByVisibleTextFromDropdown(zone,"Berkshire");
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void addCommentsAboutOrder(){
        sendTextToElement(addCommentsAboutOrder,"Thank You for Your Order");
    }
    public void clickOnTermsAndConditionCheckbox(){
        clickOnElement(tncCheckbox);
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }
    public String getTextWarningMessage(){
        return getTextFromElement(textWarning);
    }



}
