package com.cybertek.jcrew.test;

import com.cybertek.jcrew.pojo.JCrew;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JCrew2 {
    @BeforeAll
    public static void init() {
        baseURI = "https://www.jcrew.com";
        basePath = "/data/v1/US/products/full/AX560/c/womens_category/sweaters/pullover";
    }
    @AfterAll
    public static void cleanup() {
        reset();
    }

    @Test
    public void ProductNameCodeVerify(){
        JsonPath jp= get().prettyPeek().jsonPath();

        System.out.println(jp.getString("details.productName"));
        System.out.println(jp.getString("details.productCode"));
        JCrew jCrew=jp.getObject("details",JCrew.class);
        System.out.println("jCrew = " + jCrew);
        assertThat(jCrew.getProductName(), is(containsString("Short-sleeve sweater in textured stripe")));
        assertThat(jCrew.getProductCode(), is(containsString("AX560")));

        ////a[@data-qaid='itemName0']


    }

    @Test
    public void StatusCodeVerify() {
        Response response=get().prettyPeek();
        assertThat(response.statusCode(), is (equalTo(200)));



    }

    @Test
    public void Content_typeVerify() {
        Response response=get().prettyPeek();
        assertThat(response.contentType(), is(containsString("application/json")));


    }

}


