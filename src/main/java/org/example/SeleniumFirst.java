package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;


public class SeleniumFirst {
    protected static WebDriver driver;
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void main(String[] args) {

      //  Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        // open the Chrome browser
        driver = new ChromeDriver();
        //for wait in browser
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //for open demo nopcommerce web site
        driver.get("https://demo.nopcommerce.com/");
        //click on register button
        driver.findElement(By.className("ico-register")).click();
        //type first name
        driver.findElement(By.id("FirstName")).sendKeys("raj");
        //type last name
        driver.findElement(By.id("LastName")).sendKeys("patel");
        //email address
        driver.findElement(By.name("Email")).sendKeys("rp23+"+timestamp.getTime()+"@gmail.com");
        //type password
        driver.findElement(By.id("Password")).sendKeys("Test1234");
        //type conform password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Test1234");
        //click on register button
        driver.findElement(By.name("register-button")).click();
        //for close the browser

        //gettext from weblement
        String actualmassage = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println("my massage"+actualmassage);



        driver.close();






    }
}
