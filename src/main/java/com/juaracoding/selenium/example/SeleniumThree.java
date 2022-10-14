package com.juaracoding.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumThree {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        // Find elements using tag name
        List<WebElement> allInputElements = driver.findElements(By.tagName("input"));

        if(allInputElements.size() != 0)
        {
            System.out.println(allInputElements.size() + " Elements found by TagName as input \n");

            for(WebElement inputElement : allInputElements)
            {
                System.out.println(inputElement.getAttribute("placeholder"));
            }
        }

        // Find elements using tag name
        List<WebElement> allTextAreaElements = driver.findElements(By.tagName("textarea"));

        if(allTextAreaElements.size() != 0)
        {
            System.out.println(allTextAreaElements.size() + " Elements found by TextArea as input \n");

            for(WebElement textAreaElement : allTextAreaElements)
            {
                System.out.println(textAreaElement.getAttribute("id"));
            }
        }

        List<WebElement> allMenuElements = driver.findElements(By.xpath("//*[contains(@id,'item')]"));
        for (WebElement menuElement : allMenuElements){
            System.out.println(menuElement.getText());
        }

        //clik menu radio button
        allMenuElements.get(2).click();
        System.out.println("menu radio button clicked");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
