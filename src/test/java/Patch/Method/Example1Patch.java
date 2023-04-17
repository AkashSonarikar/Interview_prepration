package Patch.Method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Example1Patch {
	
	
	@Test
	public void patchMethod() {
		
		JSONObject request= new JSONObject();
		
		request.put("name","Akash");
		request.put("job","QA");
		
		System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		given().body(request.toJSONString()).
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		when().patch("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();		
	}

}
