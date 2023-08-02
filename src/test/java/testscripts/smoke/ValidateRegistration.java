package testscripts.smoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.RegistrationPage;

public class ValidateRegistration extends BaseTest {
	
	@Test
	public void validateRegistrationTest()
	{
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		lp.newUserRegisterLink();
		
		lp.validateTitle("Adactin.com - New User Registration");
		
		RegistrationPage rp=PageFactory.initElements(driver, RegistrationPage.class);
		
		rp.usernameTextbox("riyaz2807");
		
		rp.passwordTextbox("reyaz123");
		
		rp.confirmPasswordTextbox("reyaz123");
		
		rp.fullNameTextbox("Reyaz S");
		
		rp.emailAddressTextbox("abcd@gmail.com");
		
		rp.captchaTextbox("antrin");
		
		rp.termsAndConditionsCheckbox();
		
		rp.registerButton();
		
		
	}
	
	

}
