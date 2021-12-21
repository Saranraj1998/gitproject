package com.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	private static void beforeclass() {
	 WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	}
	 @AfterClass
	 private static void afterclass() {
		 driver.quit();
	}
@Before
private void beforemethod() {
	// TODO Auto-generated method stub
long start = System.currentTimeMillis();
System.out.println(start);
}
@After
private static void aftermethod() {
	 long end = System.currentTimeMillis();
	 
	 System.out.println(end);

}
@Test
private void login() {
 WebElement txtusername = driver.findElement(By.id("email"));
 txtusername.sendKeys("saran");
 
 WebElement txtpassword = driver.findElement(By.id("pass"));
 txtpassword.sendKeys("tamil");
 
 WebElement btnlogin = driver.findElement(By.name("login"));
 
 btnlogin.click();
 

}
	}


