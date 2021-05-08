package com.test.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstProgram {

	@BeforeTest
	public void setup() {
		System.out.println("@BeforeTest - I will execute 1st Successfully");
	}
	
	@BeforeClass
	public void beforeTheClass() {
		System.out.println("@BeforeClass - I will execute 1st in the current class Successfully");
	}
	
	@AfterClass
	public void afterTheClass() {
		System.out.println("@BeforeClass - I will execute at the end of the current class Successfully");
	}
	
	@BeforeSuite
	public void setupFirst() {
		System.out.println("@BeforeSuiteI - will execute before everyone Successfully ");
	}
	
	@BeforeMethod
	public void beforeEveryTest() {
		System.out.println("@BeforeMethod - Executed before every test case Successfully");
	}
	
	@AfterMethod
	public void afterEveryTest() {
		System.out.println("@AfterMethod - Executed after every test case Successfully");
	}
	
	@Test
	public void demoTest() {
		System.out.println("@Test - Executed 1st test case Successfully");
	}

	@Test(groups= {"Smoke"})
	public void demoTestAnother() {
		System.out.println("@Test - Executed 2nd test case Successfully");
	}
	
	
	@AfterSuite
	public void setupLast() {
		System.out.println("@AfterSuite - I will execute after everyone Successfully ");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("@AfterTest - I will execute last Successfully");
	}
	
}
