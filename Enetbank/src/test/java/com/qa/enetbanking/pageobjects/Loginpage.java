package com.qa.enetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@name='uid']")
	WebElement txtUsername;
	@FindBy(name="password")
	WebElement txtpassword;
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnlogin;
	
	public void setUserName(String uname){
		txtUsername.sendKeys(uname);			
	}
	public void setPassword(String pwd){
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit(){
		btnlogin.click();
		
	}
	

}
