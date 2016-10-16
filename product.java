package store;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class product {

	public static void main(String[] args) {
		
		//List

				FirefoxDriver myBrowser  = new FirefoxDriver();
				
				testHomePage(myBrowser);
			}
			
			public static void testHomePage(WebDriver driver)
			{
				System.out.println("In testHomePage() method");
				
				driver.get("http://www.google.com");

				// Code to do home page verifications
				driver.findElement(By.name("q"));
	}
}
 