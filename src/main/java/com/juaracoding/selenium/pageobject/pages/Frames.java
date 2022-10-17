package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {

    private WebDriver driver;

    public Frames() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "frame1")
    WebElement frameone;

    @FindBy(id = "sampleHeading")
    WebElement txtsampleHeading;

    public void sampleFrame(){
        driver.switchTo().frame(frameone);
        System.out.println(txtsampleHeading.getText());
    }

}
