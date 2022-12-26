package com.excelr.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.base.OrangeHRMbase;
import com.excelr.pages.DashBoard;
import com.excelr.pages.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends OrangeHRMbase {
         //	validate title
        // validate login
	
	
	 Login lp;
	 DashBoard dp;
	@BeforeMethod
	 public void browsersetup() {
		initialization();
	    lp =  new Login();
		}
	
	@Test
	public void validateTilte() {
		
		String exptitle ="OrangeHRM";
		String acttitle = lp.gettitle();
		Assert.assertEquals(exptitle, acttitle);
		
		
	}
	@Test
	public void validateLogin() {
		dp = lp.login();
		Assert.assertTrue(dp.dashboardleftmenu());
		
//		boolean dbchcek = driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
//		Assert.assertTrue(dbchcek);
//		driver.findElement(By.xpath("//p[text()='Forgot your password?']")).click();
//		
		
	}
	@AfterMethod
	public void closesetup() {
	teardown();
		
	}
}
