
 
	package com.training.sanity.tests;

	import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.training.generics.ScreenShot;
	import com.training.pom.LoginPOM;
import com.training.pom.LogintestPOM;
import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class forgotpasswordtest {

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
		public void forgotpassword() {
			logPOM.clickmyaccount();
			logPOM.loginaccount();
			logPOM.sendUserName("sharvani.kodur@gmail.com");
			logPOM.sendpassword("sharvani1234");
			logPOM.clicklogin();
			logPOM.warningmessageprint();
			String expected1 =logPOM.warningmessageprint();
			System.out.println(expected1);
			logPOM.clickfrgtpassword();
			logPOM.sendUserNamenexttime("sharvani.kodur@gmail.com");
			logPOM.clickcontinuebutton();
			String expected2 =logPOM.readmessagesecond();
			assertEquals("An email with a confirmation link has been sent your email address.",expected2);
			System.out.println(expected2);
			screenShot.captureScreenShot("testcase3");
		}
	}



