package com.excelr.testcases;

import java.time.Duration;

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

public class DashBoardPage extends OrangeHRMbase {
	 Login lp;
	 DashBoard dp;
	 
	@BeforeMethod
	 public void browsersetup() {
		initialization();
		lp =  new Login();
		}
	@Test
	public void QuickLauchSection() {
		dp = lp.login();
		Assert.assertTrue(dp.QuickLauchSection());
   }
	@Test
	 public void myActionsection() {
		dp = lp.login();
		Assert.assertTrue(dp.myActionsection());
		
	}
	 @Test
	 public void timeatworksection() {
		 dp = lp.login();
		 Assert.assertTrue(dp.timeatworksection());
		
	}
	 @Test
	 public void employeesonleavesection() {
		 dp =lp.login();
		 Assert.assertTrue(dp.employeesonleavesection());
		 
		
	}
	
	
	
	@AfterMethod
	public void closesetup() {
		teardown();
	
	
	}
}
