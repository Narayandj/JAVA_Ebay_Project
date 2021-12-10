package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.Generic.PropertyReader;
import com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest {
	
		LoginPage login=new LoginPage();
			
			@Test
			public void verifyRegister() throws InterruptedException 
			{
				login.OpenWebsite();
				Thread.sleep(1000);
				
				PropertyReader.initProperty();
				
				login.enterFirstName(PropertyReader.getProperty("fn"));
				Thread.sleep(1000);
				
				login.enterLastName(PropertyReader.getProperty("ln"));
		      	Thread.sleep(1000);
				
				login.enterEmail(PropertyReader.getProperty("Email"));
				Thread.sleep(1000);
				
				login.enterPassword(PropertyReader.getProperty("password"));
				Thread.sleep(1000);
				
				login.checkbox();
				Thread.sleep(1000);
				
				login.clickRegister();
				Thread.sleep(1000);
				
				login.clickexist();
				Thread.sleep(1000);
				
				login.enterPass(PropertyReader.getProperty("password"));
				Thread.sleep(1000);
					
			    login.signin();
			    Thread.sleep(1000);
			 
			    login.clickELEC();
				Thread.sleep(1000);
				
				login.clickwatches();
				Thread.sleep(1000);
				
				login.clickmobiles();
				Thread.sleep(1000);
				
				login.clickmobile();
				Thread.sleep(1000);
				
				login.clickiphone();
				Thread.sleep(1000);
				
				login.enterTextInSearchField(PropertyReader.getProperty("srch"));
				Thread.sleep(1000);
				
				login.submitBtn();
				Thread.sleep(1000);
				
				login.clickNewL();
				Thread.sleep(40000);
		
				login.buyIt();
				Thread.sleep(1000);
				
				login.selectIndia();
				Thread.sleep(1000);
				
				login.addAddress(PropertyReader.getProperty("ads"));
				Thread.sleep(1000);
				
				login.addcity(PropertyReader.getProperty("cisty"));
				Thread.sleep(1000);
				
				login.selectGoa();
				Thread.sleep(1000);
				
				login.addPincode(PropertyReader.getProperty("pin"));
				Thread.sleep(1000);
				
				login.addMob(PropertyReader.getProperty("mobileno"));
				Thread.sleep(1000);
				
				login.clickGo();
			
			
        }

}
