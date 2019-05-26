package SekeniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void firstMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammad/Documents/GitHub/Asif-vai/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
//		driver.close();
		driver.manage().window().maximize();

		
//		driver.findElement()
	}

}
