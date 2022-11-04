package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Deletecucumber {
	Response response;
	ValidatableResponse validate;
	@When("user wants to delete the data by using an url is {string}")
	public void user_wants_to_delete_the_data_by_using_an_url_is(String url) {
		 response = RestAssured.get(url);
	}

	@Then("use able to validates the status code of the id is {int}")
	public void use_able_to_validates_the_status_code_of_the_id_is(Integer int1) {
		    validate = response.then();
		    validate.assertThat()
		    .statusCode(int1).log().all();
	}

}
