package com.HealthSync.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestDTO {
    private String fullName;
    private String email;
    private String phone;
    private String password;
    private String role;
}
