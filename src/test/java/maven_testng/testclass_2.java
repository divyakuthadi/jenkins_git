package maven_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass_2 {
	@Test
	public void browser() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement month = driver.findElement(By.name("birthday_month"));
		List<WebElement> dropdown = driver.findElements(By.id("month"));
		System.out.println("the size of dropdwun is "  +dropdown.size());
		for(int i = 0; i<dropdown.size(); i++ ) {
		
		System.out.println("the values of list of contents: "  +dropdown.get(i) );
		driver.quit();
		
		}
	}
	}


