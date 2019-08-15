package com.training.sanity.tests;

	import static org.testng.Assert.assertEquals;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeClass;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;

		import com.training.generics.ScreenShot;
		import com.training.pom.LoginPOM;
	import com.training.pom.addtocartwithloginPOM;
import com.training.pom.guestcheckoutPOM;
import com.training.utility.DriverFactory;
		import com.training.utility.DriverNames;

		public class testcase4 {

			private WebDriver driver;
			private String baseUrl;
			private LoginPOM loginPOM;
			private guestcheckoutPOM gtPOM;
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
				gtPOM = new guestcheckoutPOM(driver);
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
				
				gtPOM.clicktshirtonpage();
				gtPOM.clicksize(5);
				gtPOM.addtocartbutton();
				gtPOM.cartclick();
				gtPOM.viewmycart();
				Thread.sleep(2000);
				WebElement checkoutbutton = driver.findElement(By.linkText("Checkout"));
				JavascriptExecutor execute = (JavascriptExecutor)driver;
				execute.executeScript("arguments[0].scrollIntoView();",checkoutbutton );	
				execute.executeScript("window.scrollBy(0,200)");
				gtPOM.checkoutclick();
				gtPOM.guestaccountclick();
				gtPOM.guestcontinue();
				gtPOM.firstnm("sharvani");
				gtPOM.lastnm("k");
				gtPOM.email("vanivani@gmail.com");
				gtPOM.telephondetails("8553649132");
				gtPOM.sendaddress1("sree paduka second floor");
				gtPOM.sendaddress2("konankunte");
				gtPOM.sendcity("bangalore");
				gtPOM.sendpostcode("560062");
				gtPOM.sendcountry("India");
				gtPOM.sendregion("Karnataka");
				gtPOM.clickcontinuebutton();
				gtPOM.entercomment("Please deliver asap");
				gtPOM.clickcontinueaftercomment();
				gtPOM.agreebutton();
				gtPOM.continueafteragreeclick();
				gtPOM.clickconfirm();
			}
}
