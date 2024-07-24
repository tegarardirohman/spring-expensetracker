package org.enigmacamp.expensetracker2.service.impl;

import org.enigmacamp.expensetracker2.model.entity.User;
import org.enigmacamp.expensetracker2.repository.UserRepository;
import org.enigmacamp.expensetracker2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}