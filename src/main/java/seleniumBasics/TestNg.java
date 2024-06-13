package seleniumBasics;
import org.testng.annotations.*;

public class TestNg {
	
	@Test(timeOut = 2000)
	public void TimeTest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("will throw an edit message...");
	}

}
