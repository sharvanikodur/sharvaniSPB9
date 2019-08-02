package com.training.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class addtocartPOM {
		private WebDriver driver; 
		
		public addtocartPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//img[@title='Regular T-Shirt (Maroon)']")
		private WebElement clicktshirt; 
		
		@FindBy(linkText="Regular T-Shirt (Maroon)")
		private WebElement nametovalidate;
		
		@FindBy(xpath="//*[@id=\"input-option386\"]")
		private WebElement selectsize; 
		
		@FindBy(id = "button-cart")
		private WebElement addtocart;
		
		@FindBy(xpath="//*[@id=\"content\"]/div[1]/a[2]  ")
		private WebElement successmessage;
		
		
		@FindBy(xpath="//*[@id=\"cart\"]/button")
		private WebElement cartbutton;
		
		@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
		private WebElement viewcart;
		
		@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[1]/a/img")
		private WebElement imageofshirt;
		
		@FindBy(linkText="Regular T-Shirt (Maroon)")
		private WebElement shirtdetails;
		
		@FindBy(linkText="Chest Size: 30")
		private WebElement chestsizedetails;
		
		@FindBy(xpath="TBSM-4th-8th STD")
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
			Actions builder = new Actions(driver);
			 builder.moveToElement(cartbutton).click().build().perform();
			//this.myAccount.click();
			
		}
		
		public void viewmycart() {
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
		public String finalpriceshirtdetails() {
			return this.finalpricedetails.getText();
		}
		public void clickcheckout() {
			this.checkoutbutton.click();
			
			}
		
		public String checkoutmessage() {
			return this.checkoutmessage.getText();
		}
		
		
		
		
		}
		






