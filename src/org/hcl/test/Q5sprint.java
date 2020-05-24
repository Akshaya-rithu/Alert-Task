package org.hcl.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5sprint {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day8 Task-Alert\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement signin = driver.findElement(By.xpath("//p[text()='Sign In']"));
		String text = signin.getText();
		System.out.println("text of corresponding webelement; "+text);
		js.executeScript("arguments[0].click()", signin);
		
		driver.switchTo().frame("utag_name");
				
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@sandbox='allow-same-origin allow-top-navigation allow-forms allow-scripts']"));
		driver.switchTo().frame(frame2);
		
		driver.switchTo().frame("destination_publishing_iframe_tmobile_0");
		
		//driver.switchTo().frame("inqChatStage");
		//driver.switchTo().frame("post_box_1");
		WebElement btnsignin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnsignin.click();
		Point location = btnsignin.getLocation();
		System.out.println("X= "+location.x);
		System.out.println("Y= "+location.getY());
		
		Alert a1=driver.switchTo().alert();
		a1.accept();

	}

}
