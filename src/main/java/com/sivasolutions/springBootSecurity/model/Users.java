package com.sivasolutions.springBootSecurity.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private int id;
    private String username;
    private String password;
}
