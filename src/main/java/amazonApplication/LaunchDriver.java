package amazonApplication;

import org.testng.annotations.Test;



public class LaunchDriver {
	
	@Test
	public void actions() {
		BaseClass.launchDriver();
		BaseClass.launchWebsite("https://www.amazon.in/");
		BaseClass.windowsize();

	}
}
