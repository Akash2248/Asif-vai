package SekeniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DifferentActions {
	
	
WebDriver driver;
    
    public void initiateBrowser() {
        System.setProperty("webdriver.chrome.driver","/Users/mohammad/Documents/GitHub/Asif-vai/Drivers/chromedriver");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");
        
        
    driver = new ChromeDriver();
    driver.get("https:\\www.facebook.com");
    driver.manage().window().maximize();
    }
//	public void clickElement() {
//
//		System.setProperty("webdriver.chrome.driver", "/Users/mohammad/Documents/GitHub/Asif-vai/Drivers/chromedriver");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https:\\www.facebook.com");
//		driver.manage().window().maximize();
		
		
//		driver.findElement(By.xpath("//a[@href='/login/']")).click();
//		
//		for(int i=0;i<alllinks.size();i++) {
//	           txtLinks.add(alllinks.get(i).getText());
//	           if (txtLinks.get(i) =="Log In") {
//	               driver.findElement(By.linkText("Log In")).click();
//	           }
//	           System.out.println(txtLinks.get(i));
//	       }
//	       driver.quit();
 

	
//	public void clickRadiobutton() {
//
//		System.setProperty("webdriver.chrome.driver", "/Users/mohammad/Documents/GitHub/Asif-vai/Drivers/chromedriver");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https:\\www.facebook.com");
//		driver.manage().window().maximize();
//		
		
		
	

	
	@Test
    public void selectDropdown(){
        initiateBrowser();
//        driver = new ChromeDriver();
    Select month= new Select(driver.findElement(By.id("month")));
    month.selectByVisibleText("Oct");
    Select day= new Select(driver.findElement(By.id("day")));
    day.selectByIndex(14);
    Select year= new Select(driver.findElement(By.id("year")));
    year.selectByValue("1996");
    
    
    
        
    }
	
	@Test
	public void typeTextBox() {
//		initiateBrowser();
	    driver.findElement(By.name("firstname")).click();
	    driver.findElement(By.name("firstname")).clear();
	    driver.findElement(By.name("firstname")).sendKeys("Mohammad");
	    driver.findElement(By.name("lastname")).click();
	    driver.findElement(By.name("lastname")).clear();
	    driver.findElement(By.name("lastname")).sendKeys("Islam");
	    driver.findElement(By.name("reg_email__")).click();
	    driver.findElement(By.name("reg_email__")).clear();
	    driver.findElement(By.name("reg_email__")).sendKeys("mislam@languagehs.org");
	}
}

