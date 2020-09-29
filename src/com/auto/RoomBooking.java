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
       
        // WebElement wb=wd.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
        //  System.out.println(wb.getAttribute("innerHTML"));
         
         WebElement wb2=wd.findElement(By.xpath("//span[@class=\"search_hl_name\"]"));
         
         if(wb2.getText().toLowerCase().equals("Chennai".toLowerCase())) {
      	   wb2.click();
      	   wd.findElement(By.xpath("//*[@data-date=\"2020-09-30\"]")).click();
    	   wd.findElement(By.xpath("//*[@data-date=\"2020-10-03\"]")).click();
         }
         else {
        	 System.out.println("Room cannot be booked");
         }
	}

}
