package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;

public class getCucumber {
	Response res;
	ValidatableResponse validate;
	@When("user wants to get the data by using an api is {string}")
	public void user_wants_to_get_the_data_by_using_an_api_is(String string) {
	    res = RestAssured.get( string);
	}

	@Then("user validates the status code is {int}")
	public void user_validates_the_status_code_is(Integer int1) {
	 validate = res.then();
	validate.assertThat().statusCode(int1).log().all();
	
	}
	

}
