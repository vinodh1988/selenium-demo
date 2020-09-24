package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomatedTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
         WebDriver wd=new ChromeDriver();
         wd.get("http://www.google.co.in");
       
         wd.findElement(By.partialLinkText("Images")).click();
         wd.findElement(By.name("q")).sendKeys("Selenium Download");
         wd.findElement(By.xpath("//*[@id=\"sbtc\"]/button")).click();
        // wd.findElement(By.className("tg7LZd")).click();
       
     /*    System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
         WebDriver wd1=new EdgeDriver();
         wd1.get("http://www.google.co.in");
         */
         
         
}
}