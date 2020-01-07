package listeners_demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners_demo.testng_listener.class)
public class first_testcases {
	@Test
	public void test1() {
		int a = 10;
		int b= 20;
		int c = a + b;
		System.out.println(c);
		Assert.assertEquals(30, a+b);
		
		
			
		
	}
	@Test
	public void test2() {
		int a = 40;
		int b= 20;
		int c = a - b;
		System.out.println(c);
		Assert.assertEquals(10, a-b);
		

}
	@Test
	public void test3() {
		int a = 40;
		int b= 20;
		int c = a * b;
		System.out.println(c);
		Assert.assertEquals(800, a*b);
		
	}
	@Test
	public void test5() {
		int a = 10;
		int b= 20;
		int c = a + b;
		System.out.println(c);
		Assert.assertEquals(30, a+b);
	}
		
				
	@Test
	public void App2() {
		int a = 40;
		int b= 20;
		int c = a - b;
		System.out.println(c);
		Assert.assertEquals(20, a-b);
		
	}}


