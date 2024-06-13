package seleniumBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PerformDifferentBroweserActions {

	@Test
	public void actions() {
		BaseClass.launchDriver();
		BaseClass.launchWebsite("http://www.google.com/");
		BaseClass.windowsize();

	}

	@AfterTest
	public void EndtheTest() {
		System.out.println("End the Test...");
	}

}
