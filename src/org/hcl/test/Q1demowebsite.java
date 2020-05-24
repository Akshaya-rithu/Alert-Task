package org.hcl.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1demowebsite {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Scanner1\\AKSHAYA\\Selenium-Day1-BrowserLaunch\\Day8 Task-Alert\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Robot r=new Robot();
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Thread.sleep(3000);
		button1.click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println(text1);
		alert1.accept();
		Thread.sleep(3000);

		WebElement confirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		button2.click();
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.dismiss();
		Thread.sleep(3000);

		WebElement prompt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt.click();
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		button3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("AKshayarithu");
		Thread.sleep(3000);
		String text3 = alert3.getText();
		System.out.println(text3);
		alert3.accept();
		Thread.sleep(3000);
	}
}








/*
 *		 File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\USER\\Desktop\\screenshot\\output1.jpeg");
		FileUtils.copyFile(src1, dest1);
		
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\USER\\Desktop\\screenshot\\output2.jpeg");
		FileUtils.copyFile(src2, dest2);
		
		File src3 = ts.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("C:\\Users\\USER\\Desktop\\screenshot\\output3.jpeg");
		FileUtils.copyFile(src3, dest3);*/
