package com.reksise.tests;

import com.reksise.base.BaseTest;
import com.reksise.pages.DashboardPage;
import com.reksise.pages.ModalPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ReturnToBaseTest extends BaseTest {

    @Test
    public void verifyReturnToBaseAPI() throws InterruptedException {

        driver.get("file:///C:/Users/lenovo/Desktop/rekise/dashboard.html");
        Thread.sleep(2000);

        DashboardPage dp = new DashboardPage(driver);
        dp.clickDetailsOfFirstVessel();
        Thread.sleep(2000);

        ModalPage mp = new ModalPage(driver);
        mp.clickReturnToBase();
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String message = alert.getText();
        alert.accept();

        Assert.assertEquals(message, "Return-to-Base API Triggered!",
                "API simulation alert should match expected text");
    }
}

