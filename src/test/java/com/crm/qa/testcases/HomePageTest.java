package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase
{
	HomePage homePage;
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		LoginPage loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomePageTitle()
	{
		String homePageTitle=homePage.validateHomePageTitle();
		
		Assert.assertEquals("Cogmento CRM",homePageTitle,"Home Page Title not matched");
	}
	
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
