package org.hcl.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4Onlinesbi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day8 Task-Alert\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement conbtn = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		conbtn.click();
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.id("Button2"));
		String attribute = login.getAttribute("type");
		System.out.println("attribute of submit: "+attribute);
		login.click();
		Thread.sleep(3000);
		
		Alert a1=driver.switchTo().alert();
		Thread.sleep(3000);
		a1.accept();
		
	}

}
