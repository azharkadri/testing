package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	final String UN="username";
	@FindBy(id=UN)
	private WebElement emailOrPhoneNoTextbox;
	
	@FindBy(id="password")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement signinButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailOrPhoneNo(String emailOrPhoneNo) {
		this.emailOrPhoneNoTextbox.sendKeys(emailOrPhoneNo);
	}
	public void enterPassword(String password) {
		this.passwordTextbox.sendKeys(password);
	}
	
	public void clickOnSigninButton() {
		signinButton.click();
	}

}
