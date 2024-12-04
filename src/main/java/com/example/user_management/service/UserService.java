package com.example.user_management.service;

import com.example.user_management.dto.UpdateDTO;
import com.example.user_management.dto.UserDTO;
import com.example.user_management.dto.UserResponse;
import com.example.user_management.exception.ResourceNotFoundException;
import com.example.user_management.model.User;
import com.example.user_management.repository.UserRepository;
import com.example.user_management.util.UserMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Create User
    @Transactional
    public UserResponse createUser(UserDTO userDTO) {
        User user = UserMapper.toEntity(userDTO);  // Convert DTO to Entity
        User savedUser = userRepository.save(user);  // Save the entity in the database
        return UserMapper.toResponseDTO(savedUser);  // Convert the saved entity back to DTO
    }

    // Get all users
    public List getAllUsers() {
        List <User> users = userRepository.findAll();
        return users.stream()
                .map(UserMapper::toResponseDTO)
                .toList();
    }

    // Get user by ID
    public Optional<UserResponse> getUserById(Long id) {
        Optional<User> user = Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with Id: " + id)));;
        return user.map(UserMapper::toResponseDTO);
    }
    // Update User
    public UserResponse updateUser(Long id, UpdateDTO updateDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        if (updateDTO.getName() != null) user.setName(updateDTO.getName());
        if (updateDTO.getPassword() != null) user.setPassword(updateDTO.getPassword());
        User updatedUser = userRepository.save(user);
        return UserMapper.toResponseDTO(updatedUser);
    }

    // Delete User
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("User not found with id: " + id));
        userRepository.delete(user);
    }
}
