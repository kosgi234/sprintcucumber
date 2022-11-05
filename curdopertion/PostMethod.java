package curdopertion;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostMethod {
	@Test
	public void Post() {
		JSONObject obj = new 	JSONObject();
		obj.put("entryFees",1200);

		obj.put("pin",123);
		obj.put("placeAddress","gdag");
		obj.put("placeName","mysor");
		obj.put("timing","");
		given()
	.contentType(ContentType.JSON)
		.body(obj)
		.when().post("http://localhost:8080/tourist")
		.then().assertThat().statusCode(200).log().all();
	}

}
//{
//	  "entryFees": 0,
//	  "pin": 0,
//	  "placeAddress": "string",
//	  "placeName": "string",
//	  "tId": "string",
//	  "timing": "string"
//	}