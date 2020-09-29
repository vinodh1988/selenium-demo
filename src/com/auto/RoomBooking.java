package com.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoomBooking {
	
	public static void main(String n[]) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
         WebDriver wd=new ChromeDriver();
         wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         wd.get("http://www.booking.com");
         wd.findElement(By.id("ss")).sendKeys("Chennai");
         //Thread.sleep(5000);
       
         WebElement wb=wd.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
         System.out.println(wb.getAttribute("innerHTML"));
	}

}
