package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userMapper.getUserById(id);
    }

    @GetMapping("")
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @PostMapping("")
    public void insertUser(@RequestBody User user) {
        userMapper.insertUser(user);
    }

    @PutMapping("")
    public void updateUser(@RequestBody User user) {
        userMapper.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userMapper.deleteUser(id);
    }
}
