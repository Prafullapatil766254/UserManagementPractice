package com.example.Repository;


import com.example.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class userRepository {

    @Bean
 public ArrayList<User> getList(){

        ArrayList<User> users = new ArrayList<>();
        User user = new User(1 , "Bhushan" , "bhushan@gmail.com");
        users.add(user);
        return users;
 }
}
