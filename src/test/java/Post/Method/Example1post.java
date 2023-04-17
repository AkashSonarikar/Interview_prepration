package Post.Method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Example1post {
	
	
	@Test
	public void postMethod() {
		
		JSONObject request= new JSONObject(); // Create an object of JSONObject class
		
		request.put("name", "mahesh");
		request.put("job","Quality Analyst");
		
		System.out.println(request.toJSONString());
		
          given().body(request.toJSONString()).
		              contentType(ContentType.JSON).accept(ContentType.JSON).
		  when().post("https://reqres.in/api/users").
		  then().statusCode(201).log().all();
		
		
	}

}
