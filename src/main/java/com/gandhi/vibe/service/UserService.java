package com.gandhi.vibe.service;

import com.gandhi.vibe.dto.UserRequestDto;
import com.gandhi.vibe.entity.User;

import java.util.List;

public interface UserService {
    User createUser(UserRequestDto request);
    List<User> getAllUsers();
    User getUserById(Long id);
}
