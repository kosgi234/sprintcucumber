package curdopertion;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutMethod {
	@Test
	public void Put() {
		JSONObject obj = new 	JSONObject();
		obj.put("entryFees",1200);

		obj.put("pin",123);
		obj.put("placeAddress","vinyak");
		obj.put("placeName","hyd");
		obj.put("timing","");
		given()
	.contentType(ContentType.JSON)
		.body(obj)
		.when().post("http://localhost:8080/tourist")
		.then().assertThat().statusCode(200).log().all();
	}

}
	
		