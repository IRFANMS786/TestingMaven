package amazonApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static final String XPATH = System.getProperty("user.dir") + "\\resources" + "\\xpath.properties";
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

	static Properties properties = new Properties();

	public static String prop(String key) throws Exception {
		FileInputStream file = new FileInputStream(XPATH);
		properties.load(file);
		String value = properties.get(key).toString();
		if (StringUtils.isEmpty(value)) {
			throw new Exception("Value is not specified for key" + key + "in properties  file");
		}
		return value;
	}

	public static Properties FISProb() throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream(XPATH);
		Properties prop = new Properties();
		Thread.sleep(5000);
		prop.load(file);

		return (prop);
	}

}
