package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumbasics {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ikhaisarbash\\OneDrive - DXC Production\\Documents\\edgedriver_win64\\GitHub\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// Launch website
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='RNmpXc'])[2]")));

	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    new Actions(driver).doubleClick(element).build().perform();
		System.out.println("IRFAN MS ");
	}

}
