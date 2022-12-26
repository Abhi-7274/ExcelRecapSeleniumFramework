package com.excelr.pages;

import org.openqa.selenium.By;

import com.excelr.base.OrangeHRMbase;

public class Login extends OrangeHRMbase {
	
	public String gettitle() {
		return driver.getTitle();
		
	}
	
	public DashBoard login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashBoard();
		
	}
	

}
