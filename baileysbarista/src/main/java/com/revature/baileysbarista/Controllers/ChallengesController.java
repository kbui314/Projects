package com.revature.baileysbarista.Controllers;

import javax.servlet.http.HttpSession;

import com.revature.baileysbarista.Models.Challenges;
import com.revature.baileysbarista.Services.ChallengeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ChallengesController
 */
@RestController
@RequestMapping("challenge")
public class ChallengesController {

    @Autowired
    ChallengeService chs;
    @PostMapping("/create")
    public String CreateChallenge(@RequestBody Challenges challenge, HttpSession session) {
        String userType = (String)session.getAttribute("userType");
        
        if(userType.equals("Bailey")){
            chs.createChallenges(challenge);
            return ("Success");
        }
        return (userType);
    }    
}