package com.Automation.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

	
static WebDriver driver;

	public static void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narayana D J\\eclipse-workspace\\EBAY_PROJECT\\Driver\\chromedriver.exe");
		
		
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public static WebDriver  getDriver()
	{
	if(driver==null) {
		createDriver();
		}
		
	return driver;
	}
	
}
