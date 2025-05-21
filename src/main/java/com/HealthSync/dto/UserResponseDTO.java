package com.HealthSync.dto;

import com.HealthSync.model.Role;
import com.HealthSync.model.UserStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private Role role;
    private UserStatus status;
}
