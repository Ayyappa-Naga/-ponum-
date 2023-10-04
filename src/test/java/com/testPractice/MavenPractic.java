package com.testPractice;

import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


	public class MavenPractic {
		@Test(groups="smoke")
		public void method()
		{
			System.out.print("hello");
			System.out.print("hello");
		}
	@Test(groups = "system")
		public void method1()
		{
			System.out.println("method system  executed");
		}
	}
	


