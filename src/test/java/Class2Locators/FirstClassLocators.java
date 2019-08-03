package Class2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 

public class FirstClassLocators {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		 	
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		String searchThing = "hasdsarmi";
		
		driver.findElement(By.id("search")).sendKeys(searchThing);
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		String url = driver.getCurrentUrl();
		
		org.testng.Assert.assertTrue(url.contains(searchThing));
		
	}
	
	
}
