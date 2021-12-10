package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {
	        
	         //Declaration
			@FindBy(id="firstname")
			private WebElement unTB;
			
			@FindBy(id="lastname")
			private WebElement LaTB;
			
			@FindBy(id="Email")
			private WebElement EmailTB;
			
			@FindBy(id="password")
			private WebElement pwTB;
			
			@FindBy(id="showpassword")
			private WebElement check;
			
			@FindBy(xpath = "//button[@id='EMAIL_REG_FORM_SUBMIT']")
			private WebElement RigisterBtn; 
			
			@FindBy(xpath="//button[@text='Sign in to existing account']")
			private WebElement existacc;
			
			@FindBy(id="pass")
			private WebElement passwd;
			
			@FindBy(id="sgnBt")
			private WebElement signin;
			
			//ELECTRONICS
			
			@FindBy(xpath="//li[@data-currenttabindex='0']")
		    private WebElement elect;
			
			@FindBy(xpath="//div[@class='b-visualnav__title']")
		    private WebElement watches;
			
			@FindBy(xpath="//div[@class='b-visualnav__title']")
		    private WebElement smartmobiles;
			
			@FindBy(xpath="//p[@class='b-guidancecard__title']")
		    private WebElement mobile;
			
			@FindBy(xpath="//p[.='Apple iPhone 12 Pro Max']")
		    private WebElement iphone;
			
			@FindBy(xpath="//p[.='512 GB']")
		    private WebElement iphoneRam;
			
			@FindBy(xpath="//h3[@class='s-item_title s-item_title--has-tags']")
		    private WebElement iphone512Mobile;
		
			@FindBy(xpath="//input[@class='gh-tb ui-autocomplete-input']")
			private WebElement searchtxtfld;
			
			@FindBy(xpath="//input[@id='gh-btn']")
			private WebElement submit;
			
			@FindBy(xpath="//img[@class='s-item__image-img']")
			private WebElement NewL;
			
//			@FindBy(xpath="//a[@_sp='p2047675.l1473']")
//			private WebElement buynow;
						
			@FindBy(xpath="//a[@_sp='p2047675.l1356']")
		    private WebElement Buynow;
			
			@FindBy(xpath="//input[@class='w514 wide fld']")
		    private WebElement Address;
			
			@FindBy(xpath="//input[@name='city']")
		    private WebElement city;
			
			@FindBy(xpath="//input[@name='zip']")
		    private WebElement pincode;
			
			@FindBy(xpath="//input[@name='phoneFlagComp1']")
		    private WebElement mob;
		
			@FindBy(xpath="//input[@class='btn btn-prim']")
		    private WebElement go;

			//Utilization
			public void OpenWebsite() throws InterruptedException
			{			
			driver.navigate().
			to("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
				
			}
					
			public void enterFirstName(String fn)
			{
			unTB.sendKeys(fn);
			}
			
			public void enterLastName(String ln)
			{
			LaTB.sendKeys(ln);
			}
			
			public void enterEmail(String email)
			{
			EmailTB.sendKeys(email);
			}
			
			public void enterPassword(String pw)
			{
			pwTB.sendKeys(pw);

			}
			
			public void checkbox()
			{
				check.click();
			}
			
			public void clickRegister()
			{
			RigisterBtn.click();
			}
			
			public void clickexist()
			{
			existacc.click();
			}

			public void enterPass(String pw)
			{
			passwd.sendKeys(pw);
			}
			public void signin()
			{
			signin.click();
			}
			
			//METHODS OF SEARCH ITEMS
		
			public void enterTextInSearchField(String pw)
			{
			searchtxtfld.sendKeys(pw);
			}
			public void submitBtn()
			{
			submit.click();
			}
			
			public void clickNewL()
			{
			NewL.click();
			}
		
//			public void buyNow()
//		    {
//			buynow.click();
//			}
	
			// ELECTRONICS METHODS
			
			public void clickELEC() {
				elect.click();
			}
			public void clickwatches() {
				watches.click();
			}
			public void clickmobiles() {
				smartmobiles.click();
			}
			public void clickmobile() {
		         mobile.click();
			}
			public void clickiphone() {
		        iphone.click();
			}
			
			public void buyIt() {
				Buynow.click();
						
			}
			public void selectIndia() {
				WebElement selectobj=driver.findElement(By.id("countryId"));
				Select sel=new  Select(selectobj);			
				sel.selectByValue("95");
				
			}
			public void addAddress(String add) {
				Address.sendKeys(add);
			}
			
			public void addcity(String cisty) {
				city.sendKeys(cisty);
			}
			
			public void selectGoa() {
				WebElement selectobj=driver.findElement(By.id("state"));
				Select sel=new  Select(selectobj);			
				sel.selectByValue("GA");			
				
			}
			
			public void addPincode(String pin) {
				pincode.sendKeys(pin);
			}
					
			public void addMob(String mb) {
				mob.sendKeys(mb);
			}
			public void clickGo() {
				go.click();
			}

}
