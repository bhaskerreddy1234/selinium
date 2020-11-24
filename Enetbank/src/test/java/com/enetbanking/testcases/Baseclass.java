package com.enetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.enetbank.utilities.Readconfig;

public class Baseclass {
	Readconfig rc = new Readconfig();
	public String baseUrl=	rc.getApplicationUrl();
	public String username= rc.getUsername();
	public String  password= rc.getpassword();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + rc.getChromepath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger= Logger.getLogger("Enetbank");
		
		PropertyConfigurator.configure("log4j.properties");
		
	}

	@AfterClass
	public void tearDown() {
		//driver.quit();

	}

}
