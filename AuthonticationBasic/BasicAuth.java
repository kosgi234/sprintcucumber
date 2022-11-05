package AuthonticationBasic;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;




public class BasicAuth {
	@Test
	
	public void basicAuth() {
		
		
		baseURI="http://github.com/";
		
		given().auth().basic("kosgi234","Kosgi@146")
        .when().get("/login")
        .then().log().all();
		
	}

}
