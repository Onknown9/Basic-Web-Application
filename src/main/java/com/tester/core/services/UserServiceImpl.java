package com.tester.core.services;


import com.tester.core.model.User;
import com.tester.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User getUser(Long id) {
        return userRepository.getById(id);
    }
}
