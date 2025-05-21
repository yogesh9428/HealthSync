// test/java/com.healthsync.service/UserServiceTest.java
package com.HealthSync.service;

import com.HealthSync.dto.*;
import com.HealthSync.model.*;
import com.HealthSync.repository.UserRepository;
import com.HealthSync.service.impl.UserServiceImpl;
import org.junit.jupiter.api.*;
import org.mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldCreateUserSuccessfully() {
        UserRequestDTO request = UserRequestDTO.builder()
                .fullName("John Doe")
                .email("john@example.com")
                .phone("1234567890")
                .password("pass123")
                .role("ROLE_PATIENT")
                .build();

        User mockUser = User.builder()
                .id(1L)
                .fullName("John Doe")
                .email("john@example.com")
                .phone("1234567890")
                .password("pass123")
                .role(Role.ROLE_PATIENT)
                .status(UserStatus.UNVERIFIED)
                .build();

        when(userRepository.save(any(User.class))).thenReturn(mockUser);

        UserResponseDTO response = userService.createUser(request);
        assertEquals("John Doe", response.getFullName());
        assertEquals("john@example.com", response.getEmail());
    }
}
