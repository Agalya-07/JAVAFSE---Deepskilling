package com.cts.springtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class GlobalExceptionHandlerTest {

    @Test
    public void testHandleNotFound() {

        GlobalExceptionHandler handler =
                new GlobalExceptionHandler();

        String result =
                handler.handleNotFound(
                        new NoSuchElementException())
                        .getBody();

        assertEquals("User not found", result);
    }
}