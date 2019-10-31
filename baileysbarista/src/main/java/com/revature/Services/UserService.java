package com.revature.Services;

import com.revature.Models.Users;
import com.revature.Repositories.UserRepository;
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
        ur.save(user);
    }
}