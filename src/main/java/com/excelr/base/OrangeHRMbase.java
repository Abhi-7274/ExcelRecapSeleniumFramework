package com.excelr.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.excelr.pages.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMbase {	
	public static WebDriver driver;
	public static Properties prop;
		
	
   public void initialization() {
	        loadconfig();
			String browser = prop.getProperty("browser");
			if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    }else if (browser.equalsIgnoreCase("firefox")) {
		     WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
		   }else if (browser.equalsIgnoreCase("ie")) {
			   WebDriverManager.iedriver().setup();
			   driver = new InternetExplorerDriver();
		   }
			
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("url"));
   }
	   
	

    public void loadconfig() {
	 prop = new Properties();
	 FileInputStream fis;
	 String propPath = "./src/main/java/com/excelr/config/config.properties";
	 try {
		 fis = new FileInputStream(propPath);
         try {
			prop.load(fis);
		} catch (IOException e) {
			System.out.println("property File not Found");
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("Unable to read property file");
			}
	
}  
 
  public void teardown() {
   driver.quit();
  } 
    
 }
