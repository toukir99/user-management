package com.example.user_management.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDTO {
    @NotBlank(message = "Name is required!")
    private String name;

    @NotBlank(message = "Email is required!")
    @Email(message = "Email must be a valid email address!")
    private String email;

    @NotNull(message = "Password is required!")
    @Size(min = 8, message = "Password must be at least 8 characters!")
    private String password;

    private Boolean isActive = true;
}
