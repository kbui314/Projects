package com.revature.baileysbarista.Controllers;

import java.util.List;

import com.revature.baileysbarista.Models.Users;
import com.revature.baileysbarista.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * UserController
 */

@RestController
@RequestMapping(path="user")
public class UserController {

    @Autowired
    UserService us;
    
    @GetMapping("/")
    public List<Users> hello(){
        return us.getAll();
    }

    @PostMapping("/")
    public void postNewUser(@RequestBody Users user){
        System.out.println("hello");
        us.createNew(user);
    }

}