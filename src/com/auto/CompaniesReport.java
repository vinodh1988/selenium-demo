package com.auto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompaniesReport {
           public static void main(String n[]) throws Exception{
        	   
        	     String companies[]= {"Oracle","Microsoft","Amazon","TCS", "Infosys","Cognizant"};
        	     
        		 File f=new File("D:\\companies.html");
            	 
            	 FileWriter fw=new FileWriter(f);
            	 BufferedWriter bw=new BufferedWriter(fw);
            	 
            	 String initial="<html><body>";
        	    		
        	     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
                 WebDriver wd=new ChromeDriver();
                 wd.get("http://www.google.co.in");
                 
                 for(String x:companies) {
                 wd.findElement(By.name("q")).sendKeys(x+" wiki");
                 wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
                 wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a")).click();
                 List<WebElement> w= wd.findElements(By.cssSelector("#mw-content-text > div.mw-parser-output > table.infobox.vcard > tbody > tr"));
                 initial+= "<h3>"+x+" Details </h3>";
                 initial+="<hr>";
                 initial+= "<table border='1'>";
                 for(int i=2;i<w.size();i++) {
                	 initial+="<tr>";
            		 initial+=w.get(i).getAttribute("innerHTML");
            		 initial+="</tr>";
                 }
                 initial+="</table>";
                 initial+="<hr>";
                 wd.navigate().back();
                 wd.findElement(By.name("q")).clear();
                 }
                 
                 initial+="</body></html>";
                 bw.write(initial);
                 bw.close();
                 
           }
}
