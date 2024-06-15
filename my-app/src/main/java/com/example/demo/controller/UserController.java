package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.vo.ApiResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<User>> getUserById(@PathVariable Long id) {
        User data = userMapper.getUserById(id);
        ApiResponse<User> response = new ApiResponse<>(200, "successed", data);
		return new ResponseEntity<>(response, HttpStatus.OK);
    }
    

    @GetMapping("")
    public ResponseEntity<ApiResponse<List<User>>> getAllUsers() {
        List<User> data = userMapper.getAllUsers();
        ApiResponse<List<User>> response = new ApiResponse<>(200, "successed", data);
        return new ResponseEntity<>(response, HttpStatus.OK);
        
    }

    @PostMapping("")
    public ResponseEntity<ApiResponse<String>> insertUser(@RequestBody User user) {
        userMapper.insertUser(user);
        ApiResponse<String> response = new ApiResponse<>(200, "successed", null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<ApiResponse<String>> updateUser(@RequestBody User user) {
        userMapper.updateUser(user);
        ApiResponse<String> response = new ApiResponse<>(200, "successed", null);
        return new ResponseEntity<>(response, HttpStatus.OK);
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteUser(@PathVariable Long id) {
        userMapper.deleteUser(id);
        ApiResponse<String> response = new ApiResponse<>(200, "successed", null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
