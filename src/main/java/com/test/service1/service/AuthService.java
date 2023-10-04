package com.test.service1.service;

import com.test.service1.dto.SignupRequest;

public interface AuthService {
    String createUser(SignupRequest signupRequest);

    String generateToken(String username);

    void validateToken(String token);
}
