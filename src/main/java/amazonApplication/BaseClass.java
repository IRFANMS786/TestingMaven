package amazonApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static final String XPATH = System.getProperty("user.dir") + "\\resources" + "\\xpath.properties";
	public static final String driverpath = "C:\\Selenium";
	public static WebDriver driver;
	static BrowserFactory browserFactory = new BrowserFactory();

	static Properties properties = new Properties();

	public static Properties FISProb() throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream(XPATH);
		Properties prop = new Properties();
		Thread.sleep(5000);
		prop.load(file);

		return (prop);
	}

	public static void launchDriver(String browser) {
		DriverControl.getInstance().setDriver(browserFactory.createInstance(browser));

		driver = DriverControl.getInstance().getDriver();
		driver.manage().window().maximize();

		// driver.manage().window().setSize(new Dimension(1552, 840));
		System.out.println("Window Size:" + BaseClass.driver.manage().window().getSize());
		// driver.get(url);

	}

	public static void launchWebsite(String url) {
		driver.navigate().to(url);

	}

	public static String prop(String key) throws Exception {
		FileInputStream file = new FileInputStream(XPATH);
		properties.load(file);
		String value = properties.get(key).toString();
		if (StringUtils.isEmpty(value)) {
			throw new Exception("Value is not specified for key" + key + "in properties  file");
		}
		return value;
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
