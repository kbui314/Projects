package com.revature.Controllers;

import com.revature.Models.Users;
import com.revature.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * UserController
 */

@RestController("/user")
public class UserController {
    @Autowired
    UserService us;
    
    @GetMapping
    @PostMapping("/")
    public void postNewUser(@RequestBody Users user){
        us.createNew(user);
    }

}