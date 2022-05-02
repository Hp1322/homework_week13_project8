package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivals extends Utility {
    By newText = By.xpath("//h1[text()='New arrivals']");

    public String getNewText(){
        return getTextFromElement(newText);
    }
}
