package AuthonticationBasic;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class BearerToken {

@Test
public void bearerToken() {



baseURI="https://api.github.com";

JSONObject obj=new JSONObject();

obj.put("name", "BasicAuth12");

given().auth().oauth2("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")
.body(obj).contentType(ContentType.JSON)
.when().post("/user/repos")
.then().log().all();

}

}

