package com.revature.baileysbarista.Services;

import com.revature.baileysbarista.Models.Classes;
import com.revature.baileysbarista.Repositories.ClassRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassesService
 */
@Service
public class ClassesService {
    @Autowired
    ClassRepository cr;

    public void createClasses(Classes classes) {
        // LocalDateTime startdate = LocalDateTime.now();
        // classes.setStartdate(startdate);
        cr.save(classes);
    }
    
}