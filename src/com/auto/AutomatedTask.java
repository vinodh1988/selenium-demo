package com.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomatedTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
         WebDriver wd=new ChromeDriver();
         wd.get("http://www.google.co.in");
         
         System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
         WebDriver wd1=new EdgeDriver();
         wd1.get("http://www.google.co.in");
         
}
}