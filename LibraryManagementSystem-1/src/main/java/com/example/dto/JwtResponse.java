package com.example.dto;

import lombok.Data;

import com.example.entities.Role;

import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String username;
    private String email;
    private Role role;
}
