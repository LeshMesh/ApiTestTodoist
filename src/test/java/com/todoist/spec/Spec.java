package com.todoist.spec;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class Spec {
    public static RequestSpecification requestGet = with()
            .header("Authorization", "Bearer f6195222fbd6bc99cb759160cbdda6d13ea33915")
            .baseUri("https://api.todoist.com/rest/v1");

    public static RequestSpecification requestCreate = with()
            .header("Authorization", "Bearer f6195222fbd6bc99cb759160cbdda6d13ea33915")
            .header("X-Request-Id", "$(uuidgen)")
            .contentType("application/json")
            .baseUri("https://api.todoist.com/rest/v1");

    public static ResponseSpecification response200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    public static ResponseSpecification response204 = new ResponseSpecBuilder()
            .expectStatusCode(204)
            .build();
}
