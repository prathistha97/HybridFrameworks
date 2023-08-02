package testscripts.smoke;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.RegistrationPage;
import utils.UtilKit;

public class ValidateRegistrationDataProvider extends BaseTest {
	
	@Test(dataProvider = "getData")
	public void validateRegistrationTest(HashMap<String, String> dataMap)
	{
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		lp.newUserRegisterLink();
		
		lp.validateTitle(dataMap.get("Expected Title"));
		
		RegistrationPage rp=PageFactory.initElements(driver, RegistrationPage.class);
		
		rp.usernameTextbox(dataMap.get("Username"));
		
		rp.passwordTextbox(dataMap.get("Password"));
		
		rp.confirmPasswordTextbox(dataMap.get("Confirm Password"));
		
		rp.fullNameTextbox(dataMap.get("Full Name"));
		
		rp.emailAddressTextbox(dataMap.get("Email Address"));
		
		rp.captchaTextbox(dataMap.get("Captcha Text"));
		
		rp.termsAndConditionsCheckbox();
		
		rp.registerButton();
		
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestData("TC-104");
		
		return data;
	}
	

}
