package skipTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class skipTC {
	
	@Test
	public void login() {
		Assert.assertEquals(0, 10);
	}
	@Test(dependsOnMethods="login")
	public void logout () {
		
	}

}
