package testscripts.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginOrangeHRM extends BaseTest {
	
	
	@Test
	public void validateLoginTest1() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0607");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(3000);
		
		//validate title
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
	}
	
	@Test
	public void validateLoginTest2() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0607");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(3000);
		
		//validate title
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
	}
	
	@Test
	public void validateLoginTest3() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz1212");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(3000);
		
		//validate title
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
	}
	
	@Test
	public void validateLoginTest4() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz1212");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(3000);
		
		//validate title
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
	}
	
	

}
