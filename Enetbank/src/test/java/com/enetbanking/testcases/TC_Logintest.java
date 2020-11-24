package com.enetbanking.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.enetbanking.pageobjects.Loginpage;

public class TC_Logintest extends Baseclass {
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		logger.info("enterusername");
		lp.setPassword(password);
		logger.info("enterpassword");
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login testpassed");

		} else {

			Assert.assertTrue(false);
			logger.info("login testfailed");

		}

	}
}
