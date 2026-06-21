package com.cts.springtesting;

import java.util.NoSuchElementException;

public class UserService {

    public User getUserById(Long id) {

        if (id == 1L) {
            return new User(1L, "John");
        }

        throw new NoSuchElementException("User not found");
    }
}