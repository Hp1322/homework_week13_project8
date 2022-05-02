package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutSuccess extends Utility {
    By thankYouText = By.xpath("//h1[text()='Thank you for your order']");

    public String getThankYouText(){
        return getTextFromElement(thankYouText);
    }

}
