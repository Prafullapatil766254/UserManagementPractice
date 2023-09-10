package com.example.Service;

import com.example.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserService {

    @Autowired
    ArrayList<User> users;


    public String addUser(User user) {
        users.add(user);
        return "User added successfully..";
    }

    public User getUserByEmail(String email) {
        for(User user : users){
            if(user.getUserEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
}
