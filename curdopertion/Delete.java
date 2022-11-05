package curdopertion;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Delete {
	@Test
	public void getAllProjects() {
			  
			 when()
			    .delete("http://localhost:8080/tourist?tId=SATYA_TOURIST_00104")
			 .then()
			    .log().all()
			    .assertThat().statusCode(404);
		
		}

}


