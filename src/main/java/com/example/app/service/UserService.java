package com.example.app.service;

import com.example.app.entity.User;
import com.example.app.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
@Autowired
private UserRepo userRepo;


    public User createUser(User user) {
        return userRepo.save(user);
    }
}
