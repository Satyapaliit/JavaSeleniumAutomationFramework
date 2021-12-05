package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	//Page Factory or OR-Object Repository
	
	@FindBy(xpath="//input[@name='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginButton;
	
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement clickLoginButton;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage login(String user,String pwd)
	{
		clickLoginButton.click();
		userName.sendKeys(user);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
