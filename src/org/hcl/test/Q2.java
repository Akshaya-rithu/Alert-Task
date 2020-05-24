package org.hcl.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day8 Task-Alert\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		
		WebElement framewebelement = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(framewebelement);
		
		WebElement conti = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		conti.click();
		
		Alert a1=driver.switchTo().alert();
		Thread.sleep(3000);
		a1.accept();
		
	}

}
