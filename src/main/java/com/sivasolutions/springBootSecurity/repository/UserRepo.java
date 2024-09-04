package com.sivasolutions.springBootSecurity.repository;

import com.sivasolutions.springBootSecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}
