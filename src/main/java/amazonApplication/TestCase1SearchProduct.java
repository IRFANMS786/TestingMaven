package amazonApplication;

import org.testng.annotations.Test;

public class TestCase1SearchProduct {

	@Test(priority = 1, groups = "SearchProduct")
	public static void testCase1SearchProduct() throws Exception {
		BaseClass.launchDriver("edge");
		Login.LoginToApplication();
		String product = "realme 12 pro plus 5g";
		HomePage.clickSeachProuct();
		HomePage.enterProduct(product);
		HomePage.clickonsearchicon();

	}

}
