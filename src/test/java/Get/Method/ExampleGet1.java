package Get.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExampleGet1 {
	
	@Test
	public void Getmethod() {
		
		Response response =RestAssured.get("https://reqres.in/api/users?page=2");
				
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getTime());
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getContentType());
		
		// Assertion= to Compare between expected response and Actual response
		int statusCode= response.getStatusCode();
		
		Assert.assertEquals(statusCode, 201);
		
		
		
	}

}
