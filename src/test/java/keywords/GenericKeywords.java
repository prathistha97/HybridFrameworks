package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords extends BaseTest {

	public void openBrowser() {

		String browserName = configProp.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		// launch the app

		driver.get(configProp.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitWait"))));

	}
	
	
	public void type(String locatorKey, String text)
	{
		getElement(locatorKey).sendKeys(text);
	}


	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public  WebElement getElement(String locatorKey) {
		
		WebElement element=null;
		
		By by=null;
		
		if(locatorKey.endsWith("_id"))
		{
			by=By.id(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_name"))
		{
			by=By.name(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_linkText"))
		{
			by=By.linkText(locatorsProp.getProperty(locatorKey));
		}
		else
		{
			by=By.xpath(locatorsProp.getProperty(locatorKey));
		}
		
		element=driver.findElement(by);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
		wait(2);
		
		return element;
		
		
	}
	
	public void wait(int time)
	{
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void quitBrowser()
	{
		driver.quit();
	}

}
