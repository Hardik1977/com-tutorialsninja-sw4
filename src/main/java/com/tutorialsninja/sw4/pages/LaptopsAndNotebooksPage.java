package com.tutorialsninja.sw4.pages;

import com.tutorialsninja.sw4.utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

    By laptopsAndNotebooks=By.cssSelector("#content h2");
    By selectSortBy=By.id("input-sort");
    By productMacBook=By.xpath("//a[text()='MacBook']");

    public String getTextFromLaptopsAndNotebooks(){
        return getTextFromElement(laptopsAndNotebooks);
    }
    public void clickOnSortByDropDown(){
        clickOnElement(selectSortBy);
    }
    public void selectPriceHighToLowFromDropdown(){
        selectByVisibleTextFromDropDown(selectSortBy,"Price (High > Low)");
    }
    public void selectProductMacBook(){
        clickOnElement(productMacBook);
    }
    public void verifyProductsArrangedByPriceHighToLow(){
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);
        Assert.assertEquals(originalProductsPrice, afterSortByPrice,"Product not sorted by price High to Low");
    }

}



