package com.example.miniprojet.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class UserDto {
    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Email is required")
    private String email;

    private boolean active;
    private String role;
}

