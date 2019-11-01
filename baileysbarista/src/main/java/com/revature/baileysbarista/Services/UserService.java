package com.revature.baileysbarista.Services;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.List;

import com.revature.baileysbarista.Models.Users;
import com.revature.baileysbarista.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
 public class UserService {
    @Autowired
    UserRepository ur;
    
    public void createNew(Users user) {
		Users newUser = user;
		LocalDate date = LocalDate.now();
		newUser.setDateenrolled(date);
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
		random.nextBytes(salt);
        newUser.setSalt(salt);
        
        MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.update(salt);

			// This is stored in database in user
			byte[] hashedPassword = md.digest(newUser.getPassword().getBytes(StandardCharsets.UTF_8));
			newUser.setHash(hashedPassword);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		ur.save(newUser);
    }

	public List<Users> getAll(){
		return ur.findAll();
	}
}