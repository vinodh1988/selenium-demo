package com.auto;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class FileDownloadAutomation {
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
         
    	  wd.get("http://www.ignouhelp.in/ignou-ibo-01-study-material/");
    	  
    	  List<WebElement> l=wd.findElements(By.xpath("//*[@id=\"post-7531\"]/div/table/tbody/tr"));
    	  
      }
}
