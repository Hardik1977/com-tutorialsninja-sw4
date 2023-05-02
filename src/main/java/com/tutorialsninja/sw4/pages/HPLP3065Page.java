package com.tutorialsninja.sw4.pages;

import com.tutorialsninja.sw4.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HPLP3065Page extends Utility {

    By textHPLP3065 = By.cssSelector("#content h1");
    By quantity = By.cssSelector("#input-quantity");
    By addToCartButton = By.cssSelector("#button-cart");
    By textMessageSuccess = By.cssSelector(".alert.alert-success.alert-dismissible");
    By linkShoppingCart = By.cssSelector(".alert.alert-success.alert-dismissible a:nth-of-type(2)");

    public String getTextHPLP3065() {
        return getTextFromElement(textHPLP3065);
    }

    public void enterQuantity() {
        sendTextToElement(quantity, "");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getTextMessageSuccess() {
        return getTextFromElement(textMessageSuccess);
    }

    public void clickOnLinkShoppingCart() {
        clickOnElement(linkShoppingCart);
    }

    public void selectDeliveryDate() {
        String year = "2022";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

}
