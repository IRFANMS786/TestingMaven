package amazonApplication;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static void clickSeachProuct() throws Exception {

		Properties prop = BaseClass.FISProb();
		System.out.println("click Navigate to Search Product -------------");

		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement searchproduct;
		searchproduct = BaseClass.driver.findElement(By.xpath(prop.getProperty("Home_SearchProuct")));
		searchproduct.click();

	}

	public static void enterProduct(String product) throws Exception {

		Properties prop = BaseClass.FISProb();
		System.out.println("Search Product -------------");

		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement searchproduct;
		searchproduct = BaseClass.driver.findElement(By.xpath(prop.getProperty("Home_SearchProuct")));
		searchproduct.sendKeys(product);

	}

	public static void clickonsearchicon() throws Exception {

		Properties prop = BaseClass.FISProb();
		System.out.println("Search Product -------------");

		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement searchproduct;
		searchproduct = BaseClass.driver.findElement(By.xpath(prop.getProperty("Home_SearchIcon")));
		searchproduct.click();

	}

}
