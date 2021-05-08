package com.test.basics;

import org.testng.annotations.Test;

public class SecondProgram {
	
	@Test(groups= {"Smoke"})
	public void demoTest() {
		System.out.println("Executed 1st test case Successfully");
	}

	@Test
	public void demoTestAnother() {
		System.out.println("Executed 2nd test case Successfully");
	}
}
