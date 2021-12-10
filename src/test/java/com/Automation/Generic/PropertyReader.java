package com.Automation.Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {


	static Properties prop = new Properties();
	
	public static void initProperty() {
		try {
			
			prop.load(new FileInputStream("C:\\Users\\Narayana D J\\eclipse-workspace\\EBAY_PROJECT\\src\\main\\resources\\config\\config.properties"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key)
	{
		return prop.getProperty(key);
		
	}

}
