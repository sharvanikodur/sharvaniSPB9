package com.training.sanity.tests;

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

	public class mediumleveltcusingdataproviders {
		private WebDriver driver;
		private String baseUrl;
		private dataproviderPOM daproPOM;
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
			dataproviderPOM daproPOM = new dataproviderPOM(driver); 
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
	    @Test(dataProvider="SearchProvider")
	    public Object[][] testMethod(String username,String password) throws InterruptedException{
	    {
	        daproPOM.clickmyaccount();
	        daproPOM.clickLoginBtn();
	        daproPOM.sendUserName(username);
	        daproPOM.sendPassword(password);
	        System.out.println("Welcome ->"+username+" Your search key is->"+password);
	        Thread.sleep(3000);
	        /*String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	    }*/
	    }
	    /**
	     * @return Object[][] where first column contains 'author'
	     * and second column contains 'searchKey'
	     */
	    
	    class DataProviderClass{

	    @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "sharvani.kodur@gmail.com", "Vaishnave1@" }, { "vani.planindia@gmail.com", "sharvani12" },
	            
	        };

	    }
	    }
		return null;
	    }
	}

	


