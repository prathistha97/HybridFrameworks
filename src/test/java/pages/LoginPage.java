package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	
	//WebElement
	
	@FindBy(xpath="//input[@name='username']") 
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='login']") 
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='New User Register Here']") 
	WebElement newUserRegisterLink;
	
		
	//Metthods on WebElement
	
	public void usernameTextbox(String text)
	{
		usernameTextbox.sendKeys(text);
	}
	
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
	}
	
	public void loginButton()
	{
		loginButton.click();
	}
	
	public void newUserRegisterLink()
	{
		newUserRegisterLink.click();
	}
	
}
