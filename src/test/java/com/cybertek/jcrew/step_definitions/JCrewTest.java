package com.cybertek.jcrew.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class JCrewTest {
    @Test
    public void test() {

        baseURI = "https://jcrew.com";
        basePath = "/data/v1/US/products/full/AX560/c/womens_category/";//"/data/v1/US/enhance-category/womens_category/";
        Response response = get("sweaters").prettyPeek();
        //https://jcrew.com/data/v1/US/products/full/AX560/c/womens_category/sweaters/pullover
        //pullover/puffsleeve-ribbed-sweater/AX561
        ///data/v1/US/enhance-category/womens_category/belts

//        Response response=
//                given()
//                .queryParam()
        assertThat(response.statusCode(), is(200));
    }

    @Given("no headers are provided")
    public void no_headers_are_provided() {

    }


    @When("User send request to baseURL")
    public void userSendRequestToBaseURL() {

    }

    @And("Response status code should be {int}")
    public void responseStatusCodeShouldBe(int arg0) {

    }

    @And("header should have content Type \\/ application\\/json")
    public void headerShouldHaveContentTypeApplicationJson() {

    }

    @And("In body product name should be {string}")
    public void inBodyProductNameShouldBe(String arg0) {

    }


    @Then("In body product code should be {string}")
    public void inBodyProductCodeShouldBe(String arg0) {
    }
}










