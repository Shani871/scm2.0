package com.scm.scm20.enities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    @Id
    private String userId;
    @Column(name="user_name",nullable=false)
    private String name;
    @Column(unique = true, nullable =false)
    private String email;
    private String password;
    @Column(length=10000)
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

    // add more fileds if needed
    @OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
    private List< Contact> contact = new ArrayList<>();

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
    private List<SocialLink> links = new ArrayList<>();

}
