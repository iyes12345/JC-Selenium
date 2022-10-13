package com.juaracoding.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");

        //WebDriverManager.chromedriver().setup();

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://demoqa.com/text-box";

        driver.get(url);

        String tittlename = driver.getTitle();
        System.out.println(tittlename);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement userName = driver.findElement(By.xpath("//*[@id='userName']"));
                userName.sendKeys("JuaraCoding"); //sendkeys("juaracoding")
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");

        // scroll vertical 1000 pixel
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.id("submit")).click();


        // delay
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}