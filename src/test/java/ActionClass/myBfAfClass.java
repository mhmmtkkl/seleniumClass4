package ActionClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class myBfAfClass {

	@BeforeTest
	public void beforeTests() {
		
		WebDriver driver = MyDriver.GetDriver();
		
		driver.get("https://www.etsy.com/");
				
	}
}
