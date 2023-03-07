package com.test.aspiratinAPI;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AspirationTest {
	
	public static void homePage() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aspiration.com/get-account");
		List<WebElement> list1 = new ArrayList<WebElement>();
		List<WebElement> list2 = new ArrayList<WebElement>();

		
		synchronized(driver) {
			try {
				driver.wait(10000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight/4)");
				driver.wait(80000);
				list1 = driver.findElements(By.xpath("//img[@src= 'https://images.ctfassets.net/ejg6grzpbbxj/1a5bJjzix620gM0psm2SG6/2797baefd75c385c0523b43197465e85/decorative-checkmark-1-0-0_3x.webp?fm=webp']"));
				list2 = driver.findElements(By.xpath("//img[@src= 'https://images.ctfassets.net/ejg6grzpbbxj/7utCq7OpXxIYzMRgW6QGJl/53af4f8819261e4e7a125214ea430345/decorative-checkmark-1-0-0_3x.webp?fm=webp']"));



			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		//List<WebElement> list1 = driver.findElements(By.xpath("//img[@src= 'https://images.ctfassets.net/ejg6grzpbbxj/7utCq7OpXxIYzMRgW6QGJl/53af4f8819261e4e7a125214ea430345/decorative-checkmark-1-0-0_3x.webp?fm=webp']"));
		System.out.println(list1.size());
		System.out.println(list2.size());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		homePage();
	}

}
