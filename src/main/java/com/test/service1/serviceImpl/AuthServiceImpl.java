package com.test.service1.serviceImpl;

import com.test.service1.config.JwtUtils;
import com.test.service1.dto.SignupRequest;
import com.test.service1.model.User;
import com.test.service1.repository.UserRepository;
import com.test.service1.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    JwtUtils jwtUtils;
    @Override
    public String createUser(SignupRequest signupRequest) {
        User user = new User();
        user.setUsername(signupRequest.getUsername());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
        userRepository.save(user);
        return "user is created successfully!";
    }

    @Override
    public String generateToken(String username) {
        return jwtUtils.generateToken(username);
    }

    @Override
    public void validateToken(String token) {
        jwtUtils.validateToken(token);
    }
}
