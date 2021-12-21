package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsearch.sendKeys("Iphone",Keys.ENTER);
	WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (128GB)"
			+ " - Pink']//parent::a//parent::h2//parent::div//parent::div//parent::div//"
			+ "parent::div//child::span[text()='69,900']"));
	
	Thread.sleep(4000);
	
	
	String text = iphone.getText();
	
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
}
}
