



	package com.training.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class dataproviderPOM {
		private WebDriver driver; 
		
		public dataproviderPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="input-email")
		private WebElement emailid; 
		
		@FindBy(id="input-password")
		private WebElement password;
		
		@FindBy(xpath="//input[@value='Login']")
		private WebElement loginBtn; 
		
		@FindBy(xpath = "//i[@class='fa fa-user']")
		private WebElement myAccount;
		
		@FindBy(linkText="Register")
		private WebElement register;
		
		
		@FindBy(linkText="Login")
		private WebElement loginlink;
		
		@FindBy(xpath="//div[@class='alert alert-danger']")
		private WebElement alertmessage;
		
		
		public void clickloginlink() {
			Actions builder = new Actions(driver);
			 builder.moveToElement(loginlink).click().build().perform();
		}
		
		public void sendUserName(String emailid) {
			//this.emailid.clear();
			this.emailid.sendKeys(emailid);
		}
		
		public void sendPassword(String password) {
			//this.password.clear(); 
			this.password.sendKeys(password); 
		}
		
		public void clickLoginBtn() {
			this.loginBtn.click(); 
		}
		
		public void clickmyaccount() {
			Actions builder = new Actions(driver);
			 builder.moveToElement(myAccount).click().build().perform();
			//this.myAccount.click();
			
		}
		
		public void registeraccount() {
			//this.register.click();
			Actions builder = new Actions(driver);
			builder.moveToElement(register).click().build().perform();
		}
		
		public String alertmessagetext() {
			return this.alertmessage.getText();
		}
		
		
		}
		



