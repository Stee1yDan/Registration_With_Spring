package com.example.testtask.service;

import com.example.testtask.model.User;
import com.example.testtask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService
{
    private final UserRepository userRepository;
    private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
    public void saveUser(User user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public List<User> findAll()
    {
        return userRepository.findAll();
    }
}
