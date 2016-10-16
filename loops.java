package javabasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.indeed.co.uk/");
		
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		
		int linksCount = hyperlinks.size();
		System.out.println("Links count: " + linksCount);
//		int i=0;
//
//		while (i<linksCount) 
//		{
//			// Evaluate expression each time and until its false, execute the following statements every time
//			
//			WebElement link = hyperlinks.get(i);
//			
//			System.out.println(link.getText());
//			
//			i++;
//		}
		
//		for (int i=0; i<linksCount; i++)
//		{
//			// Initialize loop variables
//			// Evaluate expression each time and until its false, 
//			//execute the following statements and then loop variables changes every time
//			WebElement link = hyperlinks.get(i);
//			
//			System.out.println(link.getText());
//		}
		
		for(WebElement link :hyperlinks)
		{
			// Execute following statements for every item in the itemsList
			System.out.println(link.getText());
		}
	}

}

