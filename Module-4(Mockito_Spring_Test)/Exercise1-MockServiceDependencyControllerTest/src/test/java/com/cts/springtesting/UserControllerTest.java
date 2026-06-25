package com.cts.springtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetUser() {

        User user = new User(1L, "John");

        when(userService.getUserById(1L))
                .thenReturn(user);

        ResponseEntity<User> response =
                userController.getUser(1L);

        assertEquals("John",
                response.getBody().getName());
    }
}