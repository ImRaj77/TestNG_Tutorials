package com.test.basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

	@Test(groups= {"Smoke"})
	public void homeLogin() {
		System.out.println("Executed homeLogin test case Successfully");
	}
	
	@Test
	@Parameters({"URL"})
	public void homeSignUp(String url) {
		System.out.println("Executed homeSignUp test case Successfully");
		System.out.println("Url is : "+url);
	}
	
	@Test
	public void homeLogout() {
		System.out.println("Executed homeLogout test case Successfully");
	}
}
