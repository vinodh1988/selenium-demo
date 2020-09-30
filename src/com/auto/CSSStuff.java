package com.auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSSStuff {
    public static void main(String n[]) {
    	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
         WebDriver wd=new ChromeDriver();
         wd.get("https://www.indusind.com/in/en/personal/accounts/saving-account/indus-select.html");
       //  wd.findElement(By.cssSelector("a[data-layer-text=\"eligibility criteria\"]")).click();
         List<WebElement> list=wd.findElements(By.cssSelector(".eligibility-slider .swiper-slide"));
         System.out.println(list.size());
         Actions action = new Actions(wd);

         JavascriptExecutor js = (JavascriptExecutor) wd;
         js.executeScript("arguments[0].scrollIntoView(false);", wd.findElement(By.className("eligibility-slider")));
       
         action.moveToElement(list.get(2)).build().perform();
         System.out.println(list.get(2).getCssValue("backgroundColor"));
    }
}
