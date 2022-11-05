package curdopertion;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetMethod {
	@Test
	public void getAllProjects() {
			  
			 when()
			    .get("http://localhost:8080/alltourist")
			 .then()
			    .assertThat().statusCode(200)
			    .and()
			    .assertThat().contentType(ContentType.JSON)
			    .log().all();
		}

	}

 