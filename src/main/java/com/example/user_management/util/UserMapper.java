package com.example.user_management.util;

import com.example.user_management.dto.UserDTO;
import com.example.user_management.dto.UserResponse;
import com.example.user_management.model.User;

public class UserMapper {
    // DTO to Entity
    public static User toEntity(UserDTO userDTO) {
        if (userDTO == null) {
            return null; // Return null or throw an exception depending on your needs
        }
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        return user;
    }

    // Entity to DTO
    public static UserDTO toDTO(User user) {
        if (user == null) {
            return null; // Return null or throw an exception depending on your needs
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }

    // Entity to UserRespons
    public static UserResponse toResponseDTO(User user) {
        if (user == null) {
            return null; // Return null or throw an exception depending on your needs
        }
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setEmail(user.getEmail());
        return userResponse;
    }
}
