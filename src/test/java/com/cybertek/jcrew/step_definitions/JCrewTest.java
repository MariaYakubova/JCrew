package com.cybertek.jcrew.step_definitions;

import com.cybertek.jcrew.pojo.JCrew;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class JCrewTest {

        @Given("no headers are provided")
        public void no_headers_are_provided () {
                baseURI = "https://www.jcrew.com";
                basePath = "/data/v1/US/products/full/AX560/c/womens_category/sweaters/pullover";
        }


        @When("User send request to baseURL")
        public void userSendRequestToBaseURL () {
                JsonPath jp= get().prettyPeek().jsonPath();
                JCrew jCrew=jp.getObject("details",JCrew.class);
        }

        @And("Response status code should be {int}")
        public void responseStatusCodeShouldBe ( int arg0){

        }

        @And("header should have content Type \\/ application\\/json")
        public void headerShouldHaveContentTypeApplicationJson () {

        }

        @And("In body product name should be {string}")
        public void inBodyProductNameShouldBe (String arg0){

        }


        @Then("In body product code should be {string}")
        public void inBodyProductCodeShouldBe (String arg0){
        }
    }










