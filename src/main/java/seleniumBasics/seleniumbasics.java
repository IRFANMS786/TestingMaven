package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumbasics {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ikhaisarbash\\OneDrive - DXC Production\\Documents\\edgedriver_win64\\GitHub\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// Launch website
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		driver.getWindowHandle();
		System.out.println("IRFAN MS ");
	}

}
