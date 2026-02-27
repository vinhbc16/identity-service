package com.caovinh.identity_service.controller;

import com.caovinh.identity_service.dto.ApiResponse;
import com.caovinh.identity_service.dto.UserCreationRequest;
import com.caovinh.identity_service.dto.UserUpdateRequest;
import com.caovinh.identity_service.entity.User;
import com.caovinh.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request ){
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createRequest(request));
        return apiResponse;
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return "User with ID " + userId + " has been deleted.";
    }

    @GetMapping("/{userId}")
    User getUserById(@PathVariable String userId ){
        return userService.getUserById(userId);
    }
}
