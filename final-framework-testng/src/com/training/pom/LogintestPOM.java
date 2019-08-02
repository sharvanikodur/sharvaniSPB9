package com.training.pom;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.interactions.Action;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

		public class LogintestPOM {

			private WebDriver driver; 
			
			public LogintestPOM(WebDriver driver) {
				this.driver = driver; 
				PageFactory.initElements(driver, this);
			}
			@FindBy(xpath = "//i[@class='fa fa-user']")
			private WebElement myAccount;
			
			@FindBy(linkText="Login")
			private WebElement Loginclick;
			
			@FindBy(xpath="//input[@name='email']")
			private WebElement emailid;
			
			@FindBy(xpath="//input[@name='firstname']")
			private WebElement firstname;
			
			@FindBy(xpath="//input[@name='lastname']")
			private WebElement lastname;
			
			@FindBy(xpath="//input[@name='password']")
			private WebElement password;
			
			@FindBy(xpath="//input[@value='Login']")
			private WebElement loginbutton;
			
			@FindBy(xpath="//*[@id='content']//h1")
			private WebElement contentmessage;
			
			@FindBy(xpath="//*[@class='alert alert-danger']")
			private WebElement warningmesage;
			
			@FindBy(linkText=("Forgotten Password"))
			private WebElement fgtpasswordclick;
			
			@FindBy(xpath="//*[@id='input-email']")
			private WebElement reenteremail;
			
			@FindBy(xpath="//*[@value='Continue']")
			private WebElement Continuetonextpage;
			
			@FindBy(xpath="//*[@class='alert alert-success']")
			private WebElement alertsuccessmessage;
			@FindBy(linkText="Order History")
			private WebElement orderspage;
			
			@FindBy(xpath="//*[@id='content']//h1")
			private WebElement messagedisplayed;
			
			@FindBy(linkText="Edit Account")
			private WebElement accounteditclick;
			
			@FindBy(xpath="//*[@class='alert alert-success']")
			private WebElement messagepostedit;
			
			
			
			
			
			
			public void clickmyaccount() {
				Actions builder = new Actions(driver);
				 builder.moveToElement(myAccount).click().build().perform();
				//this.myAccount.click();
				
			}
			
			public void loginaccount() {
				Actions builder = new Actions(driver);
				builder.moveToElement(Loginclick).click().build().perform();
			}
			
			public void sendUserName(String emailid) {
				this.emailid.clear();
				this.emailid.sendKeys(emailid);
				
			}
			
			
			public void sendpassword(String password) {
				this.password.clear(); 
				this.password.sendKeys(password); 
			}
			
			public void clicklogin() {
				this.loginbutton.click(); 
			}
			
			public String contentmessageprint()
			{
				return this.contentmessage.getText();
			}
			
			public String warningmessageprint()
			{
				return this.warningmesage.getText();
			}
		
		
		public void clickfrgtpassword() {
			
		
			this.fgtpasswordclick.click(); 
			
			}
		
		public void sendUserNamenexttime(String reenteremail) {
			
			this.reenteremail.sendKeys(reenteremail);
		
		
		
		}
		public void clickcontinuebutton() {
			
			
			this.Continuetonextpage.click(); 
			
			}
		
		
		public String readmessagesecond()
		{
			return this.alertsuccessmessage.getText();
		}
		public void clickmyorderspage()
		{
			this.orderspage.click();
		}
		
		public String primtmyordersmesage()
		{
			return this.messagedisplayed.getText();
		}
		
		public void clickeditaccountlink() {
			
			this.accounteditclick.click();
		}
		
		public String primtmessagepostedit()
		{
			return this.messagepostedit.getText();
		}
		
		public void sendUserName1(String firstname) {
			this.firstname.clear();
			this.firstname.sendKeys(firstname);
			
		}
		
		
		public void sendlastname(String lastname) {
			//this.password.clear(); 
			this.lastname.sendKeys(lastname); 
		}
		
		}
			