package com.gandhi.vibe.service.impl;

import com.gandhi.vibe.client.ExternalServiceClient;
import com.gandhi.vibe.dto.UserRequestDto;
import com.gandhi.vibe.entity.User;
import com.gandhi.vibe.repository.UserRepository;
import com.gandhi.vibe.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ExternalServiceClient externalServiceClient;

    @Override
    @Transactional
    public User createUser(UserRequestDto request) {
        log.info("Creating user with username: {}", request.getUsername());
        
        // Contoh pemanggilan feign (opsional/demo)
        try {
            Map<String, Object> externalData = externalServiceClient.getExternalData();
            log.info("External data fetched: {}", externalData);
        } catch (Exception e) {
            log.warn("Failed to fetch external data, continuing with user creation.");
        }

        User user = User.builder()
                .username(request.getUsername())
                .build();
        
        return userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }
}
