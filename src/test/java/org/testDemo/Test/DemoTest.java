package org.testDemo.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void test()
	{
		System.out.println("Hello World");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("Test Pass");
		
	}
}
