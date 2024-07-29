package amazonApplication;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Login {
	@Test
	public static void LoginToApplication() throws Exception {

		String url = "https://www.amazon.in/";

		System.out.println("url:" + url);

		String userName = "Irfanms1997@gmail.com";

		System.out.println("UserId:" + userName);

		String password = "Iktfa@007";

		System.out.println("password:" + password);

		BaseClass.driver.get(url);
		// To maximize the browser
		BaseClass.driver.manage().window().maximize();
		BaseClass.driver.findElement(By.xpath(BaseClass.prop("LoginScreen_Sigin"))).click();
		BaseClass.driver.findElement(By.xpath(BaseClass.prop("LoginScreen_Email"))).sendKeys(userName);
		BaseClass.driver.findElement(By.xpath(BaseClass.prop("LoginScreen_Contniue"))).click();

		BaseClass.driver.findElement(By.xpath(BaseClass.prop("LoginScreen_Password"))).sendKeys(password);

		BaseClass.driver.findElement(By.xpath(BaseClass.prop("LoginScreen_Submit"))).click();

		Thread.sleep(3000);
		Properties prop = BaseClass.FISProb();

		System.out.println("pageName:" + BaseClass.driver.getTitle());
		WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, Duration.ofMillis(500000));
		WebElement getScreenName;
		getScreenName = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Home_Screen_Name"))));

		String actualScreenName = getScreenName.getText();
		System.out.println("Inside Wait function - Screen Name:" + actualScreenName);
		System.out.println("Waited Successfully until the Hone Screen loads");
		System.out.println("Title:" + BaseClass.driver.getTitle());

		Thread.sleep(10000);
		System.out.println("Title:" + BaseClass.driver.getTitle());

	}

}
