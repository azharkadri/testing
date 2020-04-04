package com.tdd.hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinLoginPage {
	
	@FindBy(name="session_key")
	private WebElement emailOrMobileTextbox;
	
	@FindBy(id="password")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement signinButton;
	
	LinkedinLoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmailOrMobile(String emailOrMobile) {
		this.emailOrMobileTextbox.clear();
		this.emailOrMobileTextbox.sendKeys(emailOrMobile);
	}
	
	public void enterPassword(String password) {
		this.passwordTextbox.clear();
		this.passwordTextbox.sendKeys(password);
	}
	
	public void clickOnSigninButton() {
		signinButton.click();
	}
	
	

}
