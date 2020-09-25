package com.auto;

import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

public class TextbookDownload {
        public static void main(String n[]) {
       	  String downloadFilepath = "d:\\studymaterials";
    	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    	  Map<String, Object> preferences = new Hashtable<String, Object>();
    	  preferences.put("profile.default_content_settings.popups", 0);
    	  preferences.put("download.prompt_for_download", "false");
    	  preferences.put("download.default_directory", downloadFilepath);

    	  
    	  preferences.put("plugins.plugins_disabled", new String[]{
    	      "Adobe Flash Player", "Chrome PDF Viewer"});

    	  ChromeOptions options = new ChromeOptions();
    	  options.setExperimentalOption("prefs", preferences);
    	  

    	
    	  options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    	
    	  WebDriver wd = new ChromeDriver(options);
    	  wd.get("https://ncert.nic.in/textbook.php");
    	  Select select = new Select( wd.findElement(By.name("tclass")));
    	  select.selectByIndex(10);
    	  Select select1 = new Select( wd.findElement(By.name("tsubject")));
    	  select1.selectByIndex(5);
    	  Select select2 = new Select( wd.findElement(By.name("tbook")));
    	  select2.selectByIndex(1);
    	  
    	  wd.findElement(By.name("button")).click();
    	  WebElement element =  wd.findElement(By.linkText("Download complete book"));
    	  //element.click();
    	  JavascriptExecutor js = (JavascriptExecutor) wd; 
     	 js.executeScript("arguments[0].click();",element);
     	 
        }
}
