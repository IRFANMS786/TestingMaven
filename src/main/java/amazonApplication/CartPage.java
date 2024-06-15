package amazonApplication;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	public static void checkContentIsDisplayedForEmptyCart() throws Exception {
		Properties prop = BaseClass.FISProb();
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(BaseClass.driver, BaseClass.elementWaitTime);
		WebElement errorMessage;
		errorMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("Cart_Empty"))));
		String actualErrorMessageOnScreen = errorMessage.getText();
		String expectedErrorMessage = "Your Amazon Cart is empty.";
		DataValidations_WithScreenData.ValidateTextonScreen_Equals(actualErrorMessageOnScreen, expectedErrorMessage);
		Thread.sleep(1000);
		System.out.println("---------Content is Displayed Successfully-----------");

	}

}
