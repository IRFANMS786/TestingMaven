package amazonApplication;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login {
	@Test
	public static void LoginToApplication() throws Exception {
		BaseClass.launchDriver("chrome_incognito");

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

	}

}
