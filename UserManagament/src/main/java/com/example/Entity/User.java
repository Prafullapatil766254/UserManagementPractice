package com.example.Entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.StandardException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;
    private String userName;
    @Email
    private String userEmail;
}
