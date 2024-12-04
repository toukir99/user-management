package com.example.user_management.util;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorResponse {
    private LocalDateTime timestamp;
    private int statusCode;
    private String status;
    private String message;
    private Object errors;

    public ErrorResponse(int statusCode, String status, String message, Object errors){
        this.timestamp = LocalDateTime.now();
        this.statusCode = statusCode;
        this.status = status;
        this.message = message;
        this.errors = errors;
    }
}
