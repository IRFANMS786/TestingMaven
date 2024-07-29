package amazonApplication;

import org.testng.Assert;

public class DataValidations_WithScreenData {
	public static void ValidateTextonScreen_Equals(String actualValue, String expectedValue)
			throws java.lang.AssertionError, Exception {

		System.out.println("actualvalue:" + actualValue);
		System.out.println("expectedValue:" + expectedValue);

		try {
			Assert.assertEquals(true, actualValue.trim().equals(expectedValue.trim()));
		} catch (java.lang.AssertionError e) {

			e.printStackTrace();

			// BaseClass.driver.quit();

			Assert.fail();
		}
		System.out.println("Validation success");
	}

}
