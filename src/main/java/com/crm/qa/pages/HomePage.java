package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase 
{
	
	
	@FindBy(xpath="//span[contains(text(),'Satyapal Kumar')]")
	WebElement user;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement deals;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasks;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	
	public ContactsPage clickOnContactsLink()
	{
		contacts.click();
		
		return new ContactsPage();
	}
	

	public DealsPage clickOnDealsLink()
	{
		deals.click();
		
		return new DealsPage();
	}
	

	public TasksPage clickOnTasksLink()
	{
		contacts.click();
		
		return new TasksPage();
	}
	
	
	
	
	
	
	
	
}
