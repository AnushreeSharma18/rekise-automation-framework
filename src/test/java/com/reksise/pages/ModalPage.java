package com.reksise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {

    WebDriver driver;

    private By modalTitle = By.id("modalTitle");
    private By missionName = By.id("missionName");
    private By returnBtn = By.id("returnBtn");

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVesselName() {
        return driver.findElement(modalTitle).getText();
    }

    public String getMissionName() {
        return driver.findElement(missionName).getText();
    }

    public void clickReturnToBase() {
        driver.findElement(returnBtn).click();
    }
}
