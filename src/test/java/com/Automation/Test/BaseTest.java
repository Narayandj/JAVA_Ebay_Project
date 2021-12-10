package com.Automation.Test;

import org.testng.annotations.BeforeTest;

import com.Automation.Generic.DriverUtils;

public class BaseTest {
	

	@BeforeTest
	public void setup() {
		DriverUtils.createDriver();
	}


}
