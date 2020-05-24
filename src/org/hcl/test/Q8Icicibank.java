package org.hcl.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8Icicibank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day8 Task-Alert\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.id("Revamp_Banner_ID"));
		driver.switchTo().frame(frame1);
		
		WebElement login = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		login.sendKeys("akshaya");
		login.click();
		
		Alert a1=driver.switchTo().alert();
		a1.accept();
		
	}

}
