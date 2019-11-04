package com.revature.baileysbarista.Services;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpSession;

import com.revature.baileysbarista.Models.Users;
import com.revature.baileysbarista.Repositories.UserRepository;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
 public class UserService {
    @Autowired
    UserRepository ur;
	
	@Autowired
	EntityManager entityManager;

	private Session getSession(){
		return entityManager.unwrap(Session.class);
	}

    public void createNew(Users user) {
		Users newUser = user;
		LocalDateTime date = LocalDateTime.now();
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

	public String login(Users user, HttpSession session){
		try{
			Users loginUser = getUsers(user.getUsername());
			byte[] userSalt = loginUser.getSalt();
			byte[] userHash = loginUser.getHash();
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			md.update(userSalt);
			byte[] hashedPassword = md.digest(user.getPassword().getBytes(StandardCharsets.UTF_8));
			if(Arrays.equals(userHash, hashedPassword)){
				System.out.println(loginUser.getUsername());
				setSession(loginUser.getId(), loginUser.getUsername(),loginUser.getUsertype(), session);
			}else{
				return "Incorrect username or password";
			}
		}catch(Exception e){
			return "Incorrect username or password";
		}
		return "success";
	}

	public List<Users> getAll(){
		return ur.findAll();
	}

	public Users getUsers(String username){
		return ur.findByUsername(username);
	}

	public void setSession(int id, String username, String userType, HttpSession session){
		session.setAttribute("id", id);
		session.setAttribute("username", username);
		session.setAttribute("userType", userType);
	}

	public void logout(HttpSession session){
		session.removeAttribute("id");
		session.removeAttribute("username");
		session.removeAttribute("userType");
	}
}