package com.todoist;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static listners.CustomAllureListener.withCustomTemplates;

public class ApiTest {

    @BeforeAll
    static void beforeAll() {
        RestAssured.filters(withCustomTemplates());
    }

    @Test
    void getProjectsUserTest() {
        given()
                .when()
                .header("Authorization",  "Bearer 874af02b7ff11f095e02860c597c248e8acdda46")
                .get("https://api.todoist.com/rest/v1/projects")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void getProjectsTest() {
        given()
                .header("Authorization",  "Bearer 874af02b7ff11f095e02860c597c248e8acdda46")
                .when()
                .get("https://api.todoist.com/rest/v1/projects/2190808620")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void createNewProjectsTest() {
        String nameProject = "{\"name\": \"Shopping List2\"}";
        given()
                .header("Authorization",  "Bearer 874af02b7ff11f095e02860c597c248e8acdda46")
                .header("X-Request-Id", "$(uuidgen)")
                .contentType("application/json")
                .body(nameProject)
                .when()
                .post("https://api.todoist.com/rest/v1/projects")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    void deleteProjectsTest() {
        given()
                .header("Authorization",  "Bearer 874af02b7ff11f095e02860c597c248e8acdda46")
                .when()
                .delete("https://api.todoist.com/rest/v1/projects/2292302598")
                .then()
                .statusCode(204)
                .log().all();
    }
}
