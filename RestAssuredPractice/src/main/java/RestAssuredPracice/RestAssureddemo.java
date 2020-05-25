package RestAssuredPracice;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class RestAssureddemo {

	// Request-> EndPoint
	// Method request Type -> PUT/POST/DELETE/GET
	// Body -> if any
	// Header -> Key Value format

	// Response -> Staus code
	// Response body
	// Response Header

	public static void main(String[] args) {

		RestAssured.baseURI = "http://dummy.restapiexample.com";
		given().log().all().header("content-type", "application/json")
				.body("{\"name\":\"Saurabh.\",\"salary\":\"50000\",\"age\":\"34\"}").when().post("/api/v1/create")
				.then().log().all();
		
		

	}

}
