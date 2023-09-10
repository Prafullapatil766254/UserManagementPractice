package com.example.Controller;

import com.example.Entity.User;
import com.example.Service.UserService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser( @Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("user/email")
    public User getUserByEmail( @RequestParam String email){
        return userService.getUserByEmail(email);
    }
}
