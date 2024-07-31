package programming_Problems;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;

public class ApiTest {
	@Test
	public void testApiEndpoint() {
		RestAssuredConfig config = RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation());

		Response response = (Response) RestAssured.given().config(config).get("https://www.google.co.in/");

		assertEquals(200, response.getState());
	}

}
