package com.tutorialsninja.sw4.testsuite;
import com.tutorialsninja.sw4.pages.ComponentsPage;
import com.tutorialsninja.sw4.pages.DesktopsPage;
import com.tutorialsninja.sw4.pages.HomePage;
import com.tutorialsninja.sw4.testbase.BaseTest;
import com.tutorialsninja.sw4.pages.LaptopsAndNotebooksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage=new ComponentsPage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.hoverOnDesktopsTabAndClick();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.callSelectMenuMethodAndClick("Show AllDesktops");
        //1.3 Verify the text ‘Desktops
        Assert.assertEquals(desktopsPage.getTextFromDesktops(), "Desktops", "Error");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.hoverOnlaptopsAndNotebooksAndClick();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.callSelectMenuMethodAndClick("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(laptopsAndNotebooksPage.getTextFromLaptopsAndNotebooks(),"Laptops & Notebooks","Error");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
        homePage.hoverOnComponentsAndClick();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.callSelectMenuMethodAndClick("Show AllComponents");
        //3.3 Verify the text ‘Components’
        Assert.assertEquals(componentsPage.getTextComponents(),"Components","Error");
    }


}
