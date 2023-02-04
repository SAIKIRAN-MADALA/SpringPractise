package com.example.springpractise.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    public String firstName;
    public String lastName;
    public String userId;
    private String emailId;
}
