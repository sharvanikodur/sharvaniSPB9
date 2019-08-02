package com.training.sanity.tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.dataproviderPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import org.testng.annotations.DataProvider;

	public class sample{
		private WebDriver driver;
		private String baseUrl;
		private dataproviderPOM daproPOM;
		private static Properties properties;
		//private ScreenShot screenShot;
		
		
		    @DataProvider(name = "data-provider")
		    public Object[][] dataProviderMethod() {
		        return new Object[][] { {"sharvani.kodur@gmail.com","sharvani1"}, {"vani.planindia@gmail.com","sharvani1" }};
		    }

		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			daproPOM = new dataproviderPOM(driver); 
			baseUrl = properties.getProperty("baseURL");
			//screenShot = new ScreenShot(driver); 
			// open the browser 
			driver.get(baseUrl);
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		}
	    @Test(dataProvider="data-provider")
	    
	    public void testMethod(String emailid,String password) {
	    	daproPOM.clickmyaccount();
	    	
	        daproPOM.clickloginlink();
	        daproPOM.sendUserName(emailid);
	        daproPOM.sendPassword(password);
	    	daproPOM.clickLoginBtn();
	    	String result = daproPOM.alertmessagetext();
	    	
	    	
	    	
	        System.out.println("Data is: " + emailid);
	        System.out.println("Data is :"  +password);
	        System.out.println(result);
	    }
	}
 

	        


 
    


	

