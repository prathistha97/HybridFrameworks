package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	@FindBy(xpath="//input[@name='username']") 
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='re_password']") 
	WebElement confirmPasswordTextbox;
	
	@FindBy(xpath="//input[@name='full_name']") 
	WebElement fullNameTextbox;
	
	@FindBy(xpath="//input[@name='email_add']") 
	WebElement emailAddressTextbox;
	
	@FindBy(xpath="//input[@name='captcha']") 
	WebElement captchaTextbox;
	
	@FindBy(xpath="//input[@name='tnc_box']") 
	WebElement termsAndConditionsCheckbox;
	
	@FindBy(xpath="//input[@name='Submit']") 
	WebElement registerButton;
	
	public void usernameTextbox(String text)
	{
		usernameTextbox.sendKeys(text);
	}
	
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
	}
	
		
	public void confirmPasswordTextbox(String text)
	{
		confirmPasswordTextbox.sendKeys(text);
	}
	
		
	public void fullNameTextbox(String text)
	{
		fullNameTextbox.sendKeys(text);
	}
	
		
	public void emailAddressTextbox(String text)
	{
		emailAddressTextbox.sendKeys(text);
	}
	
	public void captchaTextbox(String text)
	{
		captchaTextbox.sendKeys(text);
	}
		
	public void termsAndConditionsCheckbox()
	{
		if(!termsAndConditionsCheckbox.isEnabled())
		{
		termsAndConditionsCheckbox.click();
		}
	}
		
	public void registerButton()
	{
		registerButton.click();
	}
	
	
	public void doRegistration(String uname,String pwd,String confirmPwd,String fullName,String email,String captcha)
	{
		usernameTextbox.sendKeys(uname);
		
		passwordTextbox.sendKeys(pwd);
		
		confirmPasswordTextbox.sendKeys(confirmPwd);
		
		fullNameTextbox.sendKeys(fullName);
		
		emailAddressTextbox.sendKeys(email);
		
		captchaTextbox.sendKeys(captcha);
		
		termsAndConditionsCheckbox.click();
		
		registerButton.click();
		
	}
	
	
	

}
