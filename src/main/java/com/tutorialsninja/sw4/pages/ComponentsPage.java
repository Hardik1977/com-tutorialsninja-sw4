package com.tutorialsninja.sw4.pages;

import com.tutorialsninja.sw4.utility.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {

        By components = By.cssSelector("#content h2");

        public String getTextComponents() {
            return getTextFromElement(components);
        }
    }

