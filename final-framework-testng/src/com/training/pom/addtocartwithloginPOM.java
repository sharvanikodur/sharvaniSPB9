
	package com.training.pom;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

		public class addtocartwithloginPOM {
			private WebDriver driver; 
			
			public addtocartwithloginPOM(WebDriver driver) {
				this.driver = driver; 
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath = "//i[@class='fa fa-user']")
			private WebElement myAccount;
			
			@FindBy(linkText="Login")
			private WebElement Loginclick;
			
			@FindBy(xpath="//input[@name='email']")
			private WebElement emailid;
			

			@FindBy(xpath="//input[@name='password']")
			private WebElement password;
			
			@FindBy(xpath="//input[@value='Login']")
			private WebElement loginbutton;
			
			@FindBy(linkText="Uniform Store")
			private WebElement uniformstorelinkclick;
			
			@FindBy(xpath="//*[@id=\"featured-grid\"]/div[3]/div/div/div[1]/a/img")
			private WebElement clicktshirt; 
			
			@FindBy(linkText="Regular T-Shirt (Maroon)")
			private WebElement nametovalidate;
			
			@FindBy(xpath="//*[@id=\"input-option386\"]")
			private WebElement selectsize; 
			
			@FindBy(id = "button-cart")
			private WebElement addtocart;
			
			@FindBy(xpath="//*[@id=\"content\"]/div[1]/a[2]  ")
			private WebElement successmessage;
			
			
			@FindBy(xpath="//*[@id=\"cart\"]")
			private WebElement cartbutton;
			
			@FindBy(xpath="//*[text()=' View Cart'][1]")
			private WebElement viewcart;
			
			@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[1]/a/img")
			private WebElement imageofshirt;
			
			@FindBy(linkText="Regular T-Shirt (Maroon)")
			private WebElement shirtdetails;
			
			@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/small")
			private WebElement chestsizedetails;
			
			@FindBy(className="form-control")
			private WebElement modeldetails;
			
			@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")
			private WebElement quantitydetails;
			
			@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")
			private WebElement unitpricedetails;
			
			@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]")
			private WebElement finalpricedetails;
			
			@FindBy(linkText="Checkout")
			private WebElement checkoutbutton;
			
			@FindBy(xpath="//*[@id=\"content\"]/h1")
			private WebElement checkoutmessage;
			
			
			@FindBy(xpath="//*[@id=\"payment-existing\"]/select")
			private WebElement addressdetailsbilling;
			
			@FindBy(xpath="//*[@id=\"button-payment-address\"]")
			private WebElement continuebuttonbilling;
			
			@FindBy(xpath="//*[@id=\"shipping-existing\"]/select")
			private WebElement shippingdetails;
			
			@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
			private WebElement continuebuttonshipping;
			
			@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
			private WebElement commentbox;
			
			@FindBy(xpath="//*[@id=\"button-shipping-method\"]")
			private WebElement continueoncommentbox;
			
			@FindBy(xpath="//input[@name='agree']")  
			private WebElement termsnconditions;
			
			@FindBy(xpath=" //*[@id=\"button-payment-method\"]")
			private WebElement continuebuttonpaymentbutton;
			
			@FindBy(xpath = "//*[@id=\"button-confirm\"]")
			private WebElement confirmorderbutton;
			
			@FindBy(xpath="//*[@id=\"content\"]/h1")
			private WebElement successmessageafterorderplace;
			
			
			
			
			
			

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
			
			public void clickuniformstorelink() {
				this.uniformstorelinkclick.click();
			}
			
			
			public void clickmaroontshirt() {
				this.clicktshirt.click();
			}
			
			public String validatename() {
				return this.nametovalidate.getText();
			}
			
			public void sendsize(int i) {
			Select sizedetail = new Select(driver.findElement(By.id("input-option386")));
			 sizedetail.selectByIndex(i);
			}
			
			public void clickaddtocart() {
			 this.addtocart.click();
			}
			
			public void getsuccessmesage() {
				this.successmessage.getText();
			}
			
			public void clickonmycart() {
				//Actions builder = new Actions(driver);
				 //builder.moveToElement(cartbutton).click().build().perform();
				this.cartbutton.click();
				
			}
			
			public void viewmycart() {
				Actions builder = new Actions(driver);
				 builder.moveToElement(cartbutton).click().build().perform();
				this.viewcart.click();
				
			}
			
			public String imageofshirtdetails() {
				return this.imageofshirt.getText();
			}
			
			public String shirtdetails() {
				return this.shirtdetails.getText();
			}
			
			public String chestshirtdetails() {
				return this.chestsizedetails.getText();
			}
			public String modelshirtdetails() {
				return this.modeldetails.getText();
			}
			public String quantityshirtdetails() {
				return this.quantitydetails.getText();
			}
			public String unitpriceshirtdetails() {
				return this.unitpricedetails.getText();
			}
			public String finalcartpricedetails() {
				return this.finalpricedetails.getText();
			}
			public void clickcheckout() {
				this.checkoutbutton.click();
				
				}
			
			public String addressbilling() {
				return this.addressdetailsbilling.getText();
			}
			
			public void clickcontinuebuttonbilling() {
				this.continuebuttonbilling.click();
			}
			
			public String shippingdetailsbilling() {
				return this.shippingdetails.getText();
			}
			
			public void clickcontinuebuttonshipping() {
				this.continuebuttonshipping.click();
			}
			
			public void commentboxenter(String value) {
				this.commentbox.clear();
				this.commentbox.sendKeys(value);
			}
			
			public void clickcommentboxcontinue() {
				this.continueoncommentbox.click();
			}
			
			public void clicktermsconditions() {
				this.termsnconditions.submit();
			}
			
			public void clickcontinuebuttonpaymentbutton() {
				this.continuebuttonpaymentbutton.click();
			}
			
			public void clickconfirmorderbutton() {
				this.confirmorderbutton.submit();
			}
			
			public String checksuccessmessageafterorderplace() {
				return this.successmessageafterorderplace.getText();
			}
			
			
			
			
			
			
			
			
			
			
}
