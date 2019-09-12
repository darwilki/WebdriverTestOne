package WebdriverTestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		

public class TestOne {
	
private WebDriver driver;

String eTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
String aTitle = "";

	@Test
	public void guru99tutorials() {
		driver.get("http://www.guru99.com/");
		aTitle = driver.getTitle();
		System.out.println(aTitle);
		
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		Assert.assertTrue(aTitle.equals(eTitle));
	}
		
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darwilki\\Documents\\Selenium\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}	
		
		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		

}
