package Class2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

 

public class FirstCLassLocatorsexercises {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.nike.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Shop'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@alt='Nike Air Max 200 (2000 World Stage)']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		String slecetsize = driver.findElement(By.xpath("(//span[text()='Please select a size.'])[1]")).getText();
		
		String expected= "Please select a size.";
		
		Assert.assertEquals(slecetsize, expected);
		
		System.out.println("Text is displayed ");
		
		
		
		
	}

}
