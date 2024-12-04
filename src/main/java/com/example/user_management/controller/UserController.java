package com.example.user_management.controller;

import com.example.user_management.dto.UpdateDTO;
import com.example.user_management.dto.UserDTO;
import com.example.user_management.dto.UserResponse;
import com.example.user_management.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Create User
    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserDTO userDTO) {
        UserResponse createdUser = userService.createUser(userDTO);
        return ResponseEntity.ok(createdUser);
    }

    // Get all users for admin
    @GetMapping
    public ResponseEntity<List<UserResponse>> getALlUsers() {
        List<UserResponse> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    // Get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserResponse>> getUserById(@PathVariable Long id) {
        Optional<UserResponse> userResponse = userService.getUserById(id);
        return ResponseEntity.ok(userResponse);
    }

    @PutMapping("/{id}")
    // Update user by ID
    public ResponseEntity<UserResponse> updateUser(@PathVariable Long id, @Valid @RequestBody UpdateDTO updateDTO) {
        UserResponse updateUser = userService.updateUser(id, updateDTO);
        return ResponseEntity.ok(updateUser);
    }

    // Delete user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully!");
    }
}
