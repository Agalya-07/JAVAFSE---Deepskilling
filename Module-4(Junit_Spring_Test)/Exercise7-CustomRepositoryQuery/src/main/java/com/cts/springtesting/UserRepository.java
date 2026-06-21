package com.cts.springtesting;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> findByName(String name) {

        List<User> users = new ArrayList<>();

        users.add(new User(1L, "John"));

        return users;
    }
}