package testscripts.smoke;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import keywords.ApplicationKeywords;
import utils.UtilKit;

public class ValidateLogoutHybrid extends ApplicationKeywords {
	
	@Test(dataProvider = "getData")
	public void validateLogoutTest(HashMap<String, String> dataMap)
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.type("usernameTextbox", dataMap.get("username"));
		
		app.type("passwordTextbox", dataMap.get("password"));
		
		app.click("loginButton");
		
		app.validateURL(dataMap.get("Expected URL1"));
		
		app.click("profileImage");
		
		app.click("logoutButton");
		
		app.validateURL(dataMap.get("Expected URL2"));
		
		app.quitBrowser();
		
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestData("TC-103");
		
		return data;
	}

}
