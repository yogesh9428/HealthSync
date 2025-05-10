package com.HealthSync.service;

import com.HealthSync.dto.UserRequestDTO;
import com.HealthSync.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO request);
    UserResponseDTO getUserById(Long id);
    List<UserResponseDTO> getAllUsers();
}
