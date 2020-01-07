package selenium_mj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class jenkins2 {
	@Test(dependsOnMethods = {"test2"})
	public void test_sample() {
		int a = 100;
		int b= 200;
		int c = a + b;
		System.out.println(c);
		Assert.assertEquals(300, a+b);
		System.out.println("depends om test 2");
		
		
		
			
		
	}
	@Test
	public void test2() {
		int a = 40;
		int b= 20;
		int c = a / b;
		System.out.println(c);
		Assert.assertEquals(2, a/b);
		

}

}
