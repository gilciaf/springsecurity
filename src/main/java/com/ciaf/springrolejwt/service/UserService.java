package com.ciaf.springrolejwt.service;

import com.ciaf.springrolejwt.model.User;
import com.ciaf.springrolejwt.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
