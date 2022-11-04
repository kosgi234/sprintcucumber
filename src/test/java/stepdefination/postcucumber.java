package stepdefination;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class postcucumber {
	RequestSpecification req;
	ValidatableResponse validate ;
	Response res;
	
	
	
	
	@Given("a user is able to provide the data")
	public void a_user_is_able_to_provide_the_data() {
		JSONObject obj = new 	JSONObject();
		obj.put("entryFees",1100);
		obj.put("pin",127);
		obj.put("placeAddress","gdg");
		obj.put("placeName","mysr");
		obj.put("timing","");
		req = RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	}

	@When("a user create a data by using an url :{string}")
	public void a_user_create_a_data_by_using_an_url(String url) {
		 res = req.post(url);
	}

	@Then("a user validate status code is {int}")
	public void a_user_validate_status_code_is(Integer int1) {
		  validate = res.then();  
		  validate.assertThat().statusCode(int1).log().all();
	}


}
