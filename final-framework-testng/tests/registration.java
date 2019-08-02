

	

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
import com.training.pom.RegistrationPOM;
import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class registration {

		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private RegistrationPOM regPOM;
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
			regPOM = new RegistrationPOM(driver);
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
			loginPOM.clickmyaccount();
			Thread.sleep(5000);
			loginPOM.registeraccount();
			Thread.sleep(3000);
			regPOM.sendUserName("shar");
			regPOM.sendlastname("ko");
			regPOM.sendemail("sharvani.kodur1122@gmail.com");
			regPOM.sendtelephone("9886138473");
			regPOM.sendaddress1("jayanagar");
			regPOM.sendaddress2("bangalore");
			regPOM.sendcity("bangalore");
			regPOM.sendpostcode("560062");
			regPOM.sendcountry("India");
			regPOM.sendregion("Karnataka");
			regPOM.sendpassword("sharvani123");
			regPOM.sendconfirmpassword("sharvani123");
			regPOM.agreebutton();
			regPOM.clickcontinue();
			String expected = regPOM.checkcontentmessage();
			assertEquals("YOUR ACCOUNT HAS BEEN CREATED!",expected);
			System.out.println(expected);
			
			
			
			
			
			
		}
	}
			
			