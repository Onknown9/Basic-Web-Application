package com.tester.core.controllers;

import com.tester.core.dto.UserDTO;
import com.tester.core.mappers.UserMapper;
import com.tester.core.model.User;
import com.tester.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    @GetMapping(value = "/hello/{id}")
    public UserDTO sayHello(@PathVariable Long id){
        User user = userService.getUser(id);
        return userMapper.toDTO(user);
    }
}