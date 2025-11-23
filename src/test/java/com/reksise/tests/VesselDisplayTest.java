package com.reksise.tests;

import com.reksise.base.BaseTest;
import com.reksise.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VesselDisplayTest extends BaseTest {

    @Test
    public void verifyAllVesselsDisplayed() throws InterruptedException {
        driver.get("file:///C:/Users/lenovo/Desktop/rekise/dashboard.html");
        Thread.sleep(2000);

        DashboardPage dp = new DashboardPage(driver);

        int count = dp.getVesselCount();
        Thread.sleep(2000);

        Assert.assertEquals(count, 3, "All 3 vessels must be visible");
    }
}


