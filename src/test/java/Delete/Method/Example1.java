package Delete.Method;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Example1 {
	
	@Test
	public void deleteMethod() {
		
       when().delete("https://reqres.in/api/users/2").
                 then().statusCode(204).log().all();
	}

}
