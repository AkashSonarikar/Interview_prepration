package Post.Method;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.matcher.RestAssuredMatchers.*;


public class Example22 {
	
	@Test
	public void postmethod() {
		
		JSONObject response= new JSONObject();
		
		response.put("Name","Venkatesh");
		response.put("job","Doctor");
		response.put("Degree","MBBS");    // NEW code added for Git
		
		System.out.println(response.toJSONString());
		
		given().body(response.toJSONString()).
		   contentType(ContentType.JSON).accept(ContentType.JSON).
		   when().post("Url Given by Dev").
		   then().statusCode(201).log().all();
		
	}

}
