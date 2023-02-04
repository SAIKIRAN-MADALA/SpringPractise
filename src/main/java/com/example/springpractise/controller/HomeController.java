package com.example.springpractise.controller;

import com.example.springpractise.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private static final String EMAIL_ID = "sai@gmail.com";
    private static final String FIRST_NAME = "madala";
    private static final String LAST_NAME = "SAI";
    private static final String USER_ID = "1234";

    @GetMapping("/home")
    public String Home(){
        return "Welcome_Home";
    }
    @GetMapping("/user")
    public User user_Profile(){
        return get_User();
    }

    @GetMapping("/home/{id}/{id2}")
    public String path_Variable(@PathVariable String id,
                               @PathVariable("{id2}") String name
                                ){
        return "Path Variable Id: "+id +"name" +name;
    }

    /*
    /Used when it is mandatory
     */
    @GetMapping("/requestParam")
    public String requestMapping( @RequestParam String name ,
                                  @RequestParam(
                                          name = "email" ,
                                          required = false ,
                                          defaultValue = "support@gmail.com") String email_id )
    {
        return "Your name is " +name+"Your email_id is" + email_id;
    }

    public User get_User(){
        return User.builder()
                .emailId(EMAIL_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .userId(USER_ID)
                .build();
    }

}
