package com.cart_x.mobile.testbase;

import com.cart_x.mobile.propertyreader.PropertyReader;
import com.cart_x.mobile.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterClass
    public void tearDown(){
      //  closeBrowser();
    }
}
