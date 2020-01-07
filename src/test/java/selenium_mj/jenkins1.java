package selenium_mj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class jenkins1 {
	@Test(priority = 1)
	public void test1() {
		int a = 10;
		int b= 20;
		int c = a + b;
		System.out.println(c);
		Assert.assertEquals(30, a+b);
		
		
			
		
	}
	@Test(priority = 2)
	public void App2() {
		int a = 40;
		int b= 20;
		int c = a - b;
		System.out.println(c);
		Assert.assertEquals(20, a-b);
		

}

}
