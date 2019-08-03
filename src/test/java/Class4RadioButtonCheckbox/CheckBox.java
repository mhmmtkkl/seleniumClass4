package Class4RadioButtonCheckbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement inputElement = driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		
//		searching teddy bear
		inputElement.sendKeys("teddy bear");
		
		WebElement SearchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
		
//		clicking on search button
		SearchButton.click();
		
		
		
	}
}
