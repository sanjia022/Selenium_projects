package testNG_program;

import org.testng.annotations.Test;

public class TestAnnotation {
	
	@Test(priority = 1, invocationCount = 2)
	 public void method() {
		System.out.println("method");
	}
	
	@Test 
	public void method1 () {
		System.out.println("method1");
	}
	
	@Test(priority = 2, invocationCount = 3)
	
	public void method2() {
		System.out.println("method2");
	}

}
