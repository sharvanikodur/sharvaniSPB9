package com.training.sanity.tests;

	import static org.testng.Assert.assertEquals;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeClass;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;

		import com.training.generics.ScreenShot;
		import com.training.pom.LoginPOM;
	import com.training.pom.addtocartwithloginPOM;
import com.training.pom.adminPOM;
import com.training.pom.guestcheckoutPOM;
import com.training.utility.DriverFactory;
		import com.training.utility.DriverNames;

		public class testcase5 {

			private WebDriver driver;
			private String baseUrl1;
			private adminPOM adPOM;
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
				adPOM = new adminPOM(driver); 
				gtPOM = new guestcheckoutPOM(driver);
				baseUrl1 = properties.getProperty("baseURL1");
				screenShot = new ScreenShot(driver); 
				// open the browser 
				driver.get(baseUrl1);
			}
			
			@AfterMethod
			public void tearDown() throws Exception {
				Thread.sleep(1000);
				driver.quit();
			}
			@Test
			public void registerid() throws InterruptedException {
				adPOM.sendusername("admin");
				adPOM.sendpassword("admin@123");
				adPOM.loginclick();
				adPOM.catalogclick();
				adPOM.clickonproducts();
				adPOM.clickaddnew();
				adPOM.productnameenter("Blazer Girls(7-8)");
				adPOM.megatitleenter("Blazer for Girls");
				adPOM.datatabclick();
				adPOM.modeltextboxenter("BLG-112");
				adPOM.priceenter("3000");
				adPOM.enterquantity("100");
				adPOM.clicklinks();
				adPOM.sendcategory("Sports Uniform");
				adPOM.clickdiscount();
				adPOM.adddiscountclick();
				adPOM.enterquantity("5");
				adPOM.priceenter("200");
				adPOM.startdateclick();
				adPOM.enddateclick();
				adPOM.rewardspointsclick();
				adPOM.pointsenter("20");
				adPOM.save();
				
				
				
				
				
				
				

}
		}
