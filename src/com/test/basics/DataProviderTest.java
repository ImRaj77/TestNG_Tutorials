package com.test.basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] getData() {
		// User name , Password multiple data sets
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstUserName";
		data[0][1] = "firstPassword";
		// 2nd set
		data[1][0] = "secondUserName";
		data[1][1] = "secondPassword";
		// 3rd set
		data[2][0] = "thirdUserName";
		data[2][1] = "thirdPassword";
		
		return data;
	}

	@Test(dataProvider = "getData")
	public void test01(String userName, String password) {
		System.out.println(userName+" AND "+password);
		System.out.println("***************");
	}
}
