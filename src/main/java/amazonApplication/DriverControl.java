package amazonApplication;

import java.io.Serializable;

import org.openqa.selenium.WebDriver;



public class DriverControl implements Serializable {

	private static final long serialVersionUID = 1L;

	private DriverControl() {
	}

	private static DriverControl instance = new DriverControl();

	public static DriverControl getInstance() {

		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public void setDriver(WebDriver driverParam) {
		driver.set(driverParam);
	}

	public WebDriver getDriver() {
		return driver.get();
	}

	public void closeBrowser() {
		driver.get().quit();
		driver.remove();
	}

}
