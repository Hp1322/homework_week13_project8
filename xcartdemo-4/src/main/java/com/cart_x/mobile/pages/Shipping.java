package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Shipping extends Utility {
    By shippingText = By.xpath("//h1[text()='Shipping']");

    public String getShippingText(){
        return getTextFromElement(shippingText);
    }

}
