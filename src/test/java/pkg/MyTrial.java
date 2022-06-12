package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
public class MyTrial {
	
	WebDriver driver;
	
	@Before
	public void setUP() {
		System.out.println("Setting up environment");
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver","/Users/pillai_amal/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void Mytest() {
		System.out.println("Test case running");
		driver.get("https://www.gutenberg.org/");
	}
	
	@After
	public void end() {
		System.out.println("Test completed");
		driver.close();
	}
}
