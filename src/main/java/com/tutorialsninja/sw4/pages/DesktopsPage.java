package com.tutorialsninja.sw4.pages;

import com.tutorialsninja.sw4.utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {
    By desktops=By.xpath("//h2");
    By sortByPosition=By.id("input-sort");
    By productHPLP3065=By.xpath("//a[text()='HP LP3065']");

    public String getTextFromDesktops(){
        return getTextFromElement(desktops);
    }
    public void clickOnSortByDropDown(){
        clickOnElement(sortByPosition);
    }
    public void selectNameZToAFromDropdown(){

        selectByVisibleTextFromDropDown(sortByPosition,"Name (Z - A)");
    }
    public void selectNameAToZFromDropdown(){
        selectByVisibleTextFromDropDown(sortByPosition,"Name (A - Z)");

    }
    public void selectHPLP3065(){
        clickOnElement(productHPLP3065);
    }


    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        //Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        Assert.assertEquals(originalProductsName,afterSortByZToAProductsName,"Error in sorting");
    }

}