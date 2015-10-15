package com.emanzel.controller;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {

    @Test
    public void shouldReturnHelloWorld() {
        HelloWorld hello = new HelloWorld();

        assertThat(hello.helloWorld(), is("Hello World!"));
    }
}
