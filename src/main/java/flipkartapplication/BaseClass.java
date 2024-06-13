package flipkartapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void launchDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ikhaisarbash\\OneDrive - DXC Production\\Documents\\edgedriver_win64\\GitHub\\msedgedriver.exe");
		driver = new EdgeDriver();

	}

	public static void launchWebsite(String url) {
		driver.navigate().to(url);

	}
	public static void windowsize() {
		// Ensure the driver is initialized
		if (driver == null) {
			throw new IllegalStateException("Driver is not initialized. Please call launchDriver() first.");
		}

		driver.manage().window().maximize();

		System.out.println("Window Size:" + driver.manage().window().getSize());
	}

}
