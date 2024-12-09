package com.example.miniprojet.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserCreationDto extends UserDto {
    @NotBlank(message = "Password is required")
    private String password;
}
