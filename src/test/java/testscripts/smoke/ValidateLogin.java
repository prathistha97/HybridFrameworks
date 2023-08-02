package testscripts.smoke;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class ValidateLogin extends ApplicationKeywords{
	
	@Test
	public void validateLoginTest()
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.type("usernameTextbox", "Admin");
		
		app.type("passwordTextbox", "admin123");
		
		app.click("loginButton");
		
		app.validateURL("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		app.quitBrowser();
		
	}

}
