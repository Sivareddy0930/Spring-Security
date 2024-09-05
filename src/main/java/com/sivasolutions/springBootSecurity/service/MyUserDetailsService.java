package com.sivasolutions.springBootSecurity.service;

import com.sivasolutions.springBootSecurity.model.UserPrinciple;
import com.sivasolutions.springBootSecurity.model.Users;
import com.sivasolutions.springBootSecurity.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    Logger logger= LoggerFactory.getLogger(MyUserDetailsService.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("loadUserByUsername: {}", username);
        Users userObj = userRepo.findByUsername(username);

        if (userObj == null) {
            logger.error("User not found: " + username);
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        logger.info("User found: " + userObj.getUsername());
        logger.info("User found: " + userObj.getPassword());
        return new UserPrinciple(userObj);
    }

}
