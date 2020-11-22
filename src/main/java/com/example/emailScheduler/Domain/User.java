package com.example.emailScheduler.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String firstName;
    private String lastName;
    private String emailAddress;


}
