package com.cts.springtesting;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class UserServiceExceptionTest {

    @Test
    public void testUserNotFound() {

        UserService userService = new UserService();

        assertThrows(NoSuchElementException.class, () -> {
            userService.getUserById(2L);
        });
    }
}