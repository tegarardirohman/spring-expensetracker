package org.enigmacamp.expensetracker2.service;

import org.enigmacamp.expensetracker2.model.entity.User;

public interface UserService {
    public User registerUser(User user);

    public User loginUser(String username, String password);

}