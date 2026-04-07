package com.gandhi.vibe.service;

import com.gandhi.vibe.client.ExternalServiceClient;
import com.gandhi.vibe.dto.UserRequestDto;
import com.gandhi.vibe.entity.User;
import com.gandhi.vibe.repository.UserRepository;
import com.gandhi.vibe.service.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private ExternalServiceClient externalServiceClient;

    @InjectMocks
    private UserServiceImpl userService;

    private User user;
    private UserRequestDto userRequestDto;

    @BeforeEach
    void setUp() {
        user = User.builder().id(1L).username("testuser").build();
        userRequestDto = UserRequestDto.builder().username("testuser").build();
    }

    @Test
    void createUser_ShouldReturnSavedUser() {
        when(userRepository.save(any(User.class))).thenReturn(user);
        when(externalServiceClient.getExternalData()).thenReturn(Collections.emptyMap());

        User savedUser = userService.createUser(userRequestDto);

        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getUsername()).isEqualTo("testuser");
        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    void getAllUsers_ShouldReturnUserList() {
        when(userRepository.findAll()).thenReturn(List.of(user));

        List<User> users = userService.getAllUsers();

        assertThat(users).hasSize(1);
        assertThat(users.get(0).getUsername()).isEqualTo("testuser");
    }

    @Test
    void getUserById_ShouldReturnUser_WhenExists() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        User foundUser = userService.getUserById(1L);

        assertThat(foundUser).isNotNull();
        assertThat(foundUser.getId()).isEqualTo(1L);
    }
}
