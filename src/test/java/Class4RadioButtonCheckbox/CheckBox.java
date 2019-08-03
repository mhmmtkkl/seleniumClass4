package Class4RadioButtonCheckbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		
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
		
		WebElement checkBoxFreeShipping = driver.findElement(By.xpath("//label[contains(text(),'FREE shipping')]"));
		
		checkBoxFreeShipping.click();
		
		WebElement checkBoxOnSale = driver.findElement(By.xpath("//label[contains(text(),'On sale')]"));
		
		checkBoxOnSale.click();
		
		WebElement checkBox1BusinessDay = driver.findElement(By.xpath("//label[contains(text(),'1 business day')]"));
		
		checkBox1BusinessDay.click();
		

		WebElement checkBoxBlack = driver.findElement(By.xpath("//label[contains(text(),'Black')]"));
		
		checkBoxBlack.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		checkBoxFreeShipping = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'FREE shipping')]")));
		  
		WebElement e1 = driver.findElement(By.xpath("//input[@aria-label='FREE shipping']"));
//		is free shipping selected 
		boolean FreeShippingisSelected = e1.isSelected();
		System.out.println("freeshipping"+ FreeShippingisSelected);
		Assert.assertTrue(FreeShippingisSelected);
		
		
//		is on sale selected 
		WebElement e2 = driver.findElement(By.xpath("//input[@aria-label='On sale']"));
		boolean OnSaleisSelected = e2.isSelected();
		System.out.println("OnSaleisSelected" + OnSaleisSelected);
		Assert.assertTrue(OnSaleisSelected);
		
		WebElement e3 = driver.findElement(By.xpath("//input[@aria-label='1 business day']"));
//		is 1 business day selected 
		boolean C1BusinessDayisSelected = e3.isSelected();
		System.out.println("C1BusinessDayisSelected"+ C1BusinessDayisSelected);
		Assert.assertTrue(C1BusinessDayisSelected);
		
		WebElement e4 = driver.findElement(By.xpath("//input[@aria-label='Black']"));
//		is Black selected 
		boolean checkBoxBlackisSelected = e4.isSelected();
		System.out.println("checkBoxBlackisSelected"+ checkBoxBlackisSelected);
		Assert.assertTrue(checkBoxBlackisSelected);
	
		WebElement e5 = driver.findElement(By.xpath("//input[@aria-label='Bronze']"));
//		is Black selected 
		boolean checkBoxBronzisSelected = e5.isSelected();
		System.out.println("checkBoxBronzisSelected"+ checkBoxBronzisSelected);
		Assert.assertFalse(checkBoxBronzisSelected);
		
		
	}
}
