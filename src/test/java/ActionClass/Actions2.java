package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions2 {

	 WebDriver driver = MyDriver.GetDriver();
	
		@BeforeTest
		public void beforeTests() {
			
		 
			
			driver.get("https://www.etsy.com/");
					
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
	 
	
	@Test
	public void firstTest() {
		 
		
		WebElement ToysnEntertainmend =driver.findElement(By.xpath("//span[contains(text(),'Toys & Entertainment')]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(ToysnEntertainmend).perform();
		
		WebElement clickElement = driver.findElement(By.xpath("//ul[@class='list-unstyled pb-xs-2']//a[contains(text(),'Art & Photography Books')]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='list-unstyled pb-xs-2']//a[contains(text(),'Art & Photography Books')]")));
		
		clickElement.click();
		
		
		
	}
	 
}
