package org.hcl.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3canaraalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day8 Task-Alert\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//input[@onclick='return fLogon()']"));
		Thread.sleep(4000);
		
		String attribute = signin.getAttribute("onclick");
		System.out.println("value of attribute name- onclick: "+attribute);
		signin.click();
		Thread.sleep(4000);
		
		Alert a1=driver.switchTo().alert();
		a1.accept();
		
		System.out.println("I clonned my project");
		System.out.println("Added 2 lines ");
		
		
	}

}
