package Class3LocatorsXpath;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumClass4730 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
//		maximazing the window 
		driver.manage().window().maximize();
		
//		navigating to google.com
		driver.get("https://www.google.com/?gws_rd=ssl");
		
//		searchin in the google .com
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("etsy");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		
//		Clicking on the first search item in google 
		driver.findElement(By.xpath("//h3[@class='sA5rQ']")).click();
		
//		searching in the etsy
		driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("teddy Bear");
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
//		get text in the input field 
		String text_metho = driver.findElement(By.xpath("//input[contains(@id,'search')]")).getText();
		
//		get attrbute in the input field 
		String attribute_metho = driver.findElement(By.xpath("//input[contains(@id,'search')]")).getAttribute("value");
		
		System.out.println(text_metho+" get text here");
		
		System.out.println(attribute_metho + " get attribute here ");
		
//		total item in the search page 
		int total_item = driver.findElements(By.xpath("//h2[@class='text-gray text-truncate mb-xs-0 text-body']")).size();
		
		System.out.println(total_item);
		
		Random rnd = new Random();
		
		int myRandom = rnd.nextInt(total_item-1)+1;
		
		System.out.println(myRandom);
		
//		clicking on the any item in the search page 
		driver.findElement(By.xpath("(//h2[@class='text-gray text-truncate mb-xs-0 text-body'])["+myRandom+"]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
//		storing the window name in the string 
		String currentPage = driver.getWindowHandle();
		
//		switching the window
		Set<String> windows = driver.getWindowHandles();
		
		for(String handle : windows) {
			
			System.out.println(handle);
			
			driver.switchTo().window(handle);
			
		}
		
		System.out.println(driver.getCurrentUrl());
		
//		 getting the total count of input in the item page 
		int inputSize = driver.findElements(By.xpath("//textarea[@id='personalization-input']")).size();
		 
//		filing the input field if it is more then 0
		for (int i = 1; i <= inputSize; i++) {
			 
			driver.findElement(By.xpath("(//textarea[@id='personalization-input'])["+i+"]")).sendKeys("Omer");;
			
		}
		
//		getting the total count of the dropdown
		int dropdownSize = driver.findElements(By.xpath("//select[contains(@id,'inventory-variation')]")).size();
		
//		clicking on the any second option in the dropdown
		for(int i=1 ; i<=dropdownSize; i++) {
			
			WebElement myElement = driver.findElement(By.xpath("(//select[contains(@id,'inventory-variation')])["+i+"]"));
			
			Select s1 = new Select(myElement);

			s1.selectByIndex(2);
			
			Thread.sleep(1000);
		}
		
//		Clicking on the add to cart button 
		 driver.findElement(By.xpath("//div[text()='Add to cart']")).click();
		
		 driver.close();
		 
		 driver.switchTo().window(currentPage);
		 
		 driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--transparent wt-btn--icon wt-btn--small wt-position-absolute wt-position-right wt-mt-xs-1 wt-z-index-9 wt-animated wt-animated--appear-01  search-close-btn-margin-right']")).click();
			
		 int sizeSecondAddtoCart = driver.findElements(By.xpath("(//button[text()='Add to Cart'])[2]")).size();
		 
		 if(sizeSecondAddtoCart>0) {
			 
			 driver.findElement(By.xpath("(//button[text()='Add to Cart'])[2]")).click();
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
