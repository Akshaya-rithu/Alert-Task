package org.hcl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6paytm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day8 Task-Alert\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		loginbtn.click();
		
	}

}
