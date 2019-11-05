package com.revature.baileysbarista.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import com.revature.baileysbarista.Models.Skills;
import com.revature.baileysbarista.Services.SkillsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * SkillController
 */

@RestController
@RequestMapping("skill")
public class SkillController {
    @Autowired
    SkillsService ss;
    @PostMapping("/create")
    public String createSkill(@RequestBody Skills skill, HttpSession session) {
        String userType = (String)session.getAttribute("userType");
        
        if(userType.equals("Bailey")){
            ss.createSkill(skill);
            return ("Success");
        }
        return (userType);
      
        }
        @DeleteMapping("/delete/{id}")
        public String DeleteSkill(@PathVariable int id, HttpSession session){
            String userType = (String)session.getAttribute("userType");
            
            if(userType.equals("Bailey")){
                ss.deleteSkill(id);
                return "success";
            }
            return (userType);

    }
}