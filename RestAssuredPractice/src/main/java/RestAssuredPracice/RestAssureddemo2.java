package RestAssuredPracice;


import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class RestAssureddemo2 {

	
	
	
	public static void main(String[] args) {
          
		
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		given().log().all().header("content-type", "application/json")
		//.body("{\"name\":\"Saurabh.\",\"salary\":\"50000\",\"age\":\"34\"}")
		.when().get("/api/v1/employees")	
		.then().log().all();
		

	}
	
	
		
	}


