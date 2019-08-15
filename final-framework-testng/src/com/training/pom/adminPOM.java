package com.training.pom;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.interactions.Action;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

		public class adminPOM {

			private WebDriver driver; 
			
			public adminPOM(WebDriver driver) {
				this.driver = driver; 
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//input[@name='username']")  
			
			private WebElement username;
			
			@FindBy(xpath="//input[@name='password']")
			private WebElement password;
			
			@FindBy(xpath="//*[@type='submit']")
			private WebElement login;
			
			@FindBy(xpath="//*[@id='catalog']")
			private WebElement catalog;
			
			@FindBy(xpath="//*[@id=\"catalog\"]/ul/li[2]/a")
			private WebElement products;
			
			@FindBy(xpath="//*[@class='btn btn-primary']")
			private WebElement addnewbutton;
			
			@FindBy(xpath="//input[@name='product_description[1][name]']")
			private WebElement productname;
			
			@FindBy(xpath="//input[@name='product_description[1][meta_title]']")
			private WebElement megatitle;
			
			@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a")  
			//@FindBy(linkText="Data")
			private WebElement datatab;
			
			@FindBy(xpath="//*[@name='model']")
			private WebElement model;
			
			@FindBy(xpath="//*[@name='price']")
			private WebElement price;
			
			@FindBy(xpath="//*[@name='quantity']")
			private WebElement quantity;
			
			@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[3]/a")
			//@FindBy(linkText="Links")
			private WebElement links;
			
			@FindBy(xpath="//*[@name='category']")
			private WebElement category;
			
			@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[7]/a")
			//@FindBy(linkText="Discount")
			private WebElement discount;
			
			@FindBy(xpath="//table[@id='discount']//tfoot//tr[1]//td[2]//button//i")
			private WebElement adddiscount;
			
			@FindBy(xpath="//*[@name='product_discount[0][quantity]']")
			private WebElement addquantity;
			
			@FindBy(xpath="//*[@name='product_discount[0][price]']")
			private WebElement priceenter;
			
			@FindBy(xpath="//div[@class='bootstrap-datetimepicker-widget dropdown-menu top picker-open']//td[@class='day active today']")
			private WebElement startdate;
			
			@FindBy(xpath="//div[@class='bootstrap-datetimepicker-widget dropdown-menu top picker-open']//td[@class='day active today']//following-sibling::td")
            private WebElement enddate;
			
			
			@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
			private WebElement rewardpoints;
			
			@FindBy(xpath="//*[@name='points']")
			private WebElement points;
			
			@FindBy(xpath="//*[@type='submit']")
			private WebElement save;
			
			public void sendusername(String un) {
				this.username.sendKeys(un);
			}
			
			
				
			
			public void sendpassword(String pwd) {
				this.password.sendKeys(pwd);
			}
			public void loginclick() {
				this.login.click();
			}
			public void catalogclick() {
			this.catalog.click();
			}
			
			public void clickonproducts() {
				Actions builder = new Actions(driver);
				 builder.moveToElement(products).click().build().perform();
				//this.myAccount.click();
				
			}
			
			public void clickaddnew() {
				this.addnewbutton.click();
			}
			
			public void productnameenter(String productnm) {
				this.productname.sendKeys(productnm);
			}
			
			public void megatitleenter(String mgt) {
				this.megatitle.sendKeys(mgt);
			}
			
			public void datatabclick() {
				this.datatab.click();
			}
			
			
			public void modeltextboxenter(String modeltxt) {
			this.model.sendKeys(modeltxt);
			}
			
			public void priceenter(String pp) {
				this.price.sendKeys(pp);
			}
			
			public void enterquantity(String qty) {
				this.quantity.sendKeys(qty);
			}
			
			public void clicklinks() {
				this.links.click();
			}
			
			
	
	  public void sendcategory(String name) {
	  
	  this.category.click(); Select categorytype = new
	  Select(driver.findElement(By.xpath("//*[@id='product-category']")));
	  categorytype.selectByVisibleText(name); }
	 
			
			public void clickdiscount() {
				this.discount.click();
			}
			
			public void adddiscountclick() {
				this.adddiscount.click();
			}
			
			public void quantitytextbox(String number) 
			{
				this.adddiscount.sendKeys(number);
			}
			
			public void sendprice(String pp) {
				this.priceenter.sendKeys(pp);
			}
			public void startdateclick() {
				this.startdate.click();
			}
			public void enddateclick() {
				this.enddate.click();
			}
			
			public void rewardspointsclick() {
				this.rewardpoints.click();
			}
			
			public void pointsenter(String points) {
				this.points.sendKeys(points);
				
			}
			
			public void save() {
				this.save.click();
			}
			
			
			
			
			
}
		
		
