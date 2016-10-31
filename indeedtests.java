package Testcase1;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class indeedtests {

	public WebDriver driver;
	public String baseUrl;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new FirefoxDriver();
		baseUrl = "http://www.indeed.co.uk";
	}
	
	 @DataProvider
	  public Object[][] getIndeedJobSearchParams() 
	  {
	    return new Object[][] 
	    		{
			      new Object[] { "Selenium", "London" },
			      new Object[] { "Cucumber", "Glasgow" },
			      new Object[] { "Testing", "Manchester" },
	    		};
	  }
	
	@Test(dataProvider = "getIndeedJobSearchParams")
	public void testIndeedJobSearch(String keyword, String location)
	{
	//if(true)
	//	{
	//		throw new SkipException("Test is skipped in Excel file");
	//	}
		driver.get(baseUrl);
		driver.findElement(By.id("what")).sendKeys(keyword);
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys(location);
		driver.findElement(By.id("fj")).click();
		
		String expectedTitle = keyword + " Jobs, vacancies in "+ location + " | Indeed.co.uk";
		String actualTitle=driver.getTitle();
		
		//assertEquals("ERROR: Job search title is wrong", expectedTitle, actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "ERROR: Job search title is wrong");
	}
	
	@Test
	public void testIndeedSiteHomePageLogo()
	{
		driver.get(baseUrl);
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Indeed job search']")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}


