package Class1Intorduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowserexercises2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		 
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().fullscreen();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		driver.close();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		WebDriver driver2;
		driver2 = new ChromeDriver();
		
		driver2.get("https://www.techno.study/");
		
		driver2.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	

}
