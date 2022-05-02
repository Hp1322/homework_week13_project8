package com.cart_x.mobile.testsuite;

import com.cart_x.mobile.pages.*;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Shipping shipping = new Shipping();
    NewArrivals newArrivals = new NewArrivals();
    ComingSoon comingSoon = new ComingSoon();
    ContactUs contactUs = new ContactUs();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        Assert.assertEquals(shipping.getShippingText(), "Shipping", "not navigate to page");

    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLink();
        Assert.assertEquals(newArrivals.getNewText(), "New arrivals", "not navigate to page");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        Assert.assertEquals(comingSoon.getComingText(), "Coming soon", "not navigate to page");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsLink();
        Assert.assertEquals(contactUs.getContactTextText(), "Contact us", "not navigate to page");
    }


}
