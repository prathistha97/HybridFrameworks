package testscripts.regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;

public class ValidateLoginUsingDataProviderOrangeHRMExcel2 extends BaseTest {
	
	@Test(dataProvider="getData")
	public void validateLoginTest1(HashMap<String,String> dataMap) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataMap.get("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//validate title
		
		//Assert.assertEquals(driver.getTitle(), expTitle);
		
		Assert.assertEquals(driver.getCurrentUrl(), dataMap.get("Expected URL"));		
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		Object[][] data=new Object[1][1];
	
		
		data[0][0]=UtilKit.getTestData("TC-100");
		
		return data;
	}

}
