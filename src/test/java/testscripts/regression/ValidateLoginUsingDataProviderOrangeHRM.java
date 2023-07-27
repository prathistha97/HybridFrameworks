package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginUsingDataProviderOrangeHRM extends BaseTest {
	
	@Test(dataProvider="getData")
	public void validateLoginTest1(String username,String password,String expURL) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//validate title
		
		//Assert.assertEquals(driver.getTitle(), expTitle);
		
		Assert.assertEquals(driver.getCurrentUrl(), expURL);		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		
		Object[][] data=new Object[4][3];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[0][2]="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		data[1][0]="Admin";
		data[1][1]="admin456";
		data[1][2]="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		data[2][0]="Admin777";
		data[2][1]="admin123";
		data[2][2]="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		data[3][0]="Admin777";
		data[3][1]="admin456";
		data[3][2]="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		
		
		return data;
		
		
	}

}
