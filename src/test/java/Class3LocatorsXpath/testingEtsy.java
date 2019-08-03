package Class3LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testingEtsy {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/?ref=lgo");
		
		driver.manage().window().maximize();
		
		//searchin in the search bar
		driver.findElement(By.xpath("(//input[contains(@id,'search')])[1]")).sendKeys("teddy bear");
		
//		click on the search icon 
		driver.findElement(By.xpath("//button[@value='Search']")).click();
		
//		Get current window name 
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		
		String firstText = driver.findElement(By.xpath("(//h2[@class='text-gray text-truncate mb-xs-0 text-body'])[1]")).getText();
		
//		 clicking on the first item
		driver.findElement(By.xpath("(//h2[@class='text-gray text-truncate mb-xs-0 text-body'])[1]")).click();
		
		

		
//		Switching to the second page 
		for(String winHandle : driver.getWindowHandles()) {
			
			driver.switchTo().window(winHandle);
			
		}
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		String actuallresultv= driver.findElement(By.xpath("//h1[@class='override-listing-title normal break-word mb-xs-2']")).getText();
	
		Assert.assertEquals(firstText, actuallresultv);
	
		System.out.println(firstText+"   -----   "+ actuallresultv);
	
////		clicking on the add to cart
//		driver.findElement(By.xpath("//div[@class='btn-text']")).click();
//		
//		driver.findElement(By.xpath("//a[@class='text-small text-link-secondary']")).click();
//		
//		driver.navigate().refresh();
//		
//		String yourcart = driver.findElement(By.xpath("//div[@class='h2 text-headline-smaller pt-xs-2 pb-xs-2']")).getText();
//		
//		String expectedresult = "Your cart is empty.";
//		
//		Assert.assertEquals(yourcart, expectedresult);
//		
//		
//		System.out.println("yourcart equals to expecredresult "+yourcart.equals(expectedresult));
		
		driver.close();
		
		driver.switchTo().window(currentWindow);
		
		String secondText = driver.findElement(By.xpath("(//h2[@class='text-gray text-truncate mb-xs-0 text-body'])[2]")).getText();
		
//		 clicking on the first item
		driver.findElement(By.xpath("(//h2[@class='text-gray text-truncate mb-xs-0 text-body'])[2]")).click();
		
		

		
//		Switching to the second page 
		for(String winHandle : driver.getWindowHandles()) {
			
			driver.switchTo().window(winHandle);
			
		}
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		 actuallresultv= driver.findElement(By.xpath("//h1[@class='override-listing-title normal break-word mb-xs-2']")).getText();
	
		Assert.assertEquals(secondText, actuallresultv);
	
		System.out.println(secondText + actuallresultv);
		
		
		
		
		
		
		
	}
}
