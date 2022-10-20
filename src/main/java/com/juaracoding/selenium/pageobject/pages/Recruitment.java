package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitment {
    private WebDriver driver;

    public Recruitment() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement menuRecruitment;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtRecruitment;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    WebElement selectHiringManager;

    @FindBy(xpath = "//div[contains(text(),'Linda Jane Anderson')]")
    WebElement txtLinda;

    public void menuRecruitment(){
        menuRecruitment.click();
    }

    public String getTxtRecruitment(){
        return txtRecruitment.getText();
    }

    public void searchByHiringManager(){
        selectHiringManager.sendKeys("L");
        btnSearch.click();
    }

    public String getTxtLinda(){
        return txtLinda.getText();
    }

}
