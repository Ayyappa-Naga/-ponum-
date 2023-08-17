package com.testPractice;

import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MavenPractic {
	private ITestContext context;

	@Parameters("requestsToEnv")
	@Test
	public void setInvocationCount(ITestContext context, String requestsToEnv) {
	    this.context = context;
	    this.setInvocationCount(context, requestsToEnv);
	}
	public class MavenPractice { final 
		int a=10;
		@Test(groups="smoke")
		public void method()
		{
			System.out.println("c2 executed ");
		}
	@Test(groups = "system")
		public void method1()
		{
			System.out.println("method system  executed");
		}
	}
	

}
