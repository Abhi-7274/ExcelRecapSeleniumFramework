package com.excelr.pages;

import org.openqa.selenium.By;

import com.excelr.base.OrangeHRMbase;

public class DashBoard extends OrangeHRMbase{
	 public boolean dashboardleftmenu() {
		 return driver.findElement(By.xpath("spam[text()='Dashboard']")).isDisplayed();
		
	}
	 public boolean QuickLauchSection() {
		 return driver.findElement(By.xpath("//p[text()='Quick Launch']")).isDisplayed();	
		 
	}
	 public boolean myActionsection() {
		 return driver.findElement(By.xpath("//p[text()='My Actions']")).isDisplayed();
		
	}
	 public boolean timeatworksection() {
		 return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	 }
	
	 public boolean employeesonleavesection() {
		  return driver.findElement(By.xpath("//p[text()='Employees on Leave Today']")).isDisplayed();
		 
		
	}

}
