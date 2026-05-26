package com.jeyowbie.backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeyowbie.backend.entity.User;
import com.jeyowbie.backend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;

    }

    @Override
    public User register(User usr) {
        if (userRepository.findByEmail(usr.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }
        return userRepository.save(usr);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
