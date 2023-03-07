package com.test.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TestAspiration {
	
	
	@Test
	public void firstTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aspiration.com/get-account");
		String text1 = driver.findElement(By.xpath("//span[@class= 'Text-sc-1yqq6iv-0 cYckVh atom-text']")).getText();
		String text2 = driver.findElement(By.xpath("(//span[@class= 'Text-sc-1yqq6iv-0 cYckVh atom-text'])[2]")).getText();

		String expected1 = "ASPIRATION";
		String expected2 = "ASPIRATION PLUS";
		
		Assert.assertEquals(expected1, text1);
		Assert.assertEquals(expected2, text2);
		
		
	}
	
	@Test
	public void secondTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aspiration.com/get-account");
		
		driver.findElement(By.xpath("//input[@data-testid = 'signup-input-cta-spend-and-save']")).sendKeys("rjimenez200018@gmail.com");
		driver.findElement(By.xpath("//button[@data-testid = 'signup-cta-spend-and-save']")).click();
		
		//String title = driver.getCurrentUrl();
		//String expected = "https://my.aspiration.com/register/smart-sign-up/TM9K92RUL6TXM";
		
		String title = "";
		String expected = "https://my.aspiration.com/register/smart-sign-up/TM9K92RUL6TXM";
		
		synchronized(driver) {
			try {
				driver.wait(10000);
				title = driver.getCurrentUrl();
				

			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		Assert.assertEquals(expected, title);
		
		
	}
	
	@Test
	public void thirdTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aspiration.com/get-account");
		String text1 = driver.findElement(By.xpath("//p[@data-testid= 'spend-and-save-monthly-price']")).getText();
		String text2 = driver.findElement(By.xpath("(//p[@data-testid = 'spend-and-save-yearly-price'])")).getText();

		String expected1 = "$7.99/mo";
		String expected2 = "$5.99/mo if you pay annually";
		
		Assert.assertEquals(expected1, text1);
		Assert.assertEquals(expected2, text2);
		
		
	}
	
	@Test
	public void fourthTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aspiration.com/get-account");
		String text1 = driver.findElement(By.xpath("//p[@data-testid= 'spend-and-save-monthly-price']")).getText();
		String text2 = driver.findElement(By.xpath("(//p[@data-testid = 'spend-and-save-yearly-price'])")).getText();
		
		

		String expected1 = "$7.99/mo";
		String expected2 = "$5.99/mo if you pay annually";
		
		Assert.assertEquals(expected1, text1);
		Assert.assertEquals(expected2, text2);
		
		
	}
	
	@Test
	public void fifthTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aspiration.com/get-account");
		List<WebElement> list1 = new ArrayList<WebElement>();
		List<WebElement> list2 = new ArrayList<WebElement>();

		
		synchronized(driver) {
			try {
				driver.wait(10000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight/4)");
				driver.wait(40000);
				list1 = driver.findElements(By.xpath("//img[@src= 'https://images.ctfassets.net/ejg6grzpbbxj/1a5bJjzix620gM0psm2SG6/2797baefd75c385c0523b43197465e85/decorative-checkmark-1-0-0_3x.webp?fm=webp']"));
				list2 = driver.findElements(By.xpath("//img[@src= 'https://images.ctfassets.net/ejg6grzpbbxj/7utCq7OpXxIYzMRgW6QGJl/53af4f8819261e4e7a125214ea430345/decorative-checkmark-1-0-0_3x.webp?fm=webp']"));



			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		};
		
		
		Boolean check = (list1.size() - list2.size()) == 3;
		
		Assert.assertTrue(check);
		
		
	}
	
	

}
