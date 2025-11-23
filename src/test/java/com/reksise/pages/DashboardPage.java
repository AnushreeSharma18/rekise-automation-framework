package com.reksise.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    WebDriver driver;

    private By vesselCards = By.cssSelector(".vessel-card");
    private By detailsButtons = By.cssSelector(".details-btn");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getVesselCount() {
        return driver.findElements(vesselCards).size();
    }

    public void clickDetailsOfFirstVessel() {
        List<WebElement> list = driver.findElements(detailsButtons);
        list.get(0).click();
    }

    public void clickDetailsOfVessel(int index) {
        driver.findElements(detailsButtons).get(index).click();
    }
}
