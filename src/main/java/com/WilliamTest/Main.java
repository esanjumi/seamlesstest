package com.WilliamTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/mac/Downloads/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[21]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div/input")).sendKeys("tomsmith");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div/input")).sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();
        Thread.sleep(2000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        boolean isDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div/div")).isDisplayed();

        if (isDisplayed) {
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }
        // driver.switchTo().window(tab);
        Thread.sleep(2000);
        driver.getWindowHandles();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[21]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div/input")).sendKeys("thomas");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div/input")).sendKeys("SecretPassword!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();
        Thread.sleep(2000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        isDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div/div")).isDisplayed();

        if (isDisplayed) {
            System.out.println("Pass");
        }else System.out.println("fail");
    }
}
