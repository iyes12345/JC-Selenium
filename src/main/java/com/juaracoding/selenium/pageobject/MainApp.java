package com.juaracoding.selenium.pageobject;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.*;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        /*WebTables webTables = new WebTables();
        webTables.registrationForm("Text 1", "Text 2", "text@email.com", "20", "20000", "SQA");*/


        /*driver.get("https://demoqa.com/alerts");
        Alerts alerts = new Alerts();
        alerts.alertButton();
        alerts.timerAlertButton();
        alerts.confirmButton();
        alerts.promtButton();*/

        /*driver.get("https://demoqa.com/modal-dialogs");
        ModalDialogs modalDialogs = new ModalDialogs();
        modalDialogs.showSmallModal();*/

        /*driver.get("https://demoqa.com/frames");
        Frames frames = new Frames();
        frames.sampleFrame();*/

        Search_wishlist search = new Search_wishlist();
        search.searchform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
