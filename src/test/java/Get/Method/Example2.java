package Get.Method;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class Example2 {
	
	
	@Test
	public void getmethod() {
		
		given().get("https://reqres.in/api/users?page=2").
		       then().statusCode(200).
		                     //       body("data[1].id",equalTo(8));
		
		              body("data.first_name",hasItems("Michael","Lindsay")).
		                                  log().all();
	
		
	}

}
