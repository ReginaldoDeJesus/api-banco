package com.estudo.api_banco.controller;

import com.estudo.api_banco.domain.model.User;
import com.estudo.api_banco.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }
}
