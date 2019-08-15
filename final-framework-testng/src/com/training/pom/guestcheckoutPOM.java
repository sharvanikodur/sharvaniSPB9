package com.training.pom;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

		public class guestcheckoutPOM {
			private WebDriver driver; 
			
			public guestcheckoutPOM(WebDriver driver) {
				this.driver = driver; 
				PageFactory.initElements(driver, this);
			}

		
		@FindBy(xpath="//img[@title='Regular T-Shirt (Maroon)']")
		private WebElement clicktshirt;
		
		@FindBy(xpath="//*[@id=\"input-option386\"]")
		private WebElement selectsize; 
		
		@FindBy(id="button-cart")
		private WebElement addtocart;
		
		@FindBy(xpath="//*[@id=\"cart\"]/button")
		private WebElement cartclick;
		
		@FindBy(xpath="//*[text()=' View Cart'][1]")
		private WebElement viewcart;
		
		@FindBy(linkText="Checkout")
		public WebElement checkoutbutton;
		
		@FindBy(xpath="//*[@value=\"guest\"]")
		private WebElement guestlogin;
		
		@FindBy(xpath="//*[@value=\"Continue\"]")
		private WebElement continueafterguest;
		
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstname;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastname;
		
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement emailid;
		
		@FindBy(xpath="//input[@name='telephone']")
		private WebElement telephone;
		
		@FindBy(xpath="//input[@name='address_1']")
		private WebElement address1;
		
		
		@FindBy(xpath="//input[@name='address_2']")
		private WebElement address2;
		
		@FindBy(xpath="//input[@name='city']")
		private WebElement city;    
		
		@FindBy(xpath="//input[@name='postcode']")
		private WebElement postalcode;
		
		@FindBy(id="input-country")
		private WebElement countryname;
		
		@FindBy(className = "zone_id")
		private WebElement region;
		
		
		@FindBy(xpath="//*[@id='button-guest']")
		private WebElement continuebuttonafterguest;
		
		
		@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
		private WebElement commentbox;
		
		
		@FindBy(xpath="//*[@id='button-shipping-method']")
		private WebElement continueaftercomment;
		
		@FindBy(xpath="//*[@name='agree']")
		private WebElement agree;
		
		@FindBy(xpath="//*[@id='button-payment-method']")
		private WebElement continueafteragree;
		
		@FindBy(xpath="//*[@id='button-confirm']")
		private WebElement confirmproduct;
		
		public void clicktshirtonpage() {
			this.clicktshirt.click();
			
		}
		
		public void clicksize(int i) {
			Select sizedetail = new Select(driver.findElement(By.id("input-option386")));
			 sizedetail.selectByIndex(i);
		}
		
		public void addtocartbutton(){
			this.addtocart.click();
		}
		
		public void cartclick() {
			this.cartclick.click();
		}
		
		
		
		
		
		
		
		public void viewmycart() {
			Actions builder = new Actions(driver);
			 builder.moveToElement(viewcart).click().build().perform();
			this.viewcart.click();
		
		}
		
		public void checkoutclick() {
			this.checkoutbutton.submit();
		}
		
		public void guestaccountclick() {
			this.guestlogin.click();
		}
		
		public void guestcontinue() {
			this.continueafterguest.click();
		}
		
		public void firstnm(String name) {
			this.firstname.sendKeys(name);
		}
		
		public void lastnm(String name) {
		this.lastname.sendKeys(name);
		
		}
		
		public void email(String em) {
			this.emailid.sendKeys(em);
		}
		
		public void telephondetails(String tele) {
		this.telephone.sendKeys(tele);
		}
		
		
		public void sendaddress1(String add) {
		this.address1.sendKeys(add);
		}
		
		public void sendaddress2(String add) {
			this.address2.sendKeys(add);
			}
		
		
		public void sendcity(String cty) {
			this.city.sendKeys(cty);
			}
		
		
		public void sendpostcode(String code) {
			this.postalcode.sendKeys(code);
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
		
		public void clickcontinuebutton(){
			this.continuebuttonafterguest.click();
		}
		
		public void entercomment(String comments) {
			this.commentbox.sendKeys(comments);
		}
		
		public void clickcontinueaftercomment() {
			this.continueaftercomment.click();
		}
		
		public void agreebutton() {
			this.agree.click();
		}
		
		public void continueafteragreeclick() {
			this.continueafteragree.click();
		}
		
		public void clickconfirm() {
			this.confirmproduct.click();
		}
		}
		
		
		
