package com.todoist.spec;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class Spec {
    static String token = "f6195222fbd6bc99cb759160cbdda6d13ea33915";
    static String baseUrl = "https://api.todoist.com/rest/v1";

    public static RequestSpecification requestGet = with()
            .header("Authorization", "Bearer " + token)
            .baseUri(baseUrl);

    public static RequestSpecification requestCreate = with()
            .header("Authorization", "Bearer " + token)
            .header("X-Request-Id", "$(uuidgen)")
            .contentType("application/json")
            .baseUri(baseUrl);

    public static ResponseSpecification response200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    public static ResponseSpecification response204 = new ResponseSpecBuilder()
            .expectStatusCode(204)
            .build();
}
