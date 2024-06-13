package amazonApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	WebDriver driver = null;
 
	public WebDriver createInstance(String browserName) {
 
		ChromeOptions options = new ChromeOptions();
		switch (browserName.toLowerCase()) {
 
		case "chrome":
			System.setProperty("webdriver.chrome.driver", BaseClass.driverpath+"\\chromedriver\\chromedriver.exe");
			options.addArguments("--remote-allow-origins=*");
			options.setBinary(BaseClass.driverpath+"\\chrome\\chrome.exe");
			driver = new ChromeDriver(options);
			break;
 
		case "chromeheadless":
			System.out.println("Chrome Browser name: " + browserName);
 
			System.setProperty("webdriver.chrome.driver", BaseClass.driverpath+"\\chromedriver\\chromedriver.exe");

			options.addArguments("--headless=chrome");
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("window-size=1552, 840");
			options.setBinary(BaseClass.driverpath+"\\chrome\\chrome.exe");
			
			driver = new ChromeDriver(options);
			break;
		case "chrome_incognito":
			System.out.println("Chrome Browser name: " + browserName);
			System.setProperty("webdriver.chrome.driver", BaseClass.driverpath+"\\chromedriver\\chromedriver.exe");
			options.addArguments("--incognito");
			options.setBinary(BaseClass.driverpath+"\\chrome\\chrome.exe");
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.addArguments("-private");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(foptions);
			break;
 
		case "ie":
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			ieOptions.addCommandSwitches("-private");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver(ieOptions);
			break;
		case "edge":
			System.out.println("Edge Browser name: " + browserName);
			EdgeOptions edgeoption = new EdgeOptions();
			edgeoption.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(edgeoption);
			break;
 
		default:
			ChromeOptions doptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", BaseClass.driverpath+"\\chromedriver\\chromedriver.exe");
			doptions.setBinary(BaseClass.driverpath+"\\chrome\\chrome.exe");
			driver = new ChromeDriver(doptions);
			
		}
		return driver;
	}
 
}
