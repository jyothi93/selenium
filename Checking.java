package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checking {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("email id");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
        driver.findElement(By.id("Passwd")).sendKeys("Password	");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		driver.findElement(By.className("z0")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("jyothi.kalakota86@gmail.com");

        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("hi");

        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//div[@class='Ar Au']//div"));
        element.click();
        element.sendKeys("Hi");
        driver.findElement(By.xpath("//div[text()='Send']")).click();
        
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
}
}

