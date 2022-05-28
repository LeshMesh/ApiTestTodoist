package com.todoist;

import com.todoist.models.Credentials;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.todoist.spec.Spec.*;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.is;

public class ApiTest extends TestBase {

    @Test
    @DisplayName("Получить все проекты пользователя")
    void getAllProjectsUserTest() {
        given()
                .spec(requestGet)
                .when()
                .get("/projects")
                .then()
                .spec(response200)
                .log().body();
    }

    @Test
    @DisplayName("Получить конкретный проект пользователя")
    void getProjectsUserTest() {
        given()
                .spec(requestGet)
                .when()
                .get("/projects/2292187993")
                .then()
                .spec(response200)
                .log().body()
                .body(matchesJsonSchemaInClasspath("schemas/jsonSchemaProjectResponse.json"));
    }

    @Test
    @DisplayName("Создать новый проект")
    void createNewProjectsTest() {
        Credentials credentials = new Credentials();
        credentials.setName("Shopping List");
        given()
                .spec(requestCreate)
                .body(credentials)
                .when()
                .post("/projects")
                .then()
                .spec(response200)
                .log().body()
                .body(matchesJsonSchemaInClasspath("schemas/jsonSchemaProjectResponse.json"))
                .body("name", is("Shopping List"));
    }

    @Test
    @DisplayName("Создать новую задачу")
    void createNewTaskTest() {
        Credentials credentials = new Credentials();
        credentials.setContent("Buy Milk");
        credentials.setProject_id("2292187993");

        given()
                .spec(requestCreate)
                .body(credentials)
                .when()
                .post("/tasks")
                .then()
                .spec(response200)
                .log().body()
                .body(matchesJsonSchemaInClasspath("schemas/jsonSchemaTaskResponse.json"))
                .body("content", is("Buy Milk"));
    }

    @Test
    @DisplayName("Удалить проект")
    void deleteProject() {
        Credentials credentials = new Credentials();
        credentials.setName("Delete Project");

        String id =
                given()
                        .spec(requestCreate)
                        .body(credentials)
                        .when()
                        .post("/projects")
                        .then()
                        .spec(response200)
                        .extract().jsonPath().getString("id");

        given()
                .spec(requestGet)
                .when()
                .delete("/projects/" + id)
                .then()
                .spec(response204);
    }
}
