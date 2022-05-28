package com.todoist;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static com.todoist.AllureListener.withCustomTemplates;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        RestAssured.filters(withCustomTemplates());
    }
}
