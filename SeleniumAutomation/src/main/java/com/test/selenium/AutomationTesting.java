package com.test.selenium;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class AutomationTesting {

	public static void ebaySearch(String s) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys(s);
		driver.findElement(By.id("gh-btn")).click();
		List<WebElement> items = driver.findElements(By.className("s-item__title"));
		List<WebElement> prices = driver.findElements(By.className("s-item__price"));

				
		
		try (FileWriter fstream = new FileWriter("products.txt");
	             BufferedWriter info = new BufferedWriter(fstream)) {
				for(int i = 0; i<items.size(); i++) {
					String str = items.get(i).getText() + " - " + prices.get(i).getText();
					info.write(str);
					info.newLine();
				}
				System.out.println("Done");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
	public static void targetSearch(String s) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.target.com");
		
		driver.findElement(By.id("search")).sendKeys(s);
		
		driver.findElement(By.xpath("//button[@aria-label='go']")).click();
		
		synchronized(driver) {
			try {
				driver.wait(10000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight/4)");
				driver.wait(10000);
				js.executeScript("window.scrollBy(0,document.body.scrollHeight/4)");
				driver.wait(10000);
				js.executeScript("window.scrollBy(0,document.body.scrollHeight/4)");
				driver.wait(10000);
				js.executeScript("window.scrollBy(0,document.body.scrollHeight/4)");
				driver.wait(10000);

			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		List<WebElement> items = driver.findElements(By.xpath("//a[@data-test='product-title']"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@data-test='current-price']"));
		System.out.println(items.size());
		System.out.println(prices.size());


				
		
		try (FileWriter fstream = new FileWriter("targetProducts.txt");
	             BufferedWriter info = new BufferedWriter(fstream)) {
				for(int i = 0; i<items.size(); i++) {
					String str = items.get(i).getText() + " - " + prices.get(i).getText();
					//System.out.println(str);
					info.write(str);
					info.newLine();
				}
				System.out.println("Done");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ebaySearch("iphone");
		targetSearch("iphone");


	}

}
