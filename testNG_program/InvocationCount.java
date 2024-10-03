package testNG_program;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10, priority = 1)
	
	public void testcase1()
	{
		System.out.println("1");
	}
	
	// disable TC 
	
	@Test(enabled = false)
	public void testcase2()
	{
		System.out.println("2");
	}
}
