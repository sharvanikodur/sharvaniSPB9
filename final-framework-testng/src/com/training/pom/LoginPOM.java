package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath = "//i[@class='fa fa-user']")
	private WebElement myAccount;
	
	@FindBy(linkText="Register")
	private WebElement register;
	
	
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
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
	
	
		
	}
	

