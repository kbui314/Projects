package com.revature.baileysbarista.Controllers;

import javax.servlet.http.HttpSession;

import com.revature.baileysbarista.Models.Classes;
import com.revature.baileysbarista.Services.ClassesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassesController
 */
@RestController
@RequestMapping("class")
public class ClassesController {

    @Autowired
    ClassesService cs;
    @PostMapping("/create")
    public String CreateClass(@RequestBody Classes classes, HttpSession session) {
        String userType = (String)session.getAttribute("userType");
        
        if(userType.equals("Bailey")){
            System.out.println("Imhere");
            cs.createClasses(classes);
            return ("Success");
        }
        return (userType);
    }
    
}