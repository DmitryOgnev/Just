package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Test {	
   WebDriver driver;
 
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dmitry Ognev/Desktop/Java/Selenium/Selenium_files/Drivers/16_1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
}
