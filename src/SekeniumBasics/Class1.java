package SekeniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		List<WebElement> alllinks= driver.findElements(By.tagName("a"));
		
		List<String> txtLinks= new ArrayList<>();
        for(int i=0;i<alllinks.size();i++) {
            txtLinks.add(alllinks.get(i).getText());
            System.out.println(txtLinks.get(0));

		
//		driver.findElement()
	}

}
