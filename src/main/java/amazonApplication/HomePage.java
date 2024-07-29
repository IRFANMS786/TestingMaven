package amazonApplication;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static void clickonsearchicon() throws Exception {

		Properties prop = BaseClass.FISProb();
		System.out.println("Search Product -------------");

		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement searchproduct;
		searchproduct = BaseClass.driver.findElement(By.xpath(prop.getProperty("Home_SearchIcon")));
		searchproduct.click();

	}

	public static void clickSeachProuct() throws Exception {

		Properties prop = BaseClass.FISProb();
		System.out.println("Navigate to Search Product -------------");

		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement searchproduct;
		searchproduct = BaseClass.driver.findElement(By.xpath(prop.getProperty("Home_SearchProuct")));
		searchproduct.click();

		System.out.println("Click on Search Icon  Clicked Successfully---------------------");

	}

	public static void enterProduct(String product) throws Exception {

		Properties prop = BaseClass.FISProb();
		System.out.println("Enter Product -------------");

		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement searchproduct;
		searchproduct = BaseClass.driver.findElement(By.xpath(prop.getProperty("Home_SearchProuct")));
		searchproduct.sendKeys(product);

		System.out.println("Product Enter Successfully---------------------");

	}

	public static void clickCartIcon() throws Exception {

		Properties prop = BaseClass.FISProb();
		System.out.println("NavigateTo Cart Icon ---------------------");

		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement searchproduct;
		searchproduct = BaseClass.driver.findElement(By.xpath(prop.getProperty("Home_CartIcon")));
		searchproduct.click();
		System.out.println("Cart Page is Displayed  Successfully---------------------");

	}

}
