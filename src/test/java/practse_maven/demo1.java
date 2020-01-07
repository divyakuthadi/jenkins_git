package practse_maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
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
		Assert.assertEquals(20, a-b);
		

}
	@Test
	public void test3() {
		int a = 40;
		int b= 20;
		int c = a * b;
		System.out.println(c);
		Assert.assertEquals(800, a*b);
		
}}