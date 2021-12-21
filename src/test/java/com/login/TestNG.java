package com.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG {
	
@BeforeClass
private static void beforeClass() {
	// TODO Auto-generated method stub
System.out.println("beforeclass");
}
@AfterClass
private static void afterClass() {
	// TODO Auto-generated method stub
System.out.println("afterclass");
}

@BeforeMethod
private void beforeMethod() {
	// TODO Auto-generated method stub
System.out.println("beforemethod");
}

@AfterMethod
private void afterMethod() {
	// TODO Auto-generated method stub
System.out.println("aftermethod");
}

@Test
private void login() {
	// TODO Auto-generated method stub
System.out.println("login");
}












}
