package amazonApplication;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1SearchProduct {

	@Test(priority = 1, groups = "CreateTestData")
	public static void testCase1SearchProduct() throws Exception {
		Login.LoginToApplication();
		String product = "realme 12 pro plus 5g";
		BaseClass.driver.findElement(By.xpath(BaseClass.prop("Home_SearchProuct"))).sendKeys(product);
		BaseClass.driver.findElement(By.xpath(BaseClass.prop("Home_Search"))).click();
		
		
		
		
		

	}

}
