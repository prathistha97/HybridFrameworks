package testscripts.smoke;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class ValidateLogout extends ApplicationKeywords {
	
	@Test
	public void validateLogoutTest()
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.type("usernameTextbox", "Admin");
		
		app.type("passwordTextbox", "admin123");
		
		app.click("loginButton");
		
		app.validateURL("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		app.click("profileImage");
		
		app.click("logoutButton");
		
		app.validateURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		app.quitBrowser();
		
		
	}

}
