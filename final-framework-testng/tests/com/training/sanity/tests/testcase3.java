

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
	import com.training.utility.DriverFactory;
		import com.training.utility.DriverNames;

		public class testcase3 {

			private WebDriver driver;
			private String baseUrl;
			private LoginPOM loginPOM;
			private addtocartwithloginPOM addcartwithloginPOM;
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
				addcartwithloginPOM = new addtocartwithloginPOM(driver);
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
				addcartwithloginPOM.clickmyaccount();
				addcartwithloginPOM.loginaccount();
				addcartwithloginPOM.sendUserName("vani.planindia@gmail.com");
				addcartwithloginPOM.sendpassword("sharvani123");
				addcartwithloginPOM.clicklogin();
				addcartwithloginPOM.clickuniformstorelink();
				
				//This will scroll the page till the element is found		
				//javas.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				JavascriptExecutor javas = (JavascriptExecutor)driver;
				javas.executeScript("window.scrollBy(0,500)");
				
				addcartwithloginPOM.clickmaroontshirt();
				//addcartwithloginPOM.validatename();
				addcartwithloginPOM.sendsize(5);
				addcartwithloginPOM.clickaddtocart();
				addcartwithloginPOM.getsuccessmesage();
				addcartwithloginPOM.clickonmycart();
				Thread.sleep(2000);
				addcartwithloginPOM.viewmycart();
				javas.executeScript("window.scrollBy(0,100)");
		
		  addcartwithloginPOM.imageofshirtdetails();
		  addcartwithloginPOM.shirtdetails(); addcartwithloginPOM.chestshirtdetails();
		  addcartwithloginPOM.modelshirtdetails();
		  addcartwithloginPOM.quantityshirtdetails();
		  addcartwithloginPOM.unitpriceshirtdetails();
		  addcartwithloginPOM.finalcartpricedetails();
		 
				
				addcartwithloginPOM.clickcheckout();
				
				String addressbillingprint =addcartwithloginPOM.addressbilling();
				System.out.println(addressbillingprint);
				
				addcartwithloginPOM.clickcontinuebuttonbilling();
				javas.executeScript("window.scrollBy(0,200)");
				
				String shippingdetailsprint =addcartwithloginPOM.shippingdetailsbilling();
				System.out.println(shippingdetailsprint);
				
				
				addcartwithloginPOM.clickcontinuebuttonshipping();
				
				addcartwithloginPOM.commentboxenter("Please deliver between 7pm and 10pm");
				
				addcartwithloginPOM.clickcommentboxcontinue();
				
				
				addcartwithloginPOM.clicktermsconditions();
				
				
				addcartwithloginPOM.clickcontinuebuttonpaymentbutton();
				//javas.executeScript("window.scrollBy(0,50)");
				Thread.sleep(1000);
				
				addcartwithloginPOM.clickconfirmorderbutton();
				
				String successmessageprint = addcartwithloginPOM.checksuccessmessageafterorderplace();
				//assertEquals("YOUR O", successmessageprint);
				
				
				
				
				
			}}
				
				
				
				