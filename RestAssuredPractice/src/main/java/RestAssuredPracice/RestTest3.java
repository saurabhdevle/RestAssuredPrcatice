package RestAssuredPracice;


import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class RestTest3 {
	
	
	public static void main(String[] args) {
		

		RestAssured.baseURI = "http://216.10.245.166";
		given().log().all().header("content-type", "application/json")
		.body(payLoad.getCreateBook())
		.when().post("Library/Addbook.php")	
		.then().log().all().assertThat().statusCode(200);
		
		
		
		
	}

}
