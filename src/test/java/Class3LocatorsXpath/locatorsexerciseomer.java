package Class3LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsexerciseomer {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.sahibinden.com/en");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchText")).sendKeys("honda s2000");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'MASRAFSIZ KUSURSUZ S2K')]")).click();
		
		
		
	}

}
