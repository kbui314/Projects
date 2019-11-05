package com.revature.baileysbarista.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.revature.baileysbarista.Models.Users;
import com.revature.baileysbarista.Services.HasSkillService;
import com.revature.baileysbarista.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    @Autowired
    HasSkillService hss;
    
     @GetMapping("/all")
     public List<Users> hello(HttpSession session){
         if(session.getAttribute("userType").equals("Bailey")){
            return us.getAll();
         }
         return null;
     }
    @GetMapping("/login")
    public String login(@RequestBody Users user,HttpSession session){
        return us.login(user,session);
    }

    @GetMapping("/logout")
    public void logout(HttpSession session){
        us.logout(session);
    }

    @PostMapping("/")
    public String postNewUser(@RequestBody Users user){
        try{
            us.createNew(user);
        }catch(Exception e){
            return "Failed";
        }
        return "Success";
    }

    @GetMapping("/get/{username}")
    public Users getUser(@PathVariable String username){
        return us.getUsers(username);
    }
    @PutMapping("/endorse/{id}/{skillid}")
    public String endorseSkill(@PathVariable int id, @PathVariable int skillid, HttpSession session){
        String userType = (String)session.getAttribute("userType");
        if(userType.equals("Bailey")){
            hss.updateSkillEndorsement("verified", id, skillid);
            return "Success";
        }return "unauthorized";
    }

    @PutMapping("/unendorse/{id}/{skillid}")
    public String unendorseSkill(@PathVariable int id, @PathVariable int skillid, HttpSession session){
        String userType = (String)session.getAttribute("userType");
            if(userType.equals("Bailey")){
                hss.updateSkillEndorsement("unverified", id, skillid);
                return "Success";
            }
        return "unauthorized User";
    }
    


}