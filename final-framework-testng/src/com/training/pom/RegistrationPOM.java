package com.training.pom;



	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class RegistrationPOM {

		private WebDriver driver; 
		
		public RegistrationPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstname;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastname;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement email;
		
		@FindBy(xpath ="//input[@name='telephone']")
		private WebElement telephone;
		
		@FindBy(xpath ="//input[@name='address_1']")
		private WebElement address1;
		
		@FindBy(xpath ="//input[@name='address_2']")
		private WebElement address2;
		
		@FindBy(xpath ="//input[@name='city']")
		private WebElement city;
		
		@FindBy(xpath ="//input[@name='postcode']")
		private WebElement postcode;
		
		@FindBy(id="input-country")
		private WebElement countryname;
		
		@FindBy(className = "zone_id")
		private WebElement region;
		
		@FindBy(xpath ="//input[@name='password']")
		private WebElement password;
		
		@FindBy(xpath ="//input[@name='confirm']")
		private WebElement confirmpassword;
		
		@FindBy(xpath ="//input[@name='agree']")
		private WebElement agree;
		
		@FindBy(xpath="//input[@value='Continue']")
		private WebElement continuebutton;
		
		@FindBy(xpath="//*[@id='content']//h1")
		private WebElement contentmessage;
		
		
		public void sendUserName(String firstname) {
			this.firstname.clear();
			this.firstname.sendKeys(firstname);
			
		}
		
		
		public void sendlastname(String lastname) {
			//this.password.clear(); 
			this.lastname.sendKeys(lastname); 
		}
		
		public void sendemail(String email) {
			//this.password.clear(); 
			this.email.sendKeys(email); 
		}
		
		public void sendtelephone(String telephone) {
			//this.password.clear(); 
			this.telephone.sendKeys(telephone); 
		}
		
		public void sendaddress1(String address1) {
			//this.password.clear(); 
			this.address1.sendKeys(address1); 
		}
		
		public void sendaddress2(String address2) {
			//this.password.clear(); 
			this.address1.sendKeys(address2); 
		}
		
		public void sendcity(String city) {
			//this.password.clear(); 
			this.city.sendKeys(city); 
		}
		
		public void sendpostcode(String postcode) {
			//this.password.clear(); 
			this.postcode.sendKeys(postcode); 
		}
		public void sendcountry(String countryname) {
			System.out.println("country");
			
			Select dropdowncountry = new Select(driver.findElement(By.id("input-country")));
			 dropdowncountry.selectByVisibleText(countryname);
			 
			 }
		public void sendregion(String name) 
		{
			System.out.println("region");
			driver.findElement(By.xpath("//div//select[@name='zone_id']//parent::div")).click();
			Select regiondrop = new Select(driver.findElement(By.xpath("//div//select[@name='zone_id']")));
			 regiondrop.selectByVisibleText(name);
			 
			 
			 }
		public void sendpassword(String password) {
			//this.password.clear(); 
			this.password.sendKeys(password); 
		}
			
			public void sendconfirmpassword(String confirmpassword) {
				//this.password.clear(); 
				this.confirmpassword.sendKeys(confirmpassword); 
			}
			
			public void agreebutton() {
			this.agree.click();
			}
			public void clickcontinue() {
				//this.password.clear(); 
				this.continuebutton.click();
			}
			
			public String checkcontentmessage() {
				return this.contentmessage.getText();
			}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		

	