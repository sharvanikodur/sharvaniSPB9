package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.training.generics.ScreenShot;
	import com.training.pom.LoginPOM;
import com.training.pom.addtocartPOM;
import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class testcase2 {

		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private addtocartPOM addcartPOM;
		private static Properties properties;
		private ScreenShot screenShot;

		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			addcartPOM = new addtocartPOM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			// open the browser 
			driver.get(baseUrl);
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		}
		@Test
		public void registerid() throws InterruptedException {
			
			String name1 = addcartPOM.validatename();
			System.out.println(name1);
			addcartPOM.clickmaroontshirt();
			addcartPOM.sendsize(5);
			addcartPOM.clickaddtocart();
			
			
			
			
			
			
		}
	}
			
			


