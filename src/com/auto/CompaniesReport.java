package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompaniesReport {
           public static void main(String n[]) {
        	   
        	     String companies[]= {"Oracle","Microsoft","Amazon","TCS", "Infosys","Cognizant"};
        	    		
        	     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
                 WebDriver wd=new ChromeDriver();
                 wd.get("http://www.google.co.in");
                 
                 for(String x:companies) {
                 wd.findElement(By.name("q")).sendKeys(x+" wiki");
                 wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
                 wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a")).click();
                 wd.navigate().back();
                 wd.findElement(By.name("q")).clear();
                 }
                 
           }
}
