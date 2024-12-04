package com.example.user_management.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UpdateDTO {
    @NotBlank(message = "Name is required!")
    private String name;

    @NotNull(message = "Password is required!")
    @Size(min = 8, message = "Password must be at least 8 characters!")
    private String password;
}
