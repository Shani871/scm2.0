package com.scm.scm20.enities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "user")
@Table(name = "users")

public class User {
    @Id
    private String userId;
    @Column(name="user_name",nullable=false)
    
    private String email;
    private String password;
    private String about;
    private String profilePic;
    private String phoneNumber;
    // information
    private boolean enabled =false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // SELF ,Google ,Facebook 
    private Provider provider = Provider.SELF;
    private String providerId;



}
