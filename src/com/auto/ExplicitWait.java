package com.auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
          
          wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-reactid=\"144\"] li")));
          wd.findElement(By.cssSelector("div[data-reactid=\"144\"] li")).click();
          
          wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".locationcard")));
          List<WebElement> wl=wd.findElements(By.cssSelector(".locationcard .chart-item"));
          
          System.out.println(wl.size());
          for(int i=0;i<=1;i++) {
        	  WebElement element = wl.get(i);
        	 wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".locationcard .chart-item:nth-child("+(i+1)+") path"), 10));
         	 List<WebElement> paths= element.findElements(By.xpath("//*[name()='svg']/*[name()='g']/*[@class='voronoi']/*[name()='path']"));
             
         	 for(WebElement path:paths) {
             	
          		
          		 Actions actions = new Actions(wd);
          		 actions.click(path).build().perform();
          		 
         	 }
          }
      }
}
