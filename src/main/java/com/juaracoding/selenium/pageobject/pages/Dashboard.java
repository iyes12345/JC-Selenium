package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    private WebDriver driver;

    public Dashboard() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement menuDashboard;

    @FindBy(xpath = "//h4[@class='oxd-text oxd-text--h4 orangehrm-module-under-development-heading']")
    WebElement txtDashboard;

    public void menuDashboard(){
        menuDashboard.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

}
