package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompaniesReport {
           public static void main(String n[]) {
        	   
        	     String companies[]= {"Oracle","Microsoft","Amazon","TCS", "Infosys","Cognizant","Accenture"};
        	    		
        	     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
                 WebDriver wd=new ChromeDriver();
                 wd.get("http://www.google.co.in");
                 
                 wd.findElement(By.name("q")).sendKeys(companies[0]+" wiki");
                 wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
        	    
           }
}
