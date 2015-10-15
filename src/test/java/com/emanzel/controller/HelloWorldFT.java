package com.emanzel.controller;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;

public class HelloWorldFT {

    @Test
    public void shouldReturnHelloWorld() {
        get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello World!"));
    }
}
