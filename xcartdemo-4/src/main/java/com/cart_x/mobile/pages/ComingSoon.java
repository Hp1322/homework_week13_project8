package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoon extends Utility {
    By comingText = By.xpath("//h1[text()='Coming soon']");

    public String getComingText(){
        return getTextFromElement(comingText);
    }
}
