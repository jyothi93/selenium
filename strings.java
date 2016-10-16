package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.indeed.co.uk/");
		
		String expectedTitle = "Job Search | one search. ALL JOBS. Indeed";
		if(expectedTitle.equalsIgnoreCase(driver.getTitle()))  
		{	
			// If condition is true, execute following statements
			System.out.println("Test is PASSED"); //syso + Ctrl + Space
		}
		else
		{
			// If condition is false,execute following statements
			System.out.println("Test is FAILED"); //syso + Ctrl + Space
		}
		
		
		
		
		System.out.println(driver.getTitle().contains("one search.1"));
		System.out.println(driver.getTitle().startsWith("Job Search |1"));
		System.out.println(driver.getTitle().endsWith(". Indeed1"));
		
		String searchCount = "There are 280 results";
		
		
		int sc=	Integer.parseInt(searchCount.replaceAll("\\D", ""));
		System.out.println(sc);
		
		//Double.parseDouble(s)
		
	}

}
