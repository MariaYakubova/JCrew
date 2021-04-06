package com.cybertek.jcrew.step_definitions;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class JCrewTest {
    @Test
    public void test(){

        baseURI="https://jcrew.com";
        basePath="/data/v1/US/enhance-category/womens_category/";
        Response response=get("sweaters").prettyPeek();
        //pullover/puffsleeve-ribbed-sweater/AX561
        ///data/v1/US/enhance-category/womens_category/belts
//        Response response=
//                given()
//                .queryParam()
        assertThat(response.statusCode(), is(200));

    }
}









