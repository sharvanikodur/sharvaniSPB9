
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
//import com.training.pom.LoginPOM;
import com.training.pom.LogintestPOM;

import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class myorderstestcase {

		private WebDriver driver;
		private String baseUrl;
		
		private LogintestPOM logPOM;
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
			logPOM = new LogintestPOM(driver);
			
			
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
		public void logintomyorderpage() throws InterruptedException {
			logPOM.clickmyaccount();
			logPOM.loginaccount();
			logPOM.sendUserName("sharvani.kodur@gmail.com");
			logPOM.sendpassword("sharvani123");
			logPOM.clicklogin();
			logPOM.clickmyorderspage();
			logPOM.primtmyordersmesage();
			String expected = logPOM.primtmyordersmesage();
			assertEquals("ORDER HISTORY",expected);
			System.out.println(expected);
			screenShot.captureScreenShot("fourth");
			
			
			
			
		}
	}
			
			




