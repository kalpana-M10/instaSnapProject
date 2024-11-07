package com.Ecommerce.instaSnap.genericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeClass
	public void BrowserSetup()
	{
		Reporter.log("Browser Launched Successfully",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login Successfull",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout Successful", true);
	}
	@AfterClass
	public void TerminateBrowser() {
		Reporter.log("Browser closed Successfully",true);
		
	}
	
	}
