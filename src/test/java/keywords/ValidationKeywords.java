package keywords;

import org.testng.Assert;

public class ValidationKeywords extends GenericKeywords {
	
	public void validateTitle(String expTitle)
	{
		Assert.assertEquals(driver.getTitle(), expTitle);
	}
	
	public void validateURL(String url)
	{
		Assert.assertEquals(driver.getCurrentUrl(), url);
	}

}
