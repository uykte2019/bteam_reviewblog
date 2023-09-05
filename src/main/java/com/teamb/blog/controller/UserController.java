package com.teamb.blog.controller;

import com.teamb.blog.model.User;
import com.teamb.blog.service.IUserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviewblog/api/v1/user")
public class UserController {
    @Autowired
    private IUserService  iUserService;

    // Test
//    @GetMapping("")
//    public String test(){
//        return "timoday";
//    }

    // API add user
    @PostMapping("")
    public User registerUser(@RequestBody User user){
        return iUserService.registerUser(user);
    }

    // API update user
    @PutMapping("")
    public User updateUser(@RequestParam("username") String username, @RequestBody User user){
        return iUserService.updateUser(username, user);
    }

    // API delete user
    @DeleteMapping("")
    public boolean deleteUser(@RequestParam("username") String username){
        return iUserService.deleteUser(username);
    }

    // API get user
    @GetMapping("")
    public ResponseEntity<List<User>> getUser(@RequestParam("username") String username){
        return iUserService.getUser(username);
    }
}
