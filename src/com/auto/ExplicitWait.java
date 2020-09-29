package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
      public static void main(String n[]) {
    	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
          WebDriver wd=new ChromeDriver();
          wd.get("https://data.worldbank.org/");
          WebDriverWait wait = new WebDriverWait(wd,60);
         wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
      
         
          wd.findElement(By.cssSelector("#selector")).sendKeys("India");
      }
}
