package com.reksise.tests;

import com.reksise.base.BaseTest;
import com.reksise.pages.DashboardPage;
import com.reksise.pages.ModalPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VesselDetailsTest extends BaseTest {

    @Test
    public void verifyVesselDetailsModal() throws InterruptedException {

        driver.get("file:///C:/Users/lenovo/Desktop/rekise/dashboard.html");
        Thread.sleep(2000);

        DashboardPage dp = new DashboardPage(driver);
        dp.clickDetailsOfFirstVessel();
        Thread.sleep(2000);

        ModalPage mp = new ModalPage(driver);

        Assert.assertEquals(mp.getVesselName(), "Vessel A");
        Assert.assertEquals(mp.getMissionName(), "Mission Alpha");
    }
}
