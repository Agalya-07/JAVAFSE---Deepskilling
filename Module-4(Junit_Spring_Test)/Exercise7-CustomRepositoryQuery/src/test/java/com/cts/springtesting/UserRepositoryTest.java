package com.cts.springtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    @Test
    public void testFindByName() {

        UserRepository repository = new UserRepository();

        List<User> users = repository.findByName("John");

        assertEquals(1, users.size());
        assertEquals("John", users.get(0).getName());
    }
}