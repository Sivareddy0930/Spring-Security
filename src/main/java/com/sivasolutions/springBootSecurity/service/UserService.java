package com.sivasolutions.springBootSecurity.service;

import com.sivasolutions.springBootSecurity.model.Users;
import com.sivasolutions.springBootSecurity.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users regetUsers( Users user ) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);

    }
}
