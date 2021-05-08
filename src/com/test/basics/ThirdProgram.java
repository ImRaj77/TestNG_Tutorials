package com.test.basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdProgram {

	@Test(groups= {"Smoke"})
	public void webLogin() {
		System.out.println("Executed webLogin test case Successfully");
	}

	@Test(enabled=false)
	public void mobileLogin() {
		System.out.println("Executed mobileLogin test case Successfully");
	}
	
	@Test(dependsOnMethods={"webLogin"})
	public void apiLogin() {
		System.out.println("Executed apiLogin test case Successfully");
	}
	
	@Test
	@Parameters({"URL"})
	public void parameterizationTest(String urlName) {
		System.out.println("Parameterized url: "+urlName);
	}
}
